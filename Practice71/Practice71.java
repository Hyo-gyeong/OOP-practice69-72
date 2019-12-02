//컴퓨터학과 2190975 신효경
public class Practice71 {

	public static void main(String[] args) {

		Circle c0 = new Circle(10);
		Circle c1 = new Circle();
		Cylinder c2 = new Cylinder(5, 3);
		
		System.out.println("Circle 객체에 대한 정보입니다.");
		System.out.println("반지름 : "+c0.getRadius()+"\n단면적  : "+c0.getArea());
		
		System.out.println("\nCircle 객체 1에 대한 정보입니다.");
		System.out.println("반지름 : "+c1.getRadius()+"\n단면적  : "+c1.getArea());
		System.out.println("높이 : "+c1.getRadius()+"\n부피  : "+c1.getArea());
		
		System.out.println("\nCircle 객체 2에 대한 정보입니다.");
		System.out.println("반지름 : "+c2.getRadius()+"\n단면적  : "+c2.getArea());
		System.out.println("높이 : "+c2.getHeight()+"\n부피  : "+c2.getVolume());
	}

}
