package demo.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
  public static Connection DBConnect() throws ClassNotFoundException, SQLException {
    //Đăng ký driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    //Chuỗi kết nối
    String strConn = "jdbc:mysql://localhost:3306/dangnhap";

    //Mở kết nối
    Connection conn = DriverManager.getConnection(strConn, "root", "");

    return conn;
  }
}
