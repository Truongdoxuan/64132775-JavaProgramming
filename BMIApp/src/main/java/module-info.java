module com.example.bmiapp {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.bmiapp to javafx.fxml;
  exports com.example.bmiapp;
}