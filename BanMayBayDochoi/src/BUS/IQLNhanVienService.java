/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BUS;

import Models.NhanVien;
import ViewModels.NhanVienViewModel;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IQLNhanVienService {
    public boolean insert(NhanVien nv);
    public boolean update(NhanVien nv);
    public boolean delete(String Ma_NV);
    
    public List<NhanVienViewModel> getData_SPView(); // ViewModels
    public List<NhanVien> getData_SP();   
}
