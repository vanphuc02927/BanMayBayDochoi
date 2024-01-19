package Models;

public class MauSac {
    private int id;
    private String ma_MauSac;
    private String ten_MauSac;
    private boolean trang_thai;

    public MauSac() {
    }

    public MauSac(int id, String ma_MauSac, String ten_MauSac, boolean trang_thai) {
        this.id = id;
        this.ma_MauSac = ma_MauSac;
        this.ten_MauSac = ten_MauSac;
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

    public String getMa_MauSac() {
        return ma_MauSac;
    }

    public void setMa_MauSac(String ma_MauSac) {
        this.ma_MauSac = ma_MauSac;
    }

    public String getTen_MauSac() {
        return ten_MauSac;
    }

    public void setTen_MauSac(String ten_MauSac) {
        this.ten_MauSac = ten_MauSac;
    }
    
}
