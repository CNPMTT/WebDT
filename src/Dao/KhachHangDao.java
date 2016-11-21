package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.DBConnect;
import Model.KhachHang;

public class KhachHangDao {
	public KhachHang getKhachHang(String maKH) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM ";
        KhachHang kh = new KhachHang();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
            while (rs.next()) {
            	kh.setMaKH(rs.getString("MaKH"));
            	kh.setTenKH(rs.getString("TenKH"));
            	kh.setSDT(rs.getString("SDT"));
            	kh.setDiaChi(rs.getString("DiaChi"));
            	kh.setEmail(rs.getString("Email"));
            	
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kh;
    }
	public ArrayList<KhachHang> getListKhachHang() {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM KhachHang";
        
        ArrayList<KhachHang> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	KhachHang kh = new KhachHang();
            	kh.setMaKH(rs.getString("MaKH"));
            	kh.setTenKH(rs.getString("TenKH"));
            	kh.setSDT(rs.getString("SDT"));
            	kh.setDiaChi(rs.getString("DiaChi"));
            	kh.setEmail(rs.getString("Email"));
            	list.add(kh);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


}
