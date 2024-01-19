/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

public class KieuThietKe {
    private int id;
    private String ma_ThietKe;
    private String moTa_ThietKe;
    private boolean trang_thai;

    public KieuThietKe() {
    }

    public KieuThietKe(int id, String ma_ThietKe, String moTa_ThietKe, boolean trang_thai) {
        this.id = id;
        this.ma_ThietKe = ma_ThietKe;
        this.moTa_ThietKe = moTa_ThietKe;
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
    
}
