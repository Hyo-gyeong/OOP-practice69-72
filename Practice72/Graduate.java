//��ǻ���а� 20190975 ��ȿ��
public class Graduate extends Student{
	private String lab;
	
	Graduate() {	//�ʱ�ȭ
		super();
		this.lab = "";
	}
	Graduate(String lab) {
		super(3333, 100, 3.4);
		this.lab = lab;
	}
	public String toString() {
		return "�й�: "+getId()+", ��ϱ�: "+getTuition()+", ��յ��: "+getGpa()+", ������: "+lab;
	}
}
