//컴퓨터학과 20190975 신효경
public class Undergraduate extends Student{
	private int year;
	
	Undergraduate(){//초기화
		super();
		this.year = 0;
	}
	Undergraduate(int year){
		super(2222, 100, 4.1);
		this.year = year;
	}
	public String toString() {
		return "학번: "+getId()+", 등록금: "+getTuition()+", 평균등급: "+getGpa()+", 학년 : "+year;
	}
}
