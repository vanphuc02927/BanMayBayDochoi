/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ASUS
 */
public class LoaiSP {
    private int id;
    private String ma_LoaiSP;
    private String ten_DanhMucSP;
    private boolean trang_thai;

    public LoaiSP() {
    }

    public LoaiSP(int id, String ma_LoaiSP, String ten_DanhMucSP, boolean trang_thai) {
        this.id = id;
        this.ma_LoaiSP = ma_LoaiSP;
        this.ten_DanhMucSP = ten_DanhMucSP;
        this.trang_thai = trang_thai;
    }

    public boolean isTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(boolean trang_thai) {
        this.trang_thai = trang_thai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa_LoaiSP() {
        return ma_LoaiSP;
    }

    public void setMa_LoaiSP(String ma_LoaiSP) {
        this.ma_LoaiSP = ma_LoaiSP;
    }

    public String getTen_DanhMucSP() {
        return ten_DanhMucSP;
    }

    public void setTen_DanhMucSP(String ten_DanhMucSP) {
        this.ten_DanhMucSP = ten_DanhMucSP;
    }
}
