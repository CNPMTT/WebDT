package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.DBConnect;
import Model.LoaiNV;

public class LoaiNVDao {
	public ArrayList<LoaiNV> getListLoaiNV() {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM LoaiNV";
        
        ArrayList<LoaiNV> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	LoaiNV lnv = new LoaiNV();
            	lnv.setMaLoaiNV(rs.getString("MaLoaiNV"));
            	lnv.setTenLoaiNV(rs.getString("TenLoaiNV"));
            	list.add(lnv);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


}
