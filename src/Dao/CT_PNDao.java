package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Connect.DBConnect;
import Model.CT_PN;
import Model.NhanVien;

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
	public ArrayList<CT_PN> getListCT_PN_LoaiSP(String tenLSP) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT CT_PN.MaSP,TenSP,SLNhap,GiaNhap,(GiaNhap*SLNhap) as ThanhTien FROM  CT_PN,LoaiSP,SanPham where "+
       "SanPham.MaLSP=LoaiSP.MaLSP and SanPham.MaSP=CT_PN.MaSP and TenLoaiSP='"+tenLSP+"'";
        
        ArrayList<CT_PN> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	CT_PN ctpn = new CT_PN();
            	ctpn.setMaPN(rs.getString("MaPN"));
            	ctpn.setMaSP(rs.getString("CT_PN.MaSP"));
            	ctpn.setTenSP(rs.getString("TenSP"));
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
	public ArrayList<CT_PN> getListCT_PN_NhaCC(String tenNCC) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT CT_PN.MaSP,TenSP,SLNhap,GiaNhap,(GiaNhap*SLNhap) as ThanhTien FROM   CT_PN,NhaCC,SanPham where "+
       "SanPham.MaNCC=NhaCC.MaNCC and SanPham.MaSP=CT_PN.MaSP and TenNhaCC='"+tenNCC+"'";
        
        ArrayList<CT_PN> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	CT_PN ctpn = new CT_PN();
            	ctpn.setMaPN(rs.getString("MaPN"));
            	ctpn.setMaSP(rs.getString("CT_PN.MaSP"));
            	ctpn.setTenSP(rs.getString("TenSP"));
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
	public ArrayList<CT_PN> getListCT_PN_HangSX(String hangSX) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT CT_PN.MaSP,TenSP,SLNhap,GiaNhap,(GiaNhap*SLNhap) as ThanhTien FROM  CT_PN,HangSX,SanPham where "+
       "SanPham.MaHSX=HangSX.MaHSX and SanPham.MaSP=CT_PN.MaSP and TenHangSX='"+hangSX+"'";
        
        ArrayList<CT_PN> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	CT_PN ctpn = new CT_PN();
            	ctpn.setMaPN(rs.getString("MaPN"));
            	ctpn.setMaSP(rs.getString("CT_PN.MaSP"));
            	ctpn.setTenSP(rs.getString("TenSP"));
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
	
	public ArrayList<CT_PN> getListCTPN_ByMaPN(String MaPN) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM CT_PN inner join SanPham on CT_PN.MaSP=SanPham.MaSP "
        		+"where CT_PN.MaPN = '"+MaPN+"'";
        
        ArrayList<CT_PN> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	CT_PN ctpn = new CT_PN();
            	ctpn.setMaPN(rs.getString("MaPN"));
            	ctpn.setMaSP(rs.getString("SanPham.MaSP"));
            	ctpn.setSLNhap(rs.getFloat("SLNhap"));
            	ctpn.setGiaNhap(rs.getFloat("GiaNhap"));
            	ctpn.setTenSP(rs.getString("SanPham.TenSP"));
            	ctpn.setGiaBan(rs.getFloat("SanPham.GiaBan"));
            	list.add(ctpn);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	
	 public static void main(String[] args) throws SQLException {
		 CT_PNDao nvDAO = new CT_PNDao();
		 for(CT_PN nv:nvDAO.getListCTPN_ByMaPN("1"))
		 {
			 System.out.println(nv.getTenSP()+"____"+Math.round(nv.getGiaBan()));
		 }
	    }

}
