module com.example.api_app {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.api_app to javafx.fxml;
  exports com.example.api_app;
}