/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BUS;

import Models.KieuThietKe;
import ViewModels.KieuThietKeViewModel;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IQLThietKeService {
    
    public boolean insert(KieuThietKe ktk);
    public boolean update(KieuThietKe ktk);
    public boolean delete(String Ma_tk);
    
    public List<KieuThietKeViewModel> getData_SPView(); // ViewModels
    public List<KieuThietKe> getData_SP(); 
}
