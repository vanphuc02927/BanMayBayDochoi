/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class JdbcHelper {
//  Trong package này sẽ là những file cấu hình sql
//  Những class tái sử dụng trên tất cả các tầng
//  VD: Các Phương thức chung như sử lí chuỗi, định dạng số,check là số hay là chữ
    
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost:1433;database=QLBanDoChoi";
    private static String user = "sa";
    private static String password = "123456";    
    
    static {                            
        try {
            Class.forName(driver); 
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }  
    public static PreparedStatement getStmt(String sql, Object...args) throws SQLException {    
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql); //PROC
        } else {
            stmt = conn.prepareStatement(sql); //SQL
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;     
    }

    public static ResultSet query(String sql, Object...args) throws SQLException{
        try {
            PreparedStatement stmt = getStmt(sql, args);
            return stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
                    
    }

    public static int update(String sql, Object...args){
        try {
            PreparedStatement stmt = getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }    

    public static Object value(String sql, Object...args){ // Lấy giá trị
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
