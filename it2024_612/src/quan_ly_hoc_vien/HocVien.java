package quan_ly_hoc_vien;

import java.util.Scanner;

public abstract class HocVien {
	// thuoc tinh
	protected String hoTen;
	protected String diaChi;
	protected String loaiChuongTrinh;
	protected int loaiUuTien;
	protected int hocPhi;

	// phuong thuc tao
	public HocVien() {
	}

	public HocVien(String hoTen, String diaChi, String loaiChuongTrinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}

	// phuong thuc setter, getter and to string
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiChuongTrinh() {
		return loaiChuongTrinh;
	}

	public void setLoaiChuongTrinh(String loaiChuongTrinh) {
		this.loaiChuongTrinh = loaiChuongTrinh;
	}

	@Override
	public String toString() {
		return "HocVien [hoTen=" + hoTen + ", diaChi=" + diaChi + ", loaiChuongTrinh=" + loaiChuongTrinh + "]";
	}

	// Phuong thuc nhap thong tin
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("Nhap vao ho va ten: ");
		a = sc.nextLine();
		this.hoTen = a;
		System.out.println("Nhap vao dis chi: ");
		a = sc.nextLine();
		this.diaChi = a;
		System.out.println("Nhap vao loai chuong trinh: ");
		a = sc.nextLine();
		this.loaiChuongTrinh = a;
		int b;
		System.out.println("Nhap vao loai uu tien: ");
		b = sc.nextInt();
		this.loaiUuTien = b;
		System.out.println("Nhập vào số 1 nếu muốn kết thúc, nhấn 2 để tiếp tục nhập: ");
		if (sc.nextInt() == 1)
			sc.close();
	}

	// phuong thuc truu tuong tinh hoc phi
	public abstract void hocPhi(int soBuoi, int donGia);

	// phuong thuc in ra thong tin hoc vien
	public void inThongTin() {
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Loại ưu tiên: " + loaiUuTien);
		System.out.println("Loại chương trình đặng ký học: " + loaiChuongTrinh);
		System.out.println("Học phí: " + hocPhi);
	}
}
