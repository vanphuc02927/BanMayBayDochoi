package BUS;

import DAO.HoaDonChiTietRepo;
import DAO.IHoaDonChiTietRepo;
import Models.HoaDonChiTiet;
import ViewModels.HoaDonChiTietViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class QLHoaDonCTService implements IQLHoaDonCTService{
    
    IHoaDonChiTietRepo iHoaDonChiTietRepo;
    List<HoaDonChiTietViewModel> lstHoaDonChiTiet;

    public QLHoaDonCTService(){
        iHoaDonChiTietRepo = new HoaDonChiTietRepo();
    }
    
    @Override
    public boolean insert(HoaDonChiTiet hdct) {
        return iHoaDonChiTietRepo.insert(hdct);
    }

    @Override
    public boolean update(HoaDonChiTiet hdct) {
        return iHoaDonChiTietRepo.update(hdct);
    }

    @Override
    public boolean delete(String Ma_HDCT) {
        return iHoaDonChiTietRepo.delete(Ma_HDCT);    
    }

    @Override
    public List<HoaDonChiTietViewModel> getData_SPView() {
        if (iHoaDonChiTietRepo.getAllData_HDCT().isEmpty()) {
            return new ArrayList<>();
        }
        lstHoaDonChiTiet = new ArrayList<>();
        int stt = 1;
        for(HoaDonChiTiet x : iHoaDonChiTietRepo.getAllData_HDCT()){
            HoaDonChiTietViewModel y = new HoaDonChiTietViewModel();
            y.setStt(stt);
            y.setId(x.getId());
            y.setMa_HDCT(x.getMa_HDCT());
            y.setId_HoaDon(x.getId_HoaDon());
            y.setId_SanPhamChiTiet(x.getId_SanPhamChiTiet());
            y.setSoLuongSP(x.getSoLuongSP());
            y.setGiaBanHienTai(x.getGiaBanHienTai());
            y.setTenTrangThai(x.getTrang_thai() == 1 ? "Đã thanh toán":"Chưa thanh toán");
            lstHoaDonChiTiet.add(y);
            stt++;
        }
        return lstHoaDonChiTiet;
    }

    @Override
    public List<HoaDonChiTiet> getData_SP() {
        return iHoaDonChiTietRepo.getAllData_HDCT();
    }   
}
