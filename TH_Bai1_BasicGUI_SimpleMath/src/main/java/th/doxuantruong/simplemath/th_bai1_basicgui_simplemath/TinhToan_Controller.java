package th.doxuantruong.simplemath.th_bai1_basicgui_simplemath;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class TinhToan_Controller {
  //khai báo biến
  @FXML
  TextField txt_a, txt_b, txt_kq;
  @FXML
  Button btn_tinh;
  @FXML
  RadioButton rd_cong, rd_tru, rd_nhan, rd_chia;
  //hàm thực hiện
  public void tinh(ActionEvent event) {
    double a = Double.parseDouble(txt_a.getText());
    double b = Double.parseDouble(txt_b.getText());
    double ketqua = 0;

    if (rd_cong.isSelected()) {
      ketqua = a + b;
    } else if (rd_tru.isSelected()) {
      ketqua = a - b;
    } else if (rd_nhan.isSelected()) {
      ketqua = a * b;
    } else if (rd_chia.isSelected()) {
      ketqua = a / b;
    }
    txt_kq.setText(String.valueOf(ketqua));
  }
}
