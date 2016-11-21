package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.DBConnect;
import Model.HangSX;

public class HangSXDao {
	public ArrayList<HangSX> getListHangSX() {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM NhaCC";
        
        ArrayList<HangSX> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	HangSX hsx = new HangSX();
            	hsx.setMaHSX(rs.getString("HangSX"));
            	hsx.setTenHangSX(rs.getString("TenHangSX"));
            	list.add(hsx);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


}
