//컴퓨터학과 20190975 신효경
public class Circle {
	private double radius;
	
	public Circle() { this.radius = 0; }
	public Circle(double radius) { this.radius = radius; }
	
	public double getRadius() { return radius; }
	public double getArea() { return 3.14*radius*radius; }
}
