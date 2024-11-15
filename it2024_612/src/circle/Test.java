package circle;

public class Test {
	public static void main(String[] args) {
		ResizableCircle c = new ResizableCircle(0.2);
		c.setRadius(13.2);
		System.out.println(c.getRadius());
		c.resize(30);
		System.out.println(c.getRadius());
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
	}
}
