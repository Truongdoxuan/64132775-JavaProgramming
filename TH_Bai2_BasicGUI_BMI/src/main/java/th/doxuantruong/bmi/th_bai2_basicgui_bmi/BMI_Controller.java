package th.doxuantruong.bmi.th_bai2_basicgui_bmi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class BMI_Controller {
  //khai báo biến
  @FXML
  TextField txt_cc, txt_cn, txt_kq;
  @FXML
  Label txt_cmt;
  @FXML
  RadioButton rd_isasia;
  @FXML
  Button btn_tinh;
  //hàm thực hiện
  public void tinh_bmi(ActionEvent event) {
    double chieucao = Double.parseDouble(txt_cc.getText());
    double cannang = Double.parseDouble(txt_cn.getText());
    double bmi = cannang / (chieucao * chieucao);
    txt_kq.setText(String.format("%.2f",bmi));
    String nhanxet;

    if (rd_isasia.isSelected()) {
      if (bmi < 18.5) {
        nhanxet = "Gầy";
      }
      else if (bmi <23) {
        nhanxet = "Bình thường";
      }
      else if (bmi < 27.5) {
        nhanxet = "Thừa cân";
      }
      else nhanxet = "Béo phì";
    }
    else {
      if (bmi <18.5) {
        nhanxet = "Gầy";
      } else if (bmi < 23) {
        nhanxet = "Bình thường";
      } else if (bmi < 30) {
        nhanxet = "Thừa cân";
      }
      else nhanxet = "Béo phì";
    }

    txt_cmt.setText(nhanxet);
  }
}
