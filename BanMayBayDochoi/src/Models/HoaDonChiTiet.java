package Models;

public class HoaDonChiTiet {
    private int id;
    private String ma_HDCT;
    private int id_HoaDon;
    private int id_SanPhamChiTiet;
    private int soLuongSP;
    private double giaBanHienTai;
    private int trang_thai;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int id, String ma_HDCT, int id_HoaDon, int id_SanPhamChiTiet, int soLuongSP, double giaBanHienTai, int trang_thai){
        this.id = id;
        this.ma_HDCT = ma_HDCT;
        this.id_HoaDon = id_HoaDon;
        this.id_SanPhamChiTiet = id_SanPhamChiTiet;
        this.soLuongSP = soLuongSP;
        this.giaBanHienTai = giaBanHienTai;
        this.trang_thai = trang_thai;
    }

    public int getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(int trang_thai) {
        this.trang_thai = trang_thai;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa_HDCT() {
        return ma_HDCT;
    }

    public void setMa_HDCT(String ma_HDCT) {
        this.ma_HDCT = ma_HDCT;
    }

    public int getId_HoaDon() {
        return id_HoaDon;
    }

    public void setId_HoaDon(int id_HoaDon) {
        this.id_HoaDon = id_HoaDon;
    }

    public int getId_SanPhamChiTiet() {
        return id_SanPhamChiTiet;
    }

    public void setId_SanPhamChiTiet(int id_SanPhamChiTiet) {
        this.id_SanPhamChiTiet = id_SanPhamChiTiet;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public double getGiaBanHienTai() {
        return giaBanHienTai;
    }

    public void setGiaBanHienTai(double giaBanHienTai) {
        this.giaBanHienTai = giaBanHienTai;
    }
}
