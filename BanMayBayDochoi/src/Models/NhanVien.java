/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class NhanVien { // OK
    private int id;
    private String ma_NV;
    private String ho_Ten;
    private Date ngay_sinh;
    private boolean gioi_tinh;
    private int sdt;
    private String email;
    private String mat_khau;
    private boolean vaiTro;
    private boolean trang_thai;

    public NhanVien() {
    }

    public NhanVien(int id, String ma_NV, String ho_Ten, Date ngay_sinh, boolean gioi_tinh, int sdt, String email, String mat_khau, boolean vaiTro, boolean trang_thai) {
        this.id = id;
        this.ma_NV = ma_NV;
        this.ho_Ten = ho_Ten;
        this.ngay_sinh = ngay_sinh;
        this.gioi_tinh = gioi_tinh;
        this.sdt = sdt;
        this.email = email;
        this.mat_khau = mat_khau;
        this.vaiTro = vaiTro;
        this.trang_thai = trang_thai;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
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

    public boolean isGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(boolean gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
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

    public boolean isTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(boolean trang_thai) {
        this.trang_thai = trang_thai;
    }
}
