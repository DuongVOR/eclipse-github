package benh_nhan;

public class Nguoi {
	protected String ten;
	protected int tuoi;
	protected char gioiTinh;

	// Phuong thuc tao
	public Nguoi() {
	}

	public Nguoi(String ten, int tuoi, char gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}

	// setter and getter
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public char getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	// phuong thuc toString
	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + "] ";
	}

}
