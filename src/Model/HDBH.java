package Model;

public class HDBH {
	private String MaHD;
    private String MaKH;
    private String TenKH;
    private String MaNV;
    private String TenNV;
    private String MaSP;
    private String TenSP;
    private double SLBan;
    private double GiaBan;
    private String NgayLap;
   
	public HDBH() {
		super();
	}

	public HDBH(String maHD, String maKH, String maNV, String maSP, double sLBan, double giaBan, 
			String ngayLap, String tenKH, String tenNV, String tenSP) {
		super();
		MaHD = maHD;
		MaKH = maKH;
		MaNV = maNV;
		MaSP = maSP;
		SLBan = sLBan;
		GiaBan = giaBan;
		NgayLap = ngayLap;
		TenKH = tenKH;
		TenNV = tenNV;
		TenSP = tenSP;
	}

	public String getTenKH() {
		return TenKH;
	}

	public void setTenKH(String tenKH) {
		TenKH = tenKH;
	}

	public String getTenNV() {
		return TenNV;
	}

	public void setTenNV(String tenNV) {
		TenNV = tenNV;
	}

	public String getTenSP() {
		return TenSP;
	}

	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}

	public String getMaHD() {
		return MaHD;
	}

	public void setMaHD(String maHD) {
		MaHD = maHD;
	}

	public String getMaKH() {
		return MaKH;
	}

	public void setMaKH(String maKH) {
		MaKH = maKH;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	public String getMaSP() {
		return MaSP;
	}

	public void setMaSP(String maSP) {
		MaSP = maSP;
	}

	public double getSLBan() {
		return SLBan;
	}

	public void setSLBan(double sLBan) {
		SLBan = sLBan;
	}

	public double getGiaBan() {
		return GiaBan;
	}

	public void setGiaBan(double giaBan) {
		GiaBan = giaBan;
	}

	public String getNgayLap() {
		return NgayLap;
	}

	public void setNgayLap(String ngayLap) {
		NgayLap = ngayLap;
	}
	
    
}
