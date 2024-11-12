package areashape;

public class Triangle extends Shape {
	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}

// phuong thuc tinh dien tich
	public void getArea() {
		System.out.println("em chua ghi phep tinh");
	}
}
