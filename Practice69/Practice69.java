//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice69 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Shape s1 = new Shape();
		
		System.out.println("������ ������ �Է��ϼ���.");
		System.out.print("�߽���ǥ�� X�� :");
		s1.setX(input.nextInt());
		System.out.print("�߽���ǥ�� Y�� :");
		s1.setY(input.nextInt());
		
		System.out.println();
		System.out.println("�簢���� ������ �Է��ϼ���.");
		System.out.print("�߽���ǥ�� X�� :");
		int x = input.nextInt();
		System.out.print("�߽���ǥ�� Y�� :");
		int y = input.nextInt();
		System.out.println("������ ���� : ");
		int w= input.nextInt();		
		System.out.println("������ ���� : ");
		int h = input.nextInt();
		Rectangle r1 = new Rectangle(w, h);
		r1.setX(x);
		r1.setY(y);
		
		System.out.println();
		System.out.println("������� ������ ������ ������ �����ϴ�.");
		System.out.println(s1.toString());
		r1.printInfo();
		
		input.close();
	}
}
