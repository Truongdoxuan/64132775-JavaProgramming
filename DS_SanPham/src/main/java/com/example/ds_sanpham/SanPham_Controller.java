package com.example.ds_sanpham;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.sql.ResultSet; // Sửa từ javax.xml.transform.Result thành java.sql.ResultSet
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.scene.control.cell.PropertyValueFactory;
public class SanPham_Controller {
  @FXML
  private TableView<SanPham> tbview;
  @FXML
  private TableColumn<SanPham, Integer> cl_id;
  @FXML
  private TableColumn<SanPham, String> cl_tensp;
  @FXML
  private TableColumn<SanPham, Double> cl_giasp;
  @FXML
  private TableColumn<SanPham, String> cl_mota;

  //connect mysql
  private Connection connect() {
    //url
    String url = "jdbc:mysql://localhost:3306/danhmucsp";
    String user = "root";
    String password = "";
    Connection conn = null;

    try {
      conn = DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return conn;
  }

  //lấy dữ liệu từ SQL
  private ObservableList<SanPham> getSanPhamDataFromDataBase() {
    ObservableList<SanPham> sanPhamList = FXCollections.observableArrayList();
    String sql = "SELECT id, tensp, giasp, mota FROM tblsanpham";

    try (Connection conn = connect();
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) { // Sử dụng ResultSet, không phải Result
      while (rs.next()) {
        int id = rs.getInt(1);
        String tenSanPham = rs.getString(2);
        double giaSanPham = rs.getDouble(3);
        String moTa = rs.getString(4);

        sanPhamList.add(new SanPham(id, tenSanPham, giaSanPham, moTa));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return sanPhamList;
  }

  @FXML
  public void initialize() {
    // Liên kết các cột với thuộc tính của lớp SanPham
    cl_id.setCellValueFactory(new PropertyValueFactory<>("id"));
    cl_tensp.setCellValueFactory(new PropertyValueFactory<>("tenSanPham"));
    cl_giasp.setCellValueFactory(new PropertyValueFactory<>("giaSanPham"));
    cl_mota.setCellValueFactory(new PropertyValueFactory<>("moTa"));

    // Đặt dữ liệu từ cơ sở dữ liệu vào TableView
    tbview.setItems(getSanPhamDataFromDataBase());
  }
}
