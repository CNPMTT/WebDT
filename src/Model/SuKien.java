package Model;

public class SuKien {
	private String MaSK;
    private String TenSK;
    private String MoTaSK;
    private String NgayBD;
    private String NgayKT;
    private String MaNV;
    private String TenNV;
    
	public SuKien() {
		super();
	}

	public SuKien(String maSK, String tenSK, String moTaSK, String ngayBD, String ngayKT, String maNV,
			String tenNV) {
		super();
		MaSK = maSK;
		TenSK = tenSK;
		MoTaSK = moTaSK;
		NgayBD = ngayBD;
		NgayKT = ngayKT;
		MaNV = maNV;
		TenNV = tenNV;
	}

	public String getTenNV() {
		return TenNV;
	}

	public void setTenNV(String tenNV) {
		TenNV = tenNV;
	}

	public String getMaSK() {
		return MaSK;
	}

	public void setMaSK(String maSK) {
		MaSK = maSK;
	}

	public String getTenSK() {
		return TenSK;
	}

	public void setTenSK(String tenSK) {
		TenSK = tenSK;
	}

	public String getMoTaSK() {
		return MoTaSK;
	}

	public void setMoTaSK(String moTaSK) {
		MoTaSK = moTaSK;
	}

	public String getNgayBD() {
		return NgayBD;
	}

	public void setNgayBD(String ngayBD) {
		NgayBD = ngayBD;
	}

	public String getNgayKT() {
		return NgayKT;
	}

	public void setNgayKT(String ngayKT) {
		NgayKT = ngayKT;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	
}
