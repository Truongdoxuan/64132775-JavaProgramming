package com.example.bt_vehinh;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class HelloApplication extends Canvas{
  @Override
  public void paint(Graphics g) {
    g.setColor(Color.BLUE);
    g.fillRect(50,50,100,50);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Hình");
    HelloApplication app = new HelloApplication();

    app.setSize(500,300);
    frame.add(app);
    frame.setSize(500,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}