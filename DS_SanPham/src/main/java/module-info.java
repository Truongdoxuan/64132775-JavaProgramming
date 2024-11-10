module com.example.ds_sanpham {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.sql;


  opens com.example.ds_sanpham to javafx.fxml;
  exports com.example.ds_sanpham;
}