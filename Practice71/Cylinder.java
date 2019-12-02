//컴퓨터학과 20190975 신효경
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder() { this.height = 0; }
	public Cylinder(double radius) { super(radius); }
	public Cylinder(double radius, double height) { 
		super(radius);
		this.height = height;
	}
	public double getHeight() { return height;}
	public double getVolume() {
		return getArea() * getHeight();
	}
}
