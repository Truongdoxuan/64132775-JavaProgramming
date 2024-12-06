package th.doxuantruong.flashquiz.th_bai3_flashquizgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class FlashQuiz_Controller {
  //khai báo biến
  @FXML
  Button btn_cau1, btn_c, btn_cau2, btn_cau3, btn_cau4, btn_cau5, btn_cau6, btn_cau7, btn_cau8, btn_cau9, btn_cau10;
  @FXML
  Circle cir_c;
  boolean choosed = false;
  //hàm thực hiện
  public void selectQuestion(ActionEvent event) {
    defaultColor();
    Button clickedButton = (Button) event.getSource();
    clickedButton.setStyle("-fx-background-color:#11BAB7;");
  }

  public void ChangeColor(ActionEvent event) {
    btn_c.setStyle("-fx-background-color: #32CD32;");
    cir_c.setFill(Color.web("#32CD32"));

  }
  private void defaultColor() {
    btn_cau1.setStyle("-fx-background-color:#FFE135;");
    btn_cau2.setStyle("-fx-background-color:#FFE135;");
    btn_cau3.setStyle("-fx-background-color:#FFE135;");
    btn_cau4.setStyle("-fx-background-color:#FFE135;");
    btn_cau5.setStyle("-fx-background-color:#FFE135;");
    btn_cau6.setStyle("-fx-background-color:#FFE135;");
    btn_cau7.setStyle("-fx-background-color:#FFE135;");
    btn_cau8.setStyle("-fx-background-color:#FFE135;");
    btn_cau9.setStyle("-fx-background-color:#FFE135;");
    btn_cau10.setStyle("-fx-background-color:#FFE135;");
  }
}
