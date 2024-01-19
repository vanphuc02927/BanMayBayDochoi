package DAO;

import Models.KieuThietKe;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IKieuThietKeRepo{
    
    public boolean insert(KieuThietKe KTK);
    public boolean update(KieuThietKe KTK);
    public boolean delete(String Ma_TK);
    
    public KieuThietKe selectById(String Ma_HDCT);
    public List<KieuThietKe> selectBySQL(String sql, Object... args);
    public List<KieuThietKe> getAllData_HDCT();
    
}
