package Models;

public class GiaoDich {
    private int id;
    private int id_HoaDon;
    private int id_LoaiGiaoDich;
    private double tien;

    public GiaoDich() {
    }

    public GiaoDich(int id, int id_HoaDon, int id_LoaiGiaoDich, double tien) {
        this.id = id;
        this.id_HoaDon = id_HoaDon;
        this.id_LoaiGiaoDich = id_LoaiGiaoDich;
        this.tien = tien;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_HoaDon() {
        return id_HoaDon;
    }

    public void setId_HoaDon(int id_HoaDon) {
        this.id_HoaDon = id_HoaDon;
    }

    public int getId_LoaiGiaoDich() {
        return id_LoaiGiaoDich;
    }

    public void setId_LoaiGiaoDich(int id_LoaiGiaoDich) {
        this.id_LoaiGiaoDich = id_LoaiGiaoDich;
    }
    
}
