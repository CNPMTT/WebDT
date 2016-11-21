package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.DBConnect;
import Model.NhanVien;

public class NhanVienDao {
	public ArrayList<NhanVien> getListNhanVien() {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM NhanVien";
        
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	NhanVien nv = new NhanVien();
            	nv.setMaNV(rs.getString("MaNV"));
            	nv.setTenNV(rs.getString("TenNV"));
            	nv.setGioiTinh(rs.getString("GioiTinh"));
            	nv.setNgSinh(rs.getString("NgSinh"));
            	nv.setDiaChi(rs.getString("DiaChi"));
            	nv.setSDT(rs.getString("SDT"));
            	nv.setLuong(rs.getFloat("Luong"));
            	nv.setMaLoaiNV(rs.getString("MaLoaiNV"));
            	list.add(nv);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	public NhanVien geNhanVienChuVu(String maNV) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM NhanVien,LoaiNV where NhanVien.MaLoaiNV=LoaiNV.MaLoaiNV and MaNV=?";
        
        NhanVien nv = new NhanVien();
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, maNV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	
            	nv.setMaNV(rs.getString("MaNV"));
            	nv.setTenNV(rs.getString("TenNV"));
            	nv.setGioiTinh(rs.getString("GioiTinh"));
            	nv.setNgSinh(rs.getString("NgSinh"));
            	nv.setDiaChi(rs.getString("DiaChi"));
            	nv.setSDT(rs.getString("SDT"));
            	nv.setLuong(rs.getFloat("Luong"));
            	nv.setTenLoaiNV(rs.getString("TenLoaiNV"));
            	
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nv;
    }

}
