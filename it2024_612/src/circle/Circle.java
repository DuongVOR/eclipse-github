package circle;

public class Circle implements GeomeTricObject {
	// hang so
	public final static double RADIUS = 1.0;
	// thuoc tinh
	protected double radius;

	// phuong thuc tao
	public Circle() {
		this(RADIUS);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	// phuong thuc setter and getter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double getPerimeter() {
		return radius * 10;
	}

	@Override
	public double getArea() {
		return radius * 20;
	}

}
