/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Models.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IHoaDonChiTietRepo {
    public boolean insert(HoaDonChiTiet HDCT);
    public boolean update(HoaDonChiTiet HDCT);
    public boolean delete(String Ma_HDCT);
    
    public HoaDonChiTiet selectById(String Ma_HDCT);
    public List<HoaDonChiTiet> selectBySQL(String sql, Object... args);
    public List<HoaDonChiTiet> getAllData_HDCT();
}
