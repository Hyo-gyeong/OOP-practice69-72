//��ǻ���а� 20190975 ��ȿ��
public class Undergraduate extends Student{
	private int year;
	
	Undergraduate(){//�ʱ�ȭ
		super();
		this.year = 0;
	}
	Undergraduate(int year){
		super(2222, 100, 4.1);
		this.year = year;
	}
	public String toString() {
		return "�й�: "+getId()+", ��ϱ�: "+getTuition()+", ��յ��: "+getGpa()+", �г� : "+year;
	}
}
