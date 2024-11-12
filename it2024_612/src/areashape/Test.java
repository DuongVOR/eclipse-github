package areashape;

public class Test {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		t.setHeight(5);
		t.setColor("Hồng");
		t.setBase(5);
		t.getArea();
		System.out.println(t);
		r.setColor("Đỏ");
		r.setLength(10);
		r.setWidth(2);
		r.getArea();
		System.out.println(r);
	}
}
