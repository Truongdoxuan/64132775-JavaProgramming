module com.example.ql_sinhvien {
    requires javafx.controls;
    requires javafx.fxml;
  requires jdk.jsobject;
  requires json.simple;


  opens com.example.ql_sinhvien to javafx.fxml;
    exports com.example.ql_sinhvien;
}