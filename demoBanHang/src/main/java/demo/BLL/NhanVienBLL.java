package demo.BLL;

import demo.DAO.NhanVienDAL;
import demo.ModelDTO.NhanVien;

public class NhanVienBLL {
  NhanVienDAL nvDAL;
  public boolean ThemMoi (NhanVien nv) {
    boolean kq = nvDAL.AddNew(nv);
    return kq;
  }
  public boolean checkLogin (String tenDN, String matkhau) {
    //kiểm tra tính đúng đắn
    //nếu không nhập gì, có đúng format hay không

    //nếu thỏa mãn rồi thì ta gọi dịch vụ tầng DAL
    //...
    return nvDAL.Login(tenDN,matkhau);
  }

}
