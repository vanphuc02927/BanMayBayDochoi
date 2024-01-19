package BUS;

import DAO.IKieuThietKeRepo;
import DAO.KieuThietKeRepo;
import Models.KieuThietKe;
import ViewModels.KieuThietKeViewModel;
import java.util.ArrayList;
import java.util.List;

public class QLThietKeService implements IQLThietKeService{

    IKieuThietKeRepo iKieuThietKeRepo;
    List<KieuThietKeViewModel> lstThietKeView;
    
    public QLThietKeService(){
        iKieuThietKeRepo = new KieuThietKeRepo();
    }
    
    @Override
    public boolean insert(KieuThietKe ktk) {
        return iKieuThietKeRepo.insert(ktk);
    }

    @Override
    public boolean update(KieuThietKe ktk) {
        return iKieuThietKeRepo.update(ktk);    
    }

    @Override
    public boolean delete(String Ma_tk) {
        return iKieuThietKeRepo.delete(Ma_tk);    
    }

    @Override
    public List<KieuThietKeViewModel> getData_SPView(){
        if (iKieuThietKeRepo.getAllData_HDCT().isEmpty()) {
            return new ArrayList<>();
        }
        lstThietKeView = new ArrayList<>();
        int stt = 1;
        
        for (KieuThietKe x : iKieuThietKeRepo.getAllData_HDCT()){
            KieuThietKeViewModel y = new KieuThietKeViewModel(); // ViewModels: hiển thỉ
            y.setStt(stt);
            y.setId(x.getId());
            y.setMa_ThietKe(x.getMa_ThietKe());
            y.setTenTrangThai(x.isTrang_thai() ? "Còn Hàng":"Hết hàng");
            lstThietKeView.add(y);
            stt++;
        }
        return lstThietKeView;
    }

    @Override
    public List<KieuThietKe> getData_SP(){
        return iKieuThietKeRepo.getAllData_HDCT();
    }
    
}
