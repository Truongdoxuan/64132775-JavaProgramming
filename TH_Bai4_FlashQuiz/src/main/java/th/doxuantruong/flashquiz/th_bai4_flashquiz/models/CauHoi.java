package th.doxuantruong.flashquiz.th_bai4_flashquiz.models;

public class CauHoi {
  private String noiDung;
  private String hinh;
  private String pa1;
  private String pa2;
  private String pa3;
  private String pa4;
  private String paDung;
  private boolean selected;

  public CauHoi(String noiDung, String hinh, String pa1, String pa2, String pa3, String pa4, String paDung) {
    this.noiDung = noiDung;
    this.hinh = hinh;
    this.pa1 = pa1;
    this.pa2 = pa2;
    this.pa3 = pa3;
    this.pa4 = pa4;
    this.paDung = paDung;
    this.selected = false;
  }

  public String getNoiDung() {
    return noiDung;
  }

  public String getHinh() {
    return hinh;
  }

  public String getPa1() {
    return pa1;
  }

  public String getPa2() {
    return pa2;
  }

  public String getPa3() {
    return pa3;
  }

  public String getPa4() {
    return pa4;
  }

  public String getPaDung() {
    return paDung;
  }

  public boolean isSelected() {
    return selected;
  }

  public void setSelected(boolean selected) {
    this.selected = selected;
  }
}
