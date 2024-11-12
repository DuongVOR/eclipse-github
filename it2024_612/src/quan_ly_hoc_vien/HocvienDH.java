package quan_ly_hoc_vien;

public class HocvienDH extends HocVien {
	public HocvienDH() {
	}

	public HocvienDH(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien, int hopPhi, int hocPhi) {
		super(hoTen, diaChi, loaiChuongTrinh);
		this.loaiUuTien = loaiUuTien;
		this.hocPhi = hocPhi;
	}

	@Override
	public void hocPhi(int soBuoi, int donGia) {
		if (loaiUuTien == 1) {
			hocPhi = soBuoi * donGia - 1000000;
		} else
			hocPhi = soBuoi * donGia - 500000;
	}

}
