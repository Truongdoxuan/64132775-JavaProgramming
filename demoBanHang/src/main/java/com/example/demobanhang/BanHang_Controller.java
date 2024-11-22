package com.example.demobanhang;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import demo.Utils.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BanHang_Controller {
  @FXML
  Button btn_login;
  @FXML
  TextField txt_tendn, txt_mk;

  //kết nối database
  public void Login(ActionEvent event) {
    String ten = txt_tendn.getText();
    String mk = txt_mk.getText();
  }
}
