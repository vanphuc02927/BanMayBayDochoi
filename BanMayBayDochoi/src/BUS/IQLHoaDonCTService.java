/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BUS;

import Models.HoaDonChiTiet;
import ViewModels.HoaDonChiTietViewModel;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IQLHoaDonCTService {
    public boolean insert(HoaDonChiTiet hdct);
    public boolean update(HoaDonChiTiet hdct);
    public boolean delete(String Ma_HDCT);
    
    public List<HoaDonChiTietViewModel> getData_SPView(); // ViewModels
    public List<HoaDonChiTiet> getData_SP();
}
