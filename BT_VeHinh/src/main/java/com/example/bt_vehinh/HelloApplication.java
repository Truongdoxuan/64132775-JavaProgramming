package com.example.bt_vehinh;
import javafx.scene.canvas.GraphicsContext;

import javax.swing.*;
import java.awt.*;

public class HelloApplication extends Canvas{
  @Override
  public void paint(Graphics g) {
    g.setColor(Color.BLACK); //màu cho hình vẽ


    //dài rộng và tọa độ tam giác lớn
    g.drawPolygon(
        new int[]{100,200,300}, //x của 3 đỉnh tam giác
        new int[]{150,50,150}, //y của 3 đỉnh
        3 //số đỉnh
    );

    //2 tam giác đứng nhỏ 2 bên
    g.drawPolygon(
        new int[]{150,140,175}, //x của 3 đỉnh tam giác
        new int[]{100,50,75}, //y của 3 đỉnh
        3 //số đỉnh
    );
    g.drawPolygon(
        new int[]{250,260,225}, //x của 3 đỉnh tam giác
        new int[]{100,50,75}, //y của 3 đỉnh
        3 //số đỉnh
    );
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