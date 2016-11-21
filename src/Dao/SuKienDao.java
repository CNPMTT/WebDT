package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.DBConnect;
import Model.SuKien;

public class SuKienDao {
	public ArrayList<SuKien> getListSuKien() {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM SuKien";
        
        ArrayList<SuKien> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SuKien sk = new SuKien();
            	sk.setMaSK(rs.getString("MaSK"));
            	sk.setTenSK(rs.getString("TenSK"));
            	sk.setMoTaSK(rs.getString("MoTaSK"));
            	sk.setNgayBD(rs.getString("NgayBD"));
            	sk.setNgayKT(rs.getString("NgayKT"));
            	sk.setMaNV(rs.getString("MaNV"));
            	list.add(sk);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


}
