package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.DBConnect;
import Model.CT_PN;

public class CT_PNDao {
	public ArrayList<CT_PN> getListCT_PN() {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM CT_PN";
        
        ArrayList<CT_PN> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	CT_PN ctpn = new CT_PN();
            	ctpn.setMaPN(rs.getString("MaPN"));
            	ctpn.setMaSP(rs.getString("MaSP"));
            	ctpn.setSLNhap(rs.getFloat("SLNhap"));
            	ctpn.setGiaNhap(rs.getFloat("GiaNhap"));
            	ctpn.setThanhTien(rs.getFloat("ThanhTien"));
            	list.add(ctpn);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
