package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import Connect.DBConnect;
import Model.SanPham;

public class SanPhamDao {
	
	public ArrayList<SanPham> getListSP()  throws SQLException{
        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	public ArrayList<SanPham> getListSP_Tablet_Top8()  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='2'"
        		+" limit 8";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	public ArrayList<SanPham> getListSP_Top9()  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='1'"
        		+" limit 9";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	
	// DienThoai DAO BEGIN
	public ArrayList<SanPham> getListSP_DienThoai()  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='1'";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	public ArrayList<SanPham> getListSP_DienThoai_TheoHangSX(String HangSX)  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='1'"
        		+ " and TenHangSX='"+HangSX+"'";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	public ArrayList<SanPham> getListSP_DienThoai_TheoGia(float GiaNho, float GiaLon)  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='1'"
        		+ " and GiaBan >='"+GiaNho+"' and GiaBan<='"+GiaLon+"' order by GiaBan asc";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	public ArrayList<SanPham> getListSP_DienThoai_SX(String LoaiSX)  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='1'"
        		+" order by GiaBan "+LoaiSX;
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	// END DienThoai DAO
	
	// Tablet DAO begin
	public ArrayList<SanPham> getListSP_Tablet()  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='2'";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	public ArrayList<SanPham> getListSP_Tablet_TheoGia(float GiaNho, float GiaLon)  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='2'"
        		+ " and GiaBan >='"+GiaNho+"' and GiaBan<='"+GiaLon+"' order by GiaBan asc";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	public ArrayList<SanPham> getListSP_Tablet_TheoHangSX(String HangSX)  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='2'"
        		+ " and TenHangSX='"+HangSX+"'";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	public ArrayList<SanPham> getListSP_Tablet_ThapdenCao()  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='2'"
        		+" order by GiaBan asc";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	public ArrayList<SanPham> getListSP_Tablet_CaodenThap()  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='2'"
        		+" order by GiaBan desc";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	//end Tablet DAO
	
	// Phu kien DAO // begin
	public ArrayList<SanPham> getListSP_PhuKien()  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,nhacc,loaisp" +
        		" where sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='3'";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	
	public ArrayList<SanPham> getListSP_PhuKien_CaodenThap()  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,nhacc,loaisp" +
        		" where sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='3' "+
        		"order by sanpham.GiaBan desc";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	
	public ArrayList<SanPham> getListSP_PhuKien_ThapdenCao()  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,nhacc,loaisp" +
        		" where sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='3' "+
        		"order by sanpham.GiaBan asc";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	
	public ArrayList<SanPham> getListSP_PhuKien_LoaiPK(String TenLoai)  throws SQLException{

        Connection cons = DBConnect.getConnecttion();
        String sql ="select * from sanpham,nhacc,loaisp" +
        		" where sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP and loaisp.MaLSP='3' "+
        		"and TenSP like '%"+TenLoai+"%'";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	SanPham sp = new SanPham();
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));
            	list.add(sp);
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
	// end phu kien DAO
	
	public SanPham getSanPham(String maSP) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "select * from sanpham,hangsx,nhacc,loaisp" +
        		" where sanpham.MaHSX=hangsx.MaHSX and sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP"
        		+ " and sanpham.MaSP='"+maSP+"'";
        SanPham sp = new SanPham();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            	sp.setMaHSX(rs.getString("hangsx.MaHSX"));
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	sp.setTenHSX(rs.getString("hangsx.TenHangSX"));
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));	
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sp;
    }
	
	public SanPham getPhuKien(String maSP) {
        Connection cons = DBConnect.getConnecttion();
        String sql = "select * from sanpham,nhacc,loaisp" +
        		" where sanpham.MaNCC=nhacc.MaNCC and sanpham.MaLSP=loaisp.MaLSP"
        		+ " and sanpham.MaSP='"+maSP+"'";
        SanPham sp = new SanPham();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	DecimalFormat myFormatter = new DecimalFormat("###,###.###");
            	String GiaBanFormat = myFormatter.format(rs.getFloat("GiaBan"));
            	sp.setGiaBanFormat(GiaBanFormat);
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
            	sp.setMaNCC(rs.getString("nhacc.MaNCC"));
            
            	sp.setMaLSP(rs.getString("loaisp.MaLSP"));
            	sp.setHinhSP(rs.getString("HinhSP"));
            	sp.setMoTaSP(rs.getString("MoTaSP"));
            	sp.setHinhAnh2(rs.getString("HinhAnh2"));
            	sp.setDanhGiaSP(rs.getString("DanhGiaSP"));
            	sp.setHinhAnh3(rs.getString("HinhAnh3"));
            	
            	sp.setTenNCC(rs.getString("nhacc.TenNhaCC"));
            	sp.setTenLSP(rs.getString("loaisp.TenLoaiSP"));	
            }
           
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sp;
    }
	
	 public static void main(String[] args) throws SQLException {
		 SanPhamDao spDAO = new SanPhamDao();
//		 for(SanPham sp:spDAO.getListSP_Top9())
//		 {
//			 System.out.println(sp.getTenSP()+"____"+sp.getGiaBan());
//		 }
		 
//		 SanPham sp1 = spDAO.getSanPham("10");
//			SanPham sp2 = spDAO.getSanPham("15");
//			SanPham  = spDAO.getSanPham("20");
//			SanPham sp4 = spDAO.getSanPham("25");
//		 System.out.println(sp1.getTenSP()+"_____"+sp2.getTenSP()+"_____"+sp3.getTenSP());
		 SanPham sp1 = spDAO.getSanPham("33");
			
		 System.out.println(sp1.getGiaBanFormat());
	    }

}
