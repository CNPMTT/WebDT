package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;

import com.sun.istack.internal.logging.Logger;

import Connect.DBConnect;
import Model.HDBH;

public class HDBHDao {
	public ArrayList<HDBH> getListHDBH() {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM HDBH,NhanVien,KhachHang,SanPham "+
        		"where HDBH.MaKH=KhachHang.MaKH and HDBH.MaSP=SanPham.MaSP and HDBH.MaNV=NhanVien.MaNV ";

        
        ArrayList<HDBH> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	HDBH hd = new HDBH();
            	hd.setMaHD(rs.getString("MaHD"));
            	hd.setMaKH(rs.getString("KhachHang.MaKH"));
            	hd.setMaNV(rs.getString("NhanVien.MaNV"));
            	hd.setMaSP(rs.getString("SanPham.MaSP"));
            	hd.setSLBan(rs.getDouble("SLBan"));
            	hd.setGiaBan(rs.getDouble("GiaBan"));
            	hd.setNgayLap(rs.getString("NgayLap"));
            	hd.setTrangThai(rs.getString("TrangThai"));
            	hd.setTenSP(rs.getString("TenSP"));
            	hd.setTenKH(rs.getString("TenKH"));
            	hd.setTenNV(rs.getString("TenNV"));
            	
            	list.add(hd);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
//	public ArrayList<HDBH> getListHDBH_LoaiSP(String tenLSP) {
//        Connection cons = DBConnect.getConnecttion();
//        String sql = "SELECT HDBH.MaSP,TenSP,SLNhap,GiaNhap,(GiaNhap*SLNhap) as ThanhTien FROM  HDBH,LoaiSP,SanPham where "+
//       "SanPham.MaLSP=LoaiSP.MaLSP and SanPham.MaSP=HDBH.MaSP and TenLoaiSP='"+tenLSP+"'";
//        
//        ArrayList<HDBH> list = new ArrayList<>();
//        try {
//            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//            	HDBH hd = new HDBH();
//            	
//            	hd.setMaSP(rs.getString("SanPham.MaSP"));
//            	hd.setSLBan(rs.getDouble("SLBan"));
//            	hd.setGiaBan(rs.getDouble("GiaBan"));
//            	hd.setNgayLap(rs.getString("NgayLap"));
//            	hd.setTenSP(rs.getString("TenSP"));
//            	list.add(hd);
//            }
//            cons.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//	public ArrayList<HDBH> getListCT_PN_NhaCC(String tenNCC) {
//        Connection cons = DBConnect.getConnecttion();
//        String sql = "SELECT CT_PN.MaSP,TenSP,SLNhap,GiaNhap,(GiaNhap*SLNhap) as ThanhTien FROM   CT_PN,NhaCC,SanPham where "+
//       "SanPham.MaNCC=NhaCC.MaNCC and SanPham.MaSP=CT_PN.MaSP and TenNhaCC='"+tenNCC+"'";
//        
//        ArrayList<HDBH> list = new ArrayList<>();
//        try {
//            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//            	HDBH hd = new HDBH();
//            	hd.setMaHD(rs.getString("MaHD"));
//            	hd.setMaKH(rs.getString("KhachHang.MaKH"));
//            	hd.setMaNV(rs.getString("NhanVien.MaNV"));
//            	hd.setMaSP(rs.getString("SanPham.MaSP"));
//            	hd.setSLBan(rs.getDouble("SLBan"));
//            	hd.setGiaBan(rs.getDouble("GiaBan"));
//            	hd.setNgayLap(rs.getString("NgayLap"));
//            	hd.setTrangThai(rs.getString("TrangThai"));
//            	hd.setTenSP(rs.getString("TenSP"));
//            	hd.setTenKH(rs.getString("TenKH"));
//            	hd.setTenNV(rs.getString("TenNV"));
//            	list.add(hd);
//            }
//            cons.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//	public ArrayList<HDBH> getListCT_PN_HangSX(String hangSX) {
//        Connection cons = DBConnect.getConnecttion();
//        String sql = "SELECT CT_PN.MaSP,TenSP,SLNhap,GiaNhap,(GiaNhap*SLNhap) as ThanhTien FROM  CT_PN,HangSX,SanPham where "+
//       "SanPham.MaHSX=HangSX.MaHSX and SanPham.MaSP=CT_PN.MaSP and TenHangSX='"+hangSX+"'";
//        
//        ArrayList<HDBH> list = new ArrayList<>();
//        try {
//            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//            	HDBH hd = new HDBH();
//            	hd.setMaHD(rs.getString("MaHD"));
//            	hd.setMaKH(rs.getString("KhachHang.MaKH"));
//            	hd.setMaNV(rs.getString("NhanVien.MaNV"));
//            	hd.setMaSP(rs.getString("SanPham.MaSP"));
//            	hd.setSLBan(rs.getDouble("SLBan"));
//            	hd.setGiaBan(rs.getDouble("GiaBan"));
//            	hd.setNgayLap(rs.getString("NgayLap"));
//            	hd.setTrangThai(rs.getString("TrangThai"));
//            	hd.setTenSP(rs.getString("TenSP"));
//            	hd.setTenKH(rs.getString("TenKH"));
//            	hd.setTenNV(rs.getString("TenNV"));
//            	list.add(hd);
//            }
//            cons.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
	
	public ArrayList<HDBH> getListHDBH_TheoTrangThai(String TrangThai) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM HDBH,NhanVien,KhachHang,SanPham "+
        		"where HDBH.MaKH=KhachHang.MaKH and HDBH.MaSP=SanPham.MaSP and HDBH.MaNV=NhanVien.MaNV "
        		+"and TrangThai='"+TrangThai+"'";
        ArrayList<HDBH> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	HDBH hd = new HDBH();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getDouble("GiaBan"));
            	hd.setMaHD(rs.getString("MaHD"));
            	hd.setMaKH(rs.getString("KhachHang.MaKH"));
            	hd.setMaNV(rs.getString("NhanVien.MaNV"));
            	hd.setMaSP(rs.getString("SanPham.MaSP"));
            	hd.setSLBan(rs.getDouble("SLBan"));
            	hd.setGiaBanFormat(GiaBanFormat);
            	hd.setGiaBan(rs.getDouble("GiaBan"));
            	hd.setNgayLap(rs.getString("NgayLap"));
            	hd.setTenSP(rs.getString("TenSP"));
            	hd.setTenKH(rs.getString("TenKH"));
            	hd.setTenNV(rs.getString("TenNV"));
            	
