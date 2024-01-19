/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ASUS
 */
public class SanPham {
    // Trong các package models chỉ tạo ra các class tương ứng với các bảng trong csdl
    //Có bao nhiêu bảng thì bấy nhiêu class và bấy nhiêu thuộc tính bên trong
    private int id;
    private String ma_SP;
    private String ten_SP;
    private Boolean trang_Thai;

    public SanPham(int id, String ma_SP, String ten_SP, Boolean trang_Thai){
        this.id = id;
        this.ma_SP = ma_SP;
        this.ten_SP = ten_SP;
        this.trang_Thai = trang_Thai;
    }    

    public SanPham() {
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getMA_SP() {
        return ma_SP;
    }

    public void setMA_SP(String MA_SP) {
        this.ma_SP = MA_SP;
    }

    public String getTEN_SP() {
        return ten_SP;
    }

    public void setTEN_SP(String TEN_SP) {
        this.ten_SP = TEN_SP;
    }

    public Boolean getTrang_Thai() {
        return trang_Thai;
    }

    public void setTrang_Thai(Boolean trang_Thai) {
        this.trang_Thai = trang_Thai;
    }

      
}
