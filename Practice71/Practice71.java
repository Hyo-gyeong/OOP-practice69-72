//��ǻ���а� 2190975 ��ȿ��
public class Practice71 {

	public static void main(String[] args) {

		Circle c0 = new Circle(10);
		Circle c1 = new Circle();
		Cylinder c2 = new Cylinder(5, 3);
		
		System.out.println("Circle ��ü�� ���� �����Դϴ�.");
		System.out.println("������ : "+c0.getRadius()+"\n�ܸ���  : "+c0.getArea());
		
		System.out.println("\nCircle ��ü 1�� ���� �����Դϴ�.");
		System.out.println("������ : "+c1.getRadius()+"\n�ܸ���  : "+c1.getArea());
		System.out.println("���� : "+c1.getRadius()+"\n����  : "+c1.getArea());
		
		System.out.println("\nCircle ��ü 2�� ���� �����Դϴ�.");
		System.out.println("������ : "+c2.getRadius()+"\n�ܸ���  : "+c2.getArea());
		System.out.println("���� : "+c2.getHeight()+"\n����  : "+c2.getVolume());
	}

}
