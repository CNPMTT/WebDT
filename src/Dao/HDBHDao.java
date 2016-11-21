package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.DBConnect;
import Model.HDBH;

public class HDBHDao {
	public ArrayList<HDBH> getListHDBH() {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM HDBH";
        
        ArrayList<HDBH> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	HDBH hd = new HDBH();
            	hd.setMaHD(rs.getString("MaHD"));
            	hd.setMaKH(rs.getString("MaKH"));
            	hd.setMaNV(rs.getString("MaNV"));
            	hd.setMaSP(rs.getString("MaSP"));
            	hd.setSLBan(rs.getDouble("SLBan"));
            	hd.setGiaBan(rs.getDouble("GiaBan"));
            	hd.setNgayLap(rs.getString("NgayLap"));
            	list.add(hd);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
