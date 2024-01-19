package Models;

import java.util.Date;

public class HoaDon {
    private int id;
    private String ma_HD;
    private int id_NhanVien;
    private String ten_SP;
    private int id_KH;
    private String ten_KH;
    private int sdt;
    private double TongThanhToan;
    private int TinhTrangThanhToan;
    private Date NgayMua;
    private String ghiChu;

    public HoaDon() {
    }

    public HoaDon(int id, String ma_HD, int id_NhanVien, String ten_SP, int id_KH, String ten_KH, int sdt, double TongThanhToan, int TinhTrangThanhToan, Date NgayMua, String ghiChu) {
        this.id = id;
        this.ma_HD = ma_HD;
        this.id_NhanVien = id_NhanVien;
        this.ten_SP = ten_SP;
        this.id_KH = id_KH;
        this.ten_KH = ten_KH;
        this.sdt = sdt;
        this.TongThanhToan = TongThanhToan;
        this.TinhTrangThanhToan = TinhTrangThanhToan;
        this.NgayMua = NgayMua;
        this.ghiChu = ghiChu;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa_HD() {
        return ma_HD;
    }

    public void setMa_HD(String ma_HD) {
        this.ma_HD = ma_HD;
    }

    public int getId_NhanVien() {
        return id_NhanVien;
    }

    public void setId_NhanVien(int id_NhanVien) {
        this.id_NhanVien = id_NhanVien;
    }

    public String getTen_SP() {
        return ten_SP;
    }

    public void setTen_SP(String ten_SP) {
        this.ten_SP = ten_SP;
    }

    public int getId_KH() {
        return id_KH;
    }

    public void setId_KH(int id_KH) {
        this.id_KH = id_KH;
    }

    public String getTen_KH() {
        return ten_KH;
    }

    public void setTen_KH(String ten_KH) {
        this.ten_KH = ten_KH;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public double getTongThanhToan() {
        return TongThanhToan;
    }

    public void setTongThanhToan(double TongThanhToan) {
        this.TongThanhToan = TongThanhToan;
    }

    public int getTinhTrangThanhToan() {
        return TinhTrangThanhToan;
    }

    public void setTinhTrangThanhToan(int TinhTrangThanhToan) {
        this.TinhTrangThanhToan = TinhTrangThanhToan;
    }

    public Date getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(Date NgayMua) {
        this.NgayMua = NgayMua;
    }
}
