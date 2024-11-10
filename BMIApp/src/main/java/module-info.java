module com.example.bmiapp {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.graphics;


  opens com.example.bmiapp to javafx.fxml;
  exports com.example.bmiapp;
}