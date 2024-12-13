module th.doxuantruong.simpledict.th5_simpledict {
  requires javafx.controls;
  requires javafx.fxml;


  opens th.doxuantruong.simpledict.th5_simpledict to javafx.fxml;
  exports th.doxuantruong.simpledict.th5_simpledict;
}