package th.doxuantruong.flashquiz.th_bai4_flashquiz.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
  static public Connection getConnection(String dbName, String userMySQL, String passMySQL) {
    String url = "jdbc:mysql://localhost:3306/"+dbName;

    Connection connection;
    try {
      connection = DriverManager.getConnection(url, userMySQL,passMySQL);
      return connection;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
