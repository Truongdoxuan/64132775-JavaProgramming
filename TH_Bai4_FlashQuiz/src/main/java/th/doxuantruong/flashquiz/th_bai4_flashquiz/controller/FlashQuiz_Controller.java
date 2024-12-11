package th.doxuantruong.flashquiz.th_bai4_flashquiz.controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import th.doxuantruong.flashquiz.th_bai4_flashquiz.models.CauHoi;
import th.doxuantruong.flashquiz.th_bai4_flashquiz.utils.DatabaseConnection;

import java.sql.*;

public class FlashQuiz_Controller {
  @FXML
  private TableView<CauHoi> cauHoiTableView;
  @FXML
  private
  TableColumn<CauHoi, String> cl_cauhoi;
  @FXML
  private
  TableColumn<CauHoi, String> cl_hinh;
  @FXML
  private
  TableColumn<CauHoi, String> cl_pa1;
  @FXML
  private
  TableColumn<CauHoi, String> cl_pa2;
  @FXML
  private
  TableColumn<CauHoi, String> cl_pa3;
  @FXML
  private
  TableColumn<CauHoi, String> cl_pa4;
  @FXML
  private
  TableColumn<CauHoi, String> cl_padung;
  @FXML
  TextField txt_diem;

  private ObservableList<CauHoi> cauhoiData;
  private double diem = 0.0;
  Connection connect = DatabaseConnection.getConnection("flashquiz","root","");

  @FXML
  public void initialize() {
    cl_cauhoi.setCellValueFactory(new PropertyValueFactory<>("noiDung"));
    cl_hinh.setCellValueFactory(new PropertyValueFactory<>("hinh"));
    cl_pa1.setCellValueFactory(new PropertyValueFactory<>("pa1"));
    cl_pa2.setCellValueFactory(new PropertyValueFactory<>("pa2"));
    cl_pa3.setCellValueFactory(new PropertyValueFactory<>("pa3"));
    cl_pa4.setCellValueFactory(new PropertyValueFactory<>("pa4"));
    cl_padung.setCellValueFactory(new PropertyValueFactory<>("paDung"));
    loadData();
    hideCorrectAnswer();
    CheckAnswer();
  }

    private void loadData() {
      cauhoiData = FXCollections.observableArrayList();
      String sql = "SELECT * FROM cauhoi";
      try (Connection conn = connect;
           PreparedStatement prepared = conn.prepareStatement(sql);
           ResultSet rs = prepared.executeQuery()) {
        while (rs.next()) {
          cauhoiData.add(new CauHoi(
              rs.getString("noidung"),
              rs.getString("hinhanh"),
              rs.getString("pa1"),
              rs.getString("pa2"),
              rs.getString("pa3"),
              rs.getString("pa4"),
              rs.getString("padung")
          ));
        }
        cauHoiTableView.setItems(cauhoiData);
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    public void hideCorrectAnswer() {
      cl_padung.setCellFactory(column -> new TableCell<>() {
        @Override
        protected void updateItem(String item, boolean empty) {
          super.updateItem(item, empty);
          if (empty || item == null) {
            setText(null);
            setStyle("");
          } else {
            CauHoi question = getTableView().getItems().get(getIndex());
            if (!question.isSelected()) {
              setText("");
            } else {
              setText(item);
            }
          }
        }
      });
    }
  public void CheckAnswer() {
    Callback<TableColumn<CauHoi, String>, TableCell<CauHoi, String>> cellFactory = param -> new TableCell<>() {
      @Override
      protected void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);

        if (empty || item == null) {
          setText(null);
          setStyle("");
        } else {
          setText(item);

          CauHoi question = getTableView().getItems().get(getIndex());

          setOnMouseClicked(event -> {
            if (!question.isSelected()) {
              question.setSelected(true);

              if (item.equals(question.getPaDung())) {
                setStyle("-fx-background-color: green; -fx-text-fill: white;");
                diem += 1.0;
              } else {
                setStyle("-fx-background-color: red; -fx-text-fill: white;");
                diem -= 0.2;
              }

              txt_diem.setText(String.format("%.1f", diem));
              cauHoiTableView.refresh();
            }
          });

          if (question.isSelected()) {
            if (item.equals(question.getPaDung())) {
              setStyle("-fx-background-color: green; -fx-text-fill: white;");
            } else {
              setStyle("-fx-background-color: red; -fx-text-fill: white;");
            }
          } else {
            setStyle("");
          }
        }
      }
    };

    cl_pa1.setCellFactory(cellFactory);
    cl_pa2.setCellFactory(cellFactory);
    cl_pa3.setCellFactory(cellFactory);
    cl_pa4.setCellFactory(cellFactory);
  }


}
