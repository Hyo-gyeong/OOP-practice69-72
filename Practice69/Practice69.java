//컴퓨터학과 20190975 신효경
import java.util.Scanner;
public class Practice69 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Shape s1 = new Shape();
		
		System.out.println("도형의 정보를 입력하세요.");
		System.out.print("중심좌표의 X값 :");
		s1.setX(input.nextInt());
		System.out.print("중심좌표의 Y값 :");
		s1.setY(input.nextInt());
		
		System.out.println();
		System.out.println("사각형의 정보를 입력하세요.");
		System.out.print("중심좌표의 X값 :");
		int x = input.nextInt();
		System.out.print("중심좌표의 Y값 :");
		int y = input.nextInt();
		System.out.println("가로의 길이 : ");
		int w= input.nextInt();		
		System.out.println("세로의 길이 : ");
		int h = input.nextInt();
		Rectangle r1 = new Rectangle(w, h);
		r1.setX(x);
		r1.setY(y);
		
		System.out.println();
		System.out.println("만들어진 도형의 정보는 다음과 같습니다.");
		System.out.println(s1.toString());
		r1.printInfo();
		
		input.close();
	}
}
