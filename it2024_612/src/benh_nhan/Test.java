package benh_nhan;

public class Test {
	public static void main(String[] args) {
		BenhVien a = new BenhVien("Hưng Hà", "Hà Nội", "Giám dốc Dương");
		BenhNhan b = new BenhNhan("ZoongZinWho", 19, 'N', "Tiểu đường siêu ngọt", "Sức khỏe ổn", a);
		System.out.println(b);
	}
}
