/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ASUS
 */
public class KichThuoc {
    private int id;
    private String ma_KichThuoc;
    private String KichThuoc;
    private boolean trang_thai;

    public KichThuoc() {
    }

    public KichThuoc(int id, String ma_KichThuoc, String KichThuoc, boolean trang_thai) {
        this.id = id;
        this.ma_KichThuoc = ma_KichThuoc;
        this.KichThuoc = KichThuoc;
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

    public String getMa_KichThuoc() {
        return ma_KichThuoc;
    }

    public void setMa_KichThuoc(String ma_KichThuoc) {
        this.ma_KichThuoc = ma_KichThuoc;
    }

    public String getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(String KichThuoc) {
        this.KichThuoc = KichThuoc;
    }
}
