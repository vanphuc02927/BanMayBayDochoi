/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ASUS
 */
    // Là nơi cấu hình hiển thị theo mong muốn của sản phẩm.
    // Tại Service sẽ đổ dữ liệu vào models ở tần ViewModels.
    // Tầng View sẽ là tầng gọi ra Class để hiển thị.
    
public class HoaDonChiTietViewModel {
    private int stt;
    private int id;
    private String ma_HDCT;
    private int id_HoaDon;
    private int id_SanPhamChiTiet;
    private int soLuongSP;
    private double giaBanHienTai;
    private String tenTrangThai;

    public HoaDonChiTietViewModel() {
    }

    public HoaDonChiTietViewModel(int stt, int id, String ma_HDCT, int id_HoaDon, int id_SanPhamChiTiet, int soLuongSP, double giaBanHienTai, String tenTrangThai) {
        this.stt = stt;
        this.id = id;
        this.ma_HDCT = ma_HDCT;
        this.id_HoaDon = id_HoaDon;
        this.id_SanPhamChiTiet = id_SanPhamChiTiet;
        this.soLuongSP = soLuongSP;
        this.giaBanHienTai = giaBanHienTai;
        this.tenTrangThai = tenTrangThai;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa_HDCT() {
        return ma_HDCT;
    }

    public void setMa_HDCT(String ma_HDCT) {
        this.ma_HDCT = ma_HDCT;
    }

    public int getId_HoaDon() {
        return id_HoaDon;
    }

    public void setId_HoaDon(int id_HoaDon) {
        this.id_HoaDon = id_HoaDon;
    }

    public int getId_SanPhamChiTiet() {
        return id_SanPhamChiTiet;
    }

    public void setId_SanPhamChiTiet(int id_SanPhamChiTiet) {
        this.id_SanPhamChiTiet = id_SanPhamChiTiet;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public double getGiaBanHienTai() {
        return giaBanHienTai;
    }

    public void setGiaBanHienTai(double giaBanHienTai) {
        this.giaBanHienTai = giaBanHienTai;
    }

    public String getTenTrangThai() {
        return tenTrangThai;
    }

    public void setTenTrangThai(String tenTrangThai) {
        this.tenTrangThai = tenTrangThai;
    }
    
}
