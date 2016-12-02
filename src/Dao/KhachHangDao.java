package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;

import com.sun.istack.internal.logging.Logger;

import Connect.DBConnect;
import Model.KhachHang;
import Model.NhanVien;

public class KhachHangDao {
	public KhachHang getKhachHang(String maKH) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM KhachHang where MaKH='"+maKH+"'";
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
	public boolean deleteKhachHang(String maKH) throws SQLException {
		 Connection connection = DBConnect.getConnecttion();
	     String sql = "DELETE FROM KhachHang WHERE MaKH = ?";
	    try {
	       
	       PreparedStatement ps = (PreparedStatement) connection.prepareCall(sql);
	       ps.setString(1,maKH );
	       return ps.executeUpdate()==1;
	    } catch (Exception e) {
	    	return false;
	    }
	    
	}
	public boolean updateKhachHang(KhachHang kh) throws ParseException {
		Connection cons = DBConnect.getConnecttion();
		String sql = "update KhachHang set TenKH=?, SDT=?, DiaChi=?, Email=? where MaKH=?";
		try {
			PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
			ps.setString(1,kh.getTenKH());
			ps.setString(2, kh.getSDT());
			ps.setString(3,kh.getDiaChi());
			ps.setString(4, kh.getEmail());
			ps.setString(5, kh.getMaKH());
			return ps.executeUpdate()==1;
		} catch (SQLException e) {
			e.printStackTrace();
			Logger.getLogger(KhachHangDao.class.getName(), null).log(Level.SEVERE, null, e);
		}
		return false;
	}
	public boolean insertKhachHang(KhachHang kh) throws ParseException {
		Connection cons = DBConnect.getConnecttion();
		String sql = "insert into KhachHang values(?,?,?,?,?)";
		try {

			PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
			ps.setString(1, kh.getMaKH());
			ps.setString(2,kh.getTenKH());
			ps.setString(3, kh.getSDT());
			ps.setString(4,kh.getDiaChi());
			ps.setString(5, kh.getEmail());
			
			return ps.executeUpdate()==1;
		} catch (SQLException e) {
			e.printStackTrace();
			Logger.getLogger(KhachHangDao.class.getName(), null).log(Level.SEVERE, null, e);
		}
		return false;
	}


}
