package DAO;

import Models.SanPham;
import Utilities.JdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class SanPhamRepo implements ISanPhamRepo{ // phải có Interface
    //Tầng DAO đây là nơi sẽ code các câu lệnh SQL vào các bảng(CRUD)
    // Có bao nhiêu bảng thì sẽ có bấy nhiêu class
    // Đặt tên class là tên bảng + Repo
    
    private String INSERT_SQL = "INSERT INTO SANPHAM (MA_SP,TEN_SP,TRANG_THAI) VALUES (?,?,1)";
    private String UPDATE_SQL = "UPDATE SANPHAM SET TEN_SP = ?, TRANG_THAI = ? where MA_SP = ?";
    private String DELETE_SQL = "DELETE FROM SANPHAM WHERE MA_SP = ?";
    private String SELECT_ALL_SQL = "SELECT * FROM SANPHAM";
    private String SELECT_BY_ID_SQL = "SELECT * FROM SANPHAM WHERE MA_SP = ?";
    
    @Override
    public boolean insert(SanPham SP) {
        try {
            JdbcHelper.update(INSERT_SQL, SP.getMA_SP(), SP.getTEN_SP());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(SanPham SP) {
        try {
            JdbcHelper.update (UPDATE_SQL, SP.getTEN_SP(), SP.getTrang_Thai(), SP.getMA_SP());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(String Ma_SP) {
        try {
            JdbcHelper.update(DELETE_SQL, Ma_SP);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<SanPham> selectBySQL(String sql, Object... args){
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {                
                SanPham sp = new SanPham();
                sp.setID(rs.getInt("ID"));
                sp.setMA_SP(rs.getString("MA_SP"));
                sp.setTEN_SP(rs.getString("TEN_SP"));
                sp.setTrang_Thai(rs.getBoolean("TRANG_THAI"));
                list.add(sp);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.getMessage();
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<SanPham> getAllData_SP() {
        return selectBySQL(SELECT_ALL_SQL);
    }   

    @Override
    public SanPham selectById(String Ma_SP) {
        List<SanPham> list = selectBySQL(SELECT_BY_ID_SQL, Ma_SP);
        return !list.isEmpty() ? list.get(0) : null;    
    }
}
