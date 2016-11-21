package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.DBConnect;
import Model.PhieuNhap;

public class PhieuNhapDao {
	public ArrayList<PhieuNhap> getListPhieuNhap() {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM PhieuNhap";
        
        ArrayList<PhieuNhap> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	PhieuNhap pn = new PhieuNhap();
            	pn.setMaPN(rs.getString("MaPN"));
            	pn.setMaNCC(rs.getString("MaNCC"));
            	pn.setMaNV(rs.getString("MaNV"));
            	pn.setNgayNhap(rs.getString("NgayNhap"));
            	list.add(pn);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
