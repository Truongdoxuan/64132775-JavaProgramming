module com.example.demobanhang {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.sql;


  opens com.example.demobanhang to javafx.fxml;
  exports com.example.demobanhang;
}