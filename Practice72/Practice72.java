//컴퓨터학과 20190975 신효경
public class Practice72 {

	public static void main(String[] args) {
		Student s = new Student(1111);
		Undergraduate u = new Undergraduate(3);
		Graduate g = new Graduate("SE");
		
		s.setTuition(100);
		s.setGpa(3.2);
		System.out.println(s.toString());
		System.out.println(u.toString());
		System.out.println(g.toString());
	}
}
