package quan_ly_hoc_vien;

public class HocvienLT extends HocVien {
	public HocvienLT() {
	}

	public HocvienLT(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien) {
		super(hoTen, diaChi, loaiChuongTrinh);
		this.loaiUuTien = loaiUuTien;
	}

	@Override
	public void hocPhi(int soBuoi, int donGia) {
		if (loaiUuTien == 1) {
			hocPhi = soBuoi * donGia - 1000000;
		} else
			hocPhi = soBuoi * donGia - 800000;
	}
}
