module th.doxuantruong.flashquiz.th_bai4_flashquiz {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.sql;


  opens th.doxuantruong.flashquiz.th_bai4_flashquiz to javafx.fxml;
  exports th.doxuantruong.flashquiz.th_bai4_flashquiz;
  exports th.doxuantruong.flashquiz.th_bai4_flashquiz.models;
  opens th.doxuantruong.flashquiz.th_bai4_flashquiz.models to javafx.fxml;
  exports th.doxuantruong.flashquiz.th_bai4_flashquiz.controller;
  opens th.doxuantruong.flashquiz.th_bai4_flashquiz.controller to javafx.fxml;
}