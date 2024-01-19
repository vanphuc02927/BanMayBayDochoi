/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.INhanVienRepo;
import DAO.NhanVienRepo;
import Models.NhanVien;
import ViewModels.NhanVienViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class QLNhanVienService implements IQLNhanVienService{
    
    INhanVienRepo iNhanVienRepo;
    List<NhanVienViewModel> lstNhanVienView;

    public QLNhanVienService(){
        iNhanVienRepo = new NhanVienRepo();
    }
    
    @Override
    public boolean insert(NhanVien nv) { // Chưa Hoàn thiện
        return iNhanVienRepo.insert(nv);
    }

    @Override
    public boolean update(NhanVien nv) { // Chưa Hoàn thiện
        return iNhanVienRepo.update(nv);
    }

    @Override
    public boolean delete(String Ma_NV) { // Chưa Hoàn thiện
        return iNhanVienRepo.delete(Ma_NV);
    }

    @Override
    public List<NhanVienViewModel> getData_SPView() {
        if (iNhanVienRepo.getAllData_NV().isEmpty()) {
            return new ArrayList<>();
        }
        lstNhanVienView = new ArrayList<>();
        int stt = 1;
        
        for (NhanVien x : iNhanVienRepo.getAllData_NV()) {
            NhanVienViewModel y = new NhanVienViewModel();
            y.setStt(stt);
            y.setId(x.getId());
            y.setMa_NV(x.getMa_NV());
            y.setHo_Ten(x.getHo_Ten());
            y.setNgay_sinh(x.getNgay_sinh());
            y.setTenGioiTinh(x.isGioi_tinh() ? "Nam" : "Nữ");
            y.setSdt(x.getSdt());
            y.setEmail(x.getEmail());
            y.setMat_khau(x.getMat_khau());
            y.setTenVaiTro(x.isVaiTro() ? "Nhân viên":"Quản lý");
            y.setTenTrangThai(x.isTrang_thai() ? "Đang làm":"Nghỉ làm");
            lstNhanVienView.add(y);
            stt++;
        }
        return lstNhanVienView;
    }

    @Override
    public List<NhanVien> getData_SP() { // Chưa Hoàn thiện
        return iNhanVienRepo.getAllData_NV();
    }    
}
