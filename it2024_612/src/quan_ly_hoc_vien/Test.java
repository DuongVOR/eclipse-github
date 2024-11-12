package quan_ly_hoc_vien;

public class Test {
	public static void main(String[] args) {
		HocvienDH dh = new HocvienDH();
		HocvienLT lt = new HocvienLT();
		System.out.println("Nhap vao thong tin sinh vien lop do hoa: ");
		dh.nhapThongTin();
		dh.hocPhi(30, 200000);// nhap số buổi học và học phí 1 buổi
		dh.inThongTin();
		System.out.println("Nhap vao thong tin sinh vien lop lap trinh: ");

		lt.nhapThongTin();
		lt.hocPhi(20, 100000);// nhap số buổi học và học phí 1 buổi
		lt.inThongTin();
	}
}
