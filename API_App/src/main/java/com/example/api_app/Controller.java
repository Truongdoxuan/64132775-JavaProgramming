package com.example.api_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Controller {
  @FXML
  Button btnSearch,btnReload;
  @FXML
  TextField txtNhapURL;
  @FXML
  TextArea txtKQ;
  public void Timkiem(ActionEvent event) {
    String apiURL = txtNhapURL.getText();
    String ketqua = callApi(apiURL);
    txtKQ.setText(ketqua);
  }
  private String callApi(String apiUrl) {
    StringBuilder result = new StringBuilder();
    try {
      URL url = new URL(apiUrl);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");

      // Kiểm tra mã phản hồi
      int responseCode = conn.getResponseCode();
      if (responseCode == 200) {  // Thành công
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
          result.append(inputLine).append("\n");
        }
        in.close();
        String formattedResult = result.toString()
            .replace(",", ",\n")
            .replace("{", "{\n")
            .replace("}", "\n}");

        return formattedResult;
      } else {
        result.append("Lỗi: Phản hồi không thành công (Code: ").append(responseCode).append(")");
      }
    } catch (Exception e) {
      result.append("Lỗi: ").append(e.getMessage());
    }
    return result.toString();
  }
  public void hienthiKQ(ActionEvent event) {

  }
  public void Lammoi(ActionEvent event) {
    txtNhapURL.clear();
    txtKQ.clear();
  }
}