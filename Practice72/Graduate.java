//컴퓨터학과 20190975 신효경
public class Graduate extends Student{
	private String lab;
	
	Graduate() {	//초기화
		super();
		this.lab = "";
	}
	Graduate(String lab) {
		super(3333, 100, 3.4);
		this.lab = lab;
	}
	public String toString() {
		return "학번: "+getId()+", 등록금: "+getTuition()+", 평균등급: "+getGpa()+", 연구실: "+lab;
	}
}
