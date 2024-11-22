package demo.DAO;

import demo.ModelDTO.NhanVien;
import demo.Utils.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class NhanVienDAL {
  Connection conn;
  public NhanVienDAL() {
    try {
      conn = DBUtils.DBConnect();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
  public boolean AddNew(NhanVien nv) {
    return true;
  }
  public boolean Delete(int id) {
    return true;
  }
  public boolean Login(String id, String matkhau) {
    return true;
  }
}
