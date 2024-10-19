package com.example.caro_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Caro_Controller {
  @FXML
  private Label label00;
  @FXML
  private Label label01;
  @FXML
  private Label label02;
  @FXML
  private Label label10;
  @FXML
  private Label label11;
  @FXML
  private Label label12;
  @FXML
  private Label label20;
  @FXML
  private Label label21;
  @FXML
  private Label label22;

  //khoi tao nguoi di dau tien
  private char firstPlayer = 'X';

  //xu ly su kien khi on clicked
  @FXML
  private void handleLabelClick(MouseEvent event) {
    Label clickedLabel = (Label) event.getSource(); //nhan label da duoc nhap
    System.out.println("Label clicked: " + clickedLabel.getId()); //in ra cho ng dung de ktra

    //neu label trong nhan x or o
    if (clickedLabel.getText().isEmpty()) {
      clickedLabel.setText(String.valueOf(firstPlayer));

      //kiem tra nguoi thang
      if (checkWinner(firstPlayer)) {
//        System.out.println("Player " + firstPlayer + "is a winner !");
        showWinnerAlert(firstPlayer);
        //vo hieu hoa all label con lai
        disableAllLabels();
      } else if (isDraw()) {
        showDrawAlert();
        disableAllLabels();
      } else {
        firstPlayer = (firstPlayer == 'X') ? 'O' : 'X'; // Thay đổi người chơi
      }
    }
  }

  //phuong thuc kiem tra win
  private boolean checkWinner(char player) {
    //ktra hang ngan
    for (int row = 0; row < 3; row++) {
      if(checkRow(row, player)) {
        return true;
      }
    }
    //ktra hang doc
    for(int col = 0; col < 3; col++) {
      if(checkColumn(col, player)) {
        return true;
      }
    }
    // Ktra duong cheo
    return checkDiagonal(player);
  }
  //khoi tao chi tiet
  private boolean checkRow(int row, char player) {
    return (getLabelText(row,0) == player &&
            getLabelText(row,1) == player &&
            getLabelText(row,2) == player);
  }
  private boolean checkColumn(int col, char player) {
    return (getLabelText(0,col) == player &&
            getLabelText(1,col) == player &&
            getLabelText(2,col) == player);
  }
  //ktra duong cheo
  private boolean checkDiagonal(char player) {
    return (getLabelText(0,0) == player && getLabelText(1,1) == player && getLabelText(2,2) == player ||
            getLabelText(0,2) == player && getLabelText(1,1) == player && getLabelText(2,0) == player);
  }
  private char getLabelText(int row, int col) {
    if (row == 0) {
      if (col == 0) return label00.getText().isEmpty() ? ' ' : label00.getText().charAt(0);
      if (col == 1) return label01.getText().isEmpty() ? ' ' : label01.getText().charAt(0);
      if (col == 2) return label02.getText().isEmpty() ? ' ' : label02.getText().charAt(0);
    } else if (row == 1) {
      if (col == 0) return label10.getText().isEmpty() ? ' ' : label10.getText().charAt(0);
      if (col == 1) return label11.getText().isEmpty() ? ' ' : label11.getText().charAt(0);
      if (col == 2) return label12.getText().isEmpty() ? ' ' : label12.getText().charAt(0);
    } else if (row == 2) {
      if (col == 0) return label20.getText().isEmpty() ? ' ' : label20.getText().charAt(0);
      if (col == 1) return label21.getText().isEmpty() ? ' ' : label21.getText().charAt(0);
      if (col == 2) return label22.getText().isEmpty() ? ' ' : label22.getText().charAt(0);
    }
    return ' '; // tra ve trong neu khong tim thay
  }

  //ktra neu khong con o nao trong
  private boolean isDraw() {
    return !label00.getText().isEmpty() &&
        !label01.getText().isEmpty() &&
        !label02.getText().isEmpty() &&
        !label10.getText().isEmpty() &&
        !label11.getText().isEmpty() &&
        !label12.getText().isEmpty() &&
        !label20.getText().isEmpty() &&
        !label21.getText().isEmpty() &&
        !label22.getText().isEmpty();
  }

  //alert neu hoa nhau
  private void showDrawAlert() {
    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setTitle("Kết quả");
    alert.setHeaderText("Hòa!");
    alert.setContentText("Không còn nước đi nào!");
    alert.showAndWait();
  }
  //ham disable all labels con lai khi win
  private void disableAllLabels() {
    label00.setMouseTransparent(true);
    label01.setMouseTransparent(true);
    label02.setMouseTransparent(true);
    label10.setMouseTransparent(true);
    label11.setMouseTransparent(true);
    label12.setMouseTransparent(true);
    label20.setMouseTransparent(true);
    label21.setMouseTransparent(true);
    label22.setMouseTransparent(true);
  }

  //hien thi alert winner
  private void showWinnerAlert(char player) {
    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setTitle("Kết quả");
    alert.setHeaderText("Người chơi " + player + " đã thắng!");
    alert.setContentText("Chúc mừng!");
    alert.showAndWait();
  }

}
