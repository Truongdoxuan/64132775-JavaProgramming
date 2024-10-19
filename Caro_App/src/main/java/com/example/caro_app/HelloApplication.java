package com.example.caro_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("caro.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    //ap dung css
    scene.getStylesheets().add(getClass().getResource("/css/caro.css").toExternalForm());
    stage.setTitle("Caro Game");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}