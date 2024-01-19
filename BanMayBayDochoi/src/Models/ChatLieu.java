/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ASUS
 */
public class ChatLieu {
    private int id;
    private String ma_ChatLieu;
    private String ten_ChatLieu;
    private boolean trang_Thai;

    public ChatLieu() {
    }

    public ChatLieu(int id, String ma_ChatLieu, String ten_ChatLieu, boolean trang_thai) {
        this.id = id;
        this.ma_ChatLieu = ma_ChatLieu;
        this.ten_ChatLieu = ten_ChatLieu;
        this.trang_Thai = trang_thai;
    }

    public boolean isTrang_Thai() {
        return trang_Thai;
    }

    public void setTrang_Thai(boolean trang_Thai) {
        this.trang_Thai = trang_Thai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa_ChatLieu() {
        return ma_ChatLieu;
    }

    public void setMa_ChatLieu(String ma_ChatLieu) {
        this.ma_ChatLieu = ma_ChatLieu;
    }

    public String getTen_ChatLieu() {
        return ten_ChatLieu;
    }

    public void setTen_ChatLieu(String ten_ChatLieu) {
        this.ten_ChatLieu = ten_ChatLieu;
    }
    
}
