//��ǻ���а� 20190975 ��ȿ��
public class Shape {
	private int x, y;
	
	Shape() {
		this.x = 0;
		this.y = 0;
	}
	
	void setX(int x) { this.x = x;}
	int getX() { return x; }
	
	void setY(int y) { this.y = y;}
	int getY() { return y; }
	
	public String toString() {
		return "���� :: �߽���ǥ ("+getX()+", "+getY()+")";
	}
}
