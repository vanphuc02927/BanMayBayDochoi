/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ASUS
 */
public class KieuThietKeViewModel {
    private int stt;
    private int id;
    private String ma_ThietKe;
    private String moTa_ThietKe;
    private String tenTrangThai;

    public KieuThietKeViewModel(int stt, int id, String ma_ThietKe, String moTa_ThietKe, String tenTrangThai) {
        this.stt = stt;
        this.id = id;
        this.ma_ThietKe = ma_ThietKe;
        this.moTa_ThietKe = moTa_ThietKe;
        this.tenTrangThai = tenTrangThai;
    }

    public KieuThietKeViewModel() {
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

    public String getMa_ThietKe() {
        return ma_ThietKe;
    }

    public void setMa_ThietKe(String ma_ThietKe) {
        this.ma_ThietKe = ma_ThietKe;
    }

    public String getMoTa_ThietKe() {
        return moTa_ThietKe;
    }

    public void setMoTa_ThietKe(String moTa_ThietKe) {
        this.moTa_ThietKe = moTa_ThietKe;
    }

    public String getTenTrangThai() {
        return tenTrangThai;
    }

    public void setTenTrangThai(String tenTrangThai) {
        this.tenTrangThai = tenTrangThai;
    }
    
}
