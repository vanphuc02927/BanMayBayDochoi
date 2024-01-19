/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Models.NhanVien;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface INhanVienRepo { // Đầu tiên
    
    public boolean insert(NhanVien NV);
    public boolean update(NhanVien NV);
    public boolean delete(String Ma_NV);
    
    public NhanVien selectById(String Ma_SP);
    public List<NhanVien> selectBySQL(String sql, Object... args);
    public List<NhanVien> getAllData_NV();
}
