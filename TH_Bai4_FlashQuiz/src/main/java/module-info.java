module th.doxuantruong.flashquiz.th_bai4_flashquiz {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.sql;


  opens th.doxuantruong.flashquiz.th_bai4_flashquiz to javafx.fxml;
  exports th.doxuantruong.flashquiz.th_bai4_flashquiz;
}