//컴퓨터학과 20190975 신효경
public class Rectangle extends Shape {
	private int width, height;
	
	Rectangle(int width, int height) {
		 super();
		 this.width = width;
		 this.height = height;
	}
	
	void setWidth(int w) { this.width = w; }
	int getWidth() { return width; }
	
	void setHeight(int h) { this.height = h; }
	int getHeight() { return height; }
	
	public void printInfo() {
		System.out.println("사각형 :: 중심좌표 ("+getX()+", "+getY()+") :: 면적 – "+area()+" ::  둘레 – "+perimeter());
	}
	public int area() {
		return width * height;
	}
	public int perimeter() {
		return 2 * (width + height);
	}
}
