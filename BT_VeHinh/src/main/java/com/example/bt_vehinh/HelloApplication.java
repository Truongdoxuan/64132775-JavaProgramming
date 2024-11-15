package com.example.bt_vehinh;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

import java.io.IOException;


public class HelloApplication extends Application {
  @FXML
  Canvas canvas;
  @FXML
  Button btn_draw;

  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("draw.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("Vẽ hình khi nhấn nút vẽ");
    stage.setScene(scene);
    stage.show();
  }

  @FXML
  public void draw() {
    GraphicsContext g = canvas.getGraphicsContext2D();
    //hình tròn khuất
    g.setFill(Color.WHITE);
    g.setStroke(Color.BLACK);
    g.setLineWidth(2);
    g.fillOval(150,120,100,100);
    g.strokeOval(150,120,100,100);


    //tam giác lớn
    g.setFill(Color.WHITE);
    g.setStroke(Color.BLACK); //màu viền
    g.setLineWidth(2); //độ dày viền
    g.fillPolygon( //tô bên trong
        new double[]{100, 200, 300},
        new double[]{150, 50, 150},
        3 //số đỉnh
    );
    g.strokePolygon( // Vẽ viền
        new double[]{100, 200, 300},
        new double[]{150, 50, 150},
        3
    );

    //2 tam giác nhỏ 2 bên
    g.strokePolygon(
        new double[]{150, 140, 175},
        new double[]{100, 50, 75},
        3
    );
    g.strokePolygon(
        new double[]{250, 260, 225},
        new double[]{100, 50, 75},
        3
    );

    //tam giác đỏ bên trong
    g.setStroke(Color.RED);
    g.strokePolygon(
        new double[]{180, 200, 220},
        new double[]{100, 130, 100},
        3
    );

    //2 hình tròn nhỏ
    g.setFill(Color.WHITE);
    g.setStroke(Color.BLACK);
    g.fillOval(150, 200, 40, 40);
    g.strokeOval(150, 200, 40, 40); //chân trái

    g.fillOval(210,200,40,40);
    g.strokeOval(210,200,40,40); //chân phải

    // 2 nửa hình tròn đỏ mini
    g.setStroke(Color.RED);
    //trái
    g.strokeArc(155, 225, 15, 15, 90, 180, ArcType.OPEN);
    g.strokeArc(165, 225, 15, 15, 270, 180, ArcType.OPEN);

    //phải
    g.strokeArc(225, 225, 15, 15, -90, 180, ArcType.OPEN);
    g.strokeArc(215, 225, 15, 15, -270, 180, ArcType.OPEN);
  }

  public static void main(String[] args) {
    launch(args);
  }
}