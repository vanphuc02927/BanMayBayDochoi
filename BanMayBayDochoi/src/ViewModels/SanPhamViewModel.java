/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ASUS
 */
public class SanPhamViewModel {
    private int Stt;
    
    private int id;
    private String ma_SP;
    private String ten_SP;
    private Boolean trang_Thai;
    
    private String TenTrangThai;

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(int Stt, int id, String ma_SP, String ten_SP, Boolean trang_Thai, String TenTrangThai) {
        this.Stt = Stt;
        this.id = id;
        this.ma_SP = ma_SP;
        this.ten_SP = ten_SP;
        this.trang_Thai = trang_Thai;
        this.TenTrangThai = TenTrangThai;
    }

    public int getStt() {
        return Stt;
    }

    public void setStt(int Stt) {
        this.Stt = Stt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa_SP() {
        return ma_SP;
    }

    public void setMa_SP(String ma_SP) {
        this.ma_SP = ma_SP;
    }

    public String getTen_SP() {
        return ten_SP;
    }

    public void setTen_SP(String ten_SP) {
        this.ten_SP = ten_SP;
    }

    public Boolean getTrang_Thai() {
        return trang_Thai;
    }

    public void setTrang_Thai(Boolean trang_Thai) {
        this.trang_Thai = trang_Thai;
    }

    public String getTenTrangThai() {
        return TenTrangThai;
    }

    public void setTenTrangThai(String TenTrangThai) {
        this.TenTrangThai = TenTrangThai;
    }
    
}
