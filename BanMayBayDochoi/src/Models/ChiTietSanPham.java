package Models;

public class ChiTietSanPham {
    private int id;
    private String ma_CTSP;
    private int id_SP;
    private int id_DanhMuc;
    private int id_MauSac;
    private int id_ChatLieu;
    private int id_KichThuoc;
    private int id_Kieu_ThietKe;
    private int id_NhanHieu;
    private double donGia;
    private int soLuong;
    private boolean trangThai;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(int id, String ma_CTSP, int id_SP, int id_DanhMuc, int id_MauSac, int id_ChatLieu, int id_KichThuoc, int id_Kieu_ThietKe, int id_NhanHieu, double donGia, int soLuong, boolean trangThai) {
        this.id = id;
        this.ma_CTSP = ma_CTSP;
        this.id_SP = id_SP;
        this.id_DanhMuc = id_DanhMuc;
        this.id_MauSac = id_MauSac;
        this.id_ChatLieu = id_ChatLieu;
        this.id_KichThuoc = id_KichThuoc;
        this.id_Kieu_ThietKe = id_Kieu_ThietKe;
        this.id_NhanHieu = id_NhanHieu;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa_CTSP() {
        return ma_CTSP;
    }

    public void setMa_CTSP(String ma_CTSP) {
        this.ma_CTSP = ma_CTSP;
    }

    public int getId_SP() {
        return id_SP;
    }

    public void setId_SP(int id_SP) {
        this.id_SP = id_SP;
    }

    public int getId_DanhMuc() {
        return id_DanhMuc;
    }

    public void setId_DanhMuc(int id_DanhMuc) {
        this.id_DanhMuc = id_DanhMuc;
    }

    public int getId_MauSac() {
        return id_MauSac;
    }

    public void setId_MauSac(int id_MauSac) {
        this.id_MauSac = id_MauSac;
    }

    public int getId_ChatLieu() {
        return id_ChatLieu;
    }

    public void setId_ChatLieu(int id_ChatLieu) {
        this.id_ChatLieu = id_ChatLieu;
    }

    public int getId_KichThuoc() {
        return id_KichThuoc;
    }

    public void setId_KichThuoc(int id_KichThuoc) {
        this.id_KichThuoc = id_KichThuoc;
    }

    public int getId_Kieu_ThietKe() {
        return id_Kieu_ThietKe;
    }

    public void setId_Kieu_ThietKe(int id_Kieu_ThietKe) {
        this.id_Kieu_ThietKe = id_Kieu_ThietKe;
    }

    public int getId_NhanHieu() {
        return id_NhanHieu;
    }

    public void setId_NhanHieu(int id_NhanHieu) {
        this.id_NhanHieu = id_NhanHieu;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
