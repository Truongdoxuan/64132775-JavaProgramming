module com.example.ql_sinhvien {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ql_sinhvien to javafx.fxml;
    exports com.example.ql_sinhvien;
}