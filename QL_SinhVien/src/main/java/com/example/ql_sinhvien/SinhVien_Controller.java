package com.example.ql_sinhvien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class SinhVien_Controller {
  @FXML
  Button btnaddsv, btnreload,btnsave;
  @FXML
  TextField txtname, txtyear, txtmssv;
  @FXML
  AnchorPane panehienthi;
  @FXML
  Label lbten, lbmssv, lbnamsinh;
  @FXML
  TextArea area_hienthi;
  public void themsinhvien(ActionEvent event) {
    String mssv = txtmssv.getText();
    String hoten = txtname.getText();
    String namsinh = txtyear.getText();

    JSONObject jsonStudent = new JSONObject();
    jsonStudent.put("Ma so sinh vien: ", mssv);
    jsonStudent.put("Ho va ten: ", hoten);
    jsonStudent.put("Nam sinh: ", namsinh);

    JSONArray jsonArrayStudent = new JSONArray();
    jsonArrayStudent.add(jsonStudent);
    area_hienthi.setText(jsonArrayStudent.toJSONString());
  }

  public void hienthi(ActionEvent event) {

  }

  public void luuthongtin(ActionEvent event) {

  }

  public void taithongtin(ActionEvent event) {

  }
}
