package arraycircle;

public class Circle {
	protected double radius;

	// phuong thuc tao
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	// phuong thuc getter and setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// phuong thuc to string
	@Override
	public String toString() {
		return "Circle co ban kinh = " + radius + " va dien tich = " + getArea();
	}

	// phuong thuc get area
	public double getArea() {
		return radius * radius * 3.14;
	}

}
