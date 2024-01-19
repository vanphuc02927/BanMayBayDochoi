package Models;

public class KhachHang {
    private int id;
    private String ma_KH;
    private String ten_KH;
    private boolean gioi_tinh;
    private int sdt;
    private String email;
    private String diaChi;
    private boolean trang_thai;

    public KhachHang() {
    }

    public KhachHang(int id, String ma_KH, String ten_KH, boolean gioi_tinh, int sdt, String email, String diaChi, boolean trang_thai) {
        this.id = id;
        this.ma_KH = ma_KH;
        this.ten_KH = ten_KH;
        this.gioi_tinh = gioi_tinh;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
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

    public String getMa_KH() {
        return ma_KH;
    }

    public void setMa_KH(String ma_KH) {
        this.ma_KH = ma_KH;
    }

    public String getTen_KH() {
        return ten_KH;
    }

    public void setTen_KH(String ten_KH) {
        this.ten_KH = ten_KH;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