            	list.add(hd);
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	public HDBH getHDBH(String maHD) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM HDBH,NhanVien,KhachHang,SanPham "+
        		"where HDBH.MaKH=KhachHang.MaKH and HDBH.MaSP=SanPham.MaSP and HDBH.MaNV=NhanVien.MaNV "
        		+"and MaHD='"+maHD+"'";
        HDBH hd = new HDBH();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getDouble("GiaBan"));
            	hd.setMaHD(rs.getString("MaHD"));
            	hd.setMaKH(rs.getString("KhachHang.MaKH"));
            	hd.setMaNV(rs.getString("NhanVien.MaNV"));
            	hd.setMaSP(rs.getString("SanPham.MaSP"));
            	hd.setSLBan(rs.getDouble("SLBan"));
            	hd.setGiaBanFormat(GiaBanFormat);
            	hd.setGiaBan(rs.getDouble("GiaBan"));
            	hd.setNgayLap(rs.getString("NgayLap"));
            	hd.setTenSP(rs.getString("TenSP"));
            	hd.setTenKH(rs.getString("TenKH"));
            	hd.setTenNV(rs.getString("TenNV"));
            	
            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hd;
    }
	public boolean deleteHDBH(String maHD) throws SQLException {
		 Connection connection = DBConnect.getConnecttion();
	     String sql = "DELETE FROM HDBH WHERE MaHD = ?";
	    try {
	       
	       PreparedStatement ps = (PreparedStatement) connection.prepareCall(sql);
	       ps.setString(1,maHD );
	       return ps.executeUpdate()==1;
	    } catch (Exception e) {
	    	return false;
	    }
	    
	}
	public boolean deleteHDBHByKH(String maKH) throws SQLException {
		 Connection connection = DBConnect.getConnecttion();
	     String sql = "DELETE FROM HDBH WHERE MaKH = ?";
	    try {
	       
	       PreparedStatement ps = (PreparedStatement) connection.prepareCall(sql);
	       ps.setString(1,maKH );
	       return ps.executeUpdate()==1;
	    } catch (Exception e) {
	    	return false;
	    }
	    
	}
	public boolean deleteHDBHByNV(String maNV) throws SQLException {
		 Connection connection = DBConnect.getConnecttion();
	     String sql = "DELETE FROM HDBH WHERE MaNV = ?";
	    try {
	       
	       PreparedStatement ps = (PreparedStatement) connection.prepareCall(sql);
	       ps.setString(1,maNV );
	       return ps.executeUpdate()==1;
	    } catch (Exception e) {
	    	return false;
	    }
	    
	}
	public boolean updateTrangThai(HDBH hd) throws ParseException {
		Connection cons = DBConnect.getConnecttion();
		String sql = "update HDBH set TrangThai=? where MaHD=?";
		try {
			PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
			ps.setString(1,hd.getTrangThai());
			ps.setString(2, hd.getMaHD());
			return ps.executeUpdate()==1;
		} catch (SQLException e) {
			e.printStackTrace();
			Logger.getLogger(HDBHDao.class.getName(), null).log(Level.SEVERE, null, e);
		}
		return false;
	}
	
	public static void main(String[] args){
		HDBHDao a=new HDBHDao();		
		for(HDBH x:a.getListHDBH_TheoTrangThai("1")){
			System.out.print(x.getMaHD());
			System.out.print(x.getNgayLap());
		}
	}
}
