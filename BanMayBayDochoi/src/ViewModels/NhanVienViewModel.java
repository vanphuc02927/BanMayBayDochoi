/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class NhanVienViewModel {
    private int stt;
    private int id;
    private String ma_NV;
    private String ho_Ten;
    private Date ngay_sinh;
    private String tenGioiTinh;
    private int sdt;
    private String email;
    private String mat_khau;
    private String tenVaiTro;
    private String tenTrangThai;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(int stt, int id, String ma_NV, String ho_Ten, Date ngay_sinh, String tenGioiTinh, int sdt, String email, String mat_khau, String tenVaiTro, String tenTrangThai) {
        this.stt = stt;
        this.id = id;
        this.ma_NV = ma_NV;
        this.ho_Ten = ho_Ten;
        this.ngay_sinh = ngay_sinh;
        this.tenGioiTinh = tenGioiTinh;
        this.sdt = sdt;
        this.email = email;
        this.mat_khau = mat_khau;
        this.tenVaiTro = tenVaiTro;
        this.tenTrangThai = tenTrangThai;
    }

    public String getTenGioiTinh() {
        return tenGioiTinh;
    }

    public void setTenGioiTinh(String tenGioiTinh) {
        this.tenGioiTinh = tenGioiTinh;
    }

    public String getTenVaiTro() {
        return tenVaiTro;
    }

    public void setTenVaiTro(String tenVaiTro) {
        this.tenVaiTro = tenVaiTro;
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

    public String getMa_NV() {
        return ma_NV;
    }

    public void setMa_NV(String ma_NV) {
        this.ma_NV = ma_NV;
    }

    public String getHo_Ten() {
        return ho_Ten;
    }

    public void setHo_Ten(String ho_Ten) {
        this.ho_Ten = ho_Ten;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

    public String getTenTrangThai() {
        return tenTrangThai;
    }

    public void setTenTrangThai(String tenTrangThai) {
        this.tenTrangThai = tenTrangThai;
    }
    
}
