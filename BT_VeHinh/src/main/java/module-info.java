module com.example.bt_vehinh {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.bt_vehinh to javafx.fxml;
  exports com.example.bt_vehinh;
}