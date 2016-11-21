package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connect.DBConnect;
import Model.SanPham;

public class SanPhamDao {
	public SanPham getSanPham(String maSP) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "SELECT * FROM SanPham where  MaSP='"+maSP+"'";
        SanPham sp = new SanPham();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
   
            	sp.setMaSP(rs.getString("MaSP"));
            	sp.setTenSP(rs.getString("TenSP"));
            	sp.setSoLuong(rs.getFloat("SoLuong"));
            	sp.setGiaBan(rs.getFloat("GiaBan"));
            	sp.setManHinh(rs.getString("ManHinh"));
            	sp.setCPU(rs.getString("CPU"));
            	sp.setRAM(rs.getString("RAM"));
            	sp.setHeDieuHanh(rs.getString("HeDieuHanh"));
            	sp.setSim(rs.getString("Sim"));
            	sp.setCameraTruoc(rs.getString("CameraTruoc"));
            	sp.setCameraSau(rs.getString("CameraSau"));
            	sp.setBoNhoTrong(rs.getString("BoNhoTrong"));
            	sp.setHoTroTheNho(rs.getString("HoTroTheNho"));
            	sp.setPin(rs.getString("Pin"));
            	sp.setMaNCC(rs.getString("MaNCC"));
            	sp.setMaHSX(rs.getString("MaHSX"));
            	sp.setMaLSP(rs.getString("MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sp;
    }

}
