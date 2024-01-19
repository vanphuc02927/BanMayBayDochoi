/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.SanPham;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ISanPhamRepo {
    
    public boolean insert(SanPham SP);
    public boolean update(SanPham SP);
    public boolean delete(String Ma_SP);
    
    public SanPham selectById(String Ma_SP);
    public List<SanPham> selectBySQL(String sql, Object... args);
    public List<SanPham> getAllData_SP();
}
