module th.doxuantruong.flashquiz.th_bai3_flashquizgui {
  requires javafx.controls;
  requires javafx.fxml;


  opens th.doxuantruong.flashquiz.th_bai3_flashquizgui to javafx.fxml;
  exports th.doxuantruong.flashquiz.th_bai3_flashquizgui;
}