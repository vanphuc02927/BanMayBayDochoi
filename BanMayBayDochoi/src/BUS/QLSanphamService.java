package BUS;

import DAO.ISanPhamRepo; //*
import DAO.SanPhamRepo;
import Models.SanPham;
import ViewModels.SanPhamViewModel;
import java.util.ArrayList;
import java.util.List;

public class QLSanphamService implements IQLSanPhamService{ // Chức năng hiển thị của Java // Thứ 4
    
    ISanPhamRepo iSanPhamRepo; // Interface của DAO
    List<SanPhamViewModel> lstSanPhamView;

    public QLSanphamService(){
        iSanPhamRepo = new SanPhamRepo(); // Móc nối
    }
    
    @Override
    public boolean insert(SanPham sp) { // Chưa Hoàn thiện
        return iSanPhamRepo.insert(sp);
    }

    @Override
    public boolean update(SanPham sp) { // Chưa Hoàn thiện
        return iSanPhamRepo.update(sp);
    }

    @Override
    public boolean delete(String Ma_SP) { // Chưa Hoàn thiện
        return iSanPhamRepo.delete(Ma_SP);
    }

    @Override
    public List<SanPhamViewModel> getData_SPView() {
        if (iSanPhamRepo.getAllData_SP().isEmpty()) {
            return new ArrayList<>();
        }
        lstSanPhamView = new ArrayList<>();
        int stt = 1;
        
        for (SanPham x : iSanPhamRepo.getAllData_SP()){
            SanPhamViewModel y = new SanPhamViewModel(); // ViewModels: hiển thỉ
            y.setStt(stt);
            y.setId(x.getID());
            y.setMa_SP(x.getMA_SP());
            y.setTenTrangThai(x.getTrang_Thai() ? "Còn hàng" : "Hết hàng"); // Chú ý
            lstSanPhamView.add(y);
            stt++;
        }
        return lstSanPhamView;
    }
    
    @Override
    public List<SanPham> getData_SP() {
        return iSanPhamRepo.getAllData_SP(); // Chưa Hoàn thiện
    }
    //  Là Nơi Gọi Đến Các Service Ở Tầng DAO 
    //  Không Được Phép Gọi Trực Tiếp Các File Ở Class Các Tầng
    //  Phải Gọi Thông quá interface 
}
