package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.DBConnect;
import Model.NhaCC;

public class NhaCCDao {
	public ArrayList<NhaCC> getListNhaCC() {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM NhaCC";
        
        ArrayList<NhaCC> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	NhaCC ncc = new NhaCC();
            	ncc.setMaNCC(rs.getString("MaNCC"));
            	ncc.setTenNhaCC(rs.getString("TenNCC"));
            	ncc.setSDT(rs.getString("SDT"));
            	ncc.setDiaChi(rs.getString("DiaChi"));
            	list.add(ncc);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
