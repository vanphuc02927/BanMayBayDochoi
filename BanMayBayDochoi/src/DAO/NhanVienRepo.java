/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import Utilities.JdbcHelper;
import Models.NhanVien;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class NhanVienRepo implements INhanVienRepo{ // Thứ hai

private String INSERT_SQL = "INSERT INTO NHANVIEN(MANV, HO_TEN, NGAYSINH, GIOI_TINH, SĐT, EMAIL, MAT_KHAU, VAI_TRO,TRANG_THAI) VALUES (?,?,?,?,?,?,?,?,?)";
private String UPDATE_SQL = "update NHANVIEN set HO_TEN = ?, NGAYSINH =?, GIOI_TINH=?, SĐT= ?,EMAIL=?,MAT_KHAU = ?, VAI_TRO= ?,TRANG_THAI = ? WHERE MANV = ?";
private String DELETE_SQL = "DELETE FROM NHANVIEN WHERE MANV = ?";
private String SELECT_ALL_SQL = "SELECT * FROM NHANVIEN";
private String SELECT_BY_ID_SQL = "SELECT * FROM NHANVIEN WHERE MANV= ?";
    
    @Override
    public boolean insert(NhanVien NV) {
        try {
            JdbcHelper.update(INSERT_SQL, 
                    NV.getMa_NV(), 
                    NV.getHo_Ten(), 
                    NV.getNgay_sinh(), 
                    NV.isGioi_tinh(), 
                    NV.getSdt(), 
                    NV.getEmail(), 
                    NV.getMat_khau(),
                    NV.isVaiTro(), 
                    NV.isTrang_thai()
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(NhanVien NV) {
        try {
            JdbcHelper.update (UPDATE_SQL,
                    NV.getHo_Ten(),
                    NV.getNgay_sinh(),
                    NV.isGioi_tinh(),
                    NV.getSdt(),
                    NV.getEmail(),
                    NV.getMat_khau(),
                    NV.isVaiTro(),
                    NV.isTrang_thai(),
                    NV.getMa_NV()
                    );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(String Ma_NV) {
        try {
            JdbcHelper.update(DELETE_SQL, Ma_NV);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public NhanVien selectById(String Ma_SP) {
        List<NhanVien> list = selectBySQL(SELECT_BY_ID_SQL, Ma_SP);
        return !list.isEmpty() ? list.get(0) : null;      }

    @Override
    public List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {                
                NhanVien nv = new NhanVien();
                nv.setId(rs.getInt("ID"));
                nv.setMa_NV(rs.getString("MANV"));
                nv.setHo_Ten(rs.getString("HO_TEN"));
                nv.setNgay_sinh(rs.getDate("NGAY_SINH"));
                nv.setGioi_tinh(rs.getBoolean("GIOI_TINH"));
                nv.setSdt(rs.getInt("SĐT"));
                nv.setEmail(rs.getString("EMAIL"));
                nv.setMat_khau(rs.getString("MAT_KHAU"));
                nv.setVaiTro(rs.getBoolean("VAI_TRO"));
                nv.setTrang_thai(rs.getBoolean("TRANG_THAI"));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.getMessage();
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<NhanVien> getAllData_NV() {
        return selectBySQL(SELECT_ALL_SQL);
    }
    
}
