//컴퓨터학과 20190975 신효경
public class Practice70 {

	public static void main(String[] args) {
		MaterialBox b1 = new MaterialBox(2, 3, 4, "wood");
		MaterialBox b2 = new MaterialBox(10, 5, 5, "paper");
		
		System.out.println("box1의 정보입니다.");
		b1.printInfo();
		
		System.out.println("\nbox2의 정보입니다.");
		b2.printInfo();
	}

}
