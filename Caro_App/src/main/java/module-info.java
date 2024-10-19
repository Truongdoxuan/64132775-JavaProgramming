module com.example.caro_app {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.caro_app to javafx.fxml;
  exports com.example.caro_app;
}