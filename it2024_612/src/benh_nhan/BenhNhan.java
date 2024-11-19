package benh_nhan;

public class BenhNhan extends Nguoi {
	protected String tienSu;
	protected String chuanDoan;
	protected BenhVien BenhVien;

	// phuong thuc tao constructor
	public BenhNhan() {
	}

	public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chuanDoan, BenhVien benhVien) {
		super(ten, tuoi, gioiTinh);
		this.tienSu = tienSu;
		this.chuanDoan = chuanDoan;
		BenhVien = benhVien;
	}
	// getter and setter

	public String getTienSu() {
		return tienSu;
	}

	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}

	public String getChuanDoan() {
		return chuanDoan;
	}

	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}

	public BenhVien getBenhVien() {
		return BenhVien;
	}

	public void setBenhVien(BenhVien benhVien) {
		BenhVien = benhVien;
	}
	// toString

	@Override
	public String toString() {
		return super.toString() + "BenhNhan: tienSu=" + tienSu + ", chuanDoan=" + chuanDoan + ", BenhVien="
				+ BenhVien.toString() + "]";
	}

}
