package th.doxuantruong.simpledict.th5_simpledict;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Dict_Controller {

  @FXML
  private TextField txt_eng; // TextField để nhập từ Tiếng Anh
  @FXML
  private TextField txt_phienam; // TextField để hiển thị phiên âm
  @FXML
  private TextField txt_vie; // TextField để hiển thị nghĩa Tiếng Việt
  @FXML
  private Label lb_eng_text; // Label để hiển thị từ Tiếng Anh
  @FXML
  private Button btn_search; // Button để thực hiện tìm kiếm

  private Dict_Value dictionary; // Đối tượng từ điển

  @FXML
  public void initialize() {
    dictionary = new Dict_Value(); // Tạo đối tượng Dict_Value chứa dữ liệu
  }

  @FXML
  private void translate() {
    String eng = txt_eng.getText().trim();
    Dict_Value.PhienAm word = dictionary.value.get(eng);

    if (word != null) {
      lb_eng_text.setText(eng);
      txt_phienam.setText(word.phienam);
      txt_vie.setText(word.nghia);
    } else {
      lb_eng_text.setText(eng);
      txt_vie.setText("Không tìm thấy trong từ điển!");
      txt_phienam.setText("");
    }
  }
}
