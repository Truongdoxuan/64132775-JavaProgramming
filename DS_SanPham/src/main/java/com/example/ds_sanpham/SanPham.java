package com.example.ds_sanpham;

public class SanPham {
  private Integer id;
  private String tenSanPham;
  private Double giaSanPham;
  private String moTa;

  public SanPham(Integer id, String tenSanPham, Double giaSanPham, String moTa) {
    this.id = id;
    this.tenSanPham = tenSanPham;
    this.giaSanPham = giaSanPham;
    this.moTa = moTa;
  }

  public Integer getId() {
    return id;
  }

  public String getTenSanPham() {
    return tenSanPham;
  }

  public Double getGiaSanPham() {
    return giaSanPham;
  }

  public String getMoTa() {
    return moTa;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setTenSanPham(String tenSanPham) {
    this.tenSanPham = tenSanPham;
  }

  public void setGiaSanPham(Double giaSanPham) {
    this.giaSanPham = giaSanPham;
  }

  public void setMoTa(String moTa) {
    this.moTa = moTa;
  }
}
