package Models;

public class LoaiGiaoDich {
    private int id;
    private String ma_LoaiGiaoDich;
    private String tenGiaoDich;
    private boolean trang_thai;

    public LoaiGiaoDich() {
    }

    public LoaiGiaoDich(int id, String ma_LoaiGiaoDich, String tenGiaoDich, boolean trang_thai) {
        this.id = id;
        this.ma_LoaiGiaoDich = ma_LoaiGiaoDich;
        this.tenGiaoDich = tenGiaoDich;
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

    public String getMa_LoaiGiaoDich() {
        return ma_LoaiGiaoDich;
    }

    public void setMa_LoaiGiaoDich(String ma_LoaiGiaoDich) {
        this.ma_LoaiGiaoDich = ma_LoaiGiaoDich;
    }

    public String getTenGiaoDich() {
        return tenGiaoDich;
    }

    public void setTenGiaoDich(String tenGiaoDich) {
        this.tenGiaoDich = tenGiaoDich;
    }
    
}
