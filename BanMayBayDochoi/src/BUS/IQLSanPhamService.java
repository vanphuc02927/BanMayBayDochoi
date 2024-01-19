/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BUS;

import Models.SanPham;
import ViewModels.SanPhamViewModel;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IQLSanPhamService { // Thứ 3
    //  Interface Không có body code;
    //  Trong interface Mặc Đinh là public không thể sử dụng private;
    //  Hiểu đơn giản interface là phần xác mà chưa có hồn
    
    public boolean insert(SanPham sp);
    public boolean update(SanPham sp);
    public boolean delete(String Ma_SP);
    
    public List<SanPhamViewModel> getData_SPView(); // ViewModels
    public List<SanPham> getData_SP();    
}
