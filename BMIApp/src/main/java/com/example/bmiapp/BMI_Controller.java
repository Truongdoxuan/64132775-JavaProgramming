package com.example.bmiapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMI_Controller {
  @FXML
  TextField txtCC, txtCN;
  @FXML
  Label lbKQ, lbNhanXet;
  float BMI;
  public void tinhBMI(ActionEvent event) {
      float chieucao = Float.parseFloat(txtCC.getText())/100;
      float cannang = Float.parseFloat(txtCN.getText());
      BMI = cannang / (chieucao * chieucao);
      String KQ = String.format("%.2f",BMI);
      lbKQ.setText(KQ);
      inNhanXet();
  }
  public void inNhanXet() {
    if (BMI < 18.5f) {
      lbNhanXet.setText("Bạn có cân nặng thấp (gầy)");
    }
    else if (BMI >= 18.5f && BMI < 25.0f) {
      lbNhanXet.setText("Bạn bình thường");
    }
    else lbNhanXet.setText("Bạn đang béo phì");
  }
}
