//��ǻ���а� 20190975 ��ȿ��
public class MaterialBox extends Box{
	private String attribute;
	int x2, y2, z2;
	
	public void setAttribute(String material) { this.attribute = material; }
	public String getAttribute () { return attribute; }
	
	public MaterialBox (int x, int y, int z, String a) { //������(constructor��ȯ'Ÿ��' ����
		super(x, y, z);
		x2 = x;
		y2 = y;
		z2 = z;
		this.attribute = a;
	}
	
	public void printInfo() {
		System.out.println("����: "+x2+", ����: "+y2+", ����: "+z2
		+"\n����: "+getAttribute()+"\n����: "+getVolume()+"\n����: "+getWeight());
	}
}
