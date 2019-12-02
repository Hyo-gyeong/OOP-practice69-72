//컴퓨터학과 20190975 신효경
public class Box {
	private int x;
	private int y;
	private int z;
	private boolean empty;
	
	public void fillBox() {empty = false;}
	public void emptyBox() {empty = true;}
	
	public Box(int x, int y, int z) {
		 this.x = x;
		 this.y = y;
		 this.z = z;
		 emptyBox();
	}
	 
	public int getVolume() {
		return x * y * z;			
	}
	public double getWeight() {
		return getVolume() * 1.1;
	}
		
	public String toString() {
		
		if (empty == true) {
			return "가로: "+x+"cm\n세로: "+y+"cm\n높이: "+z+"cm\n"
					+ "지금 박스는 비어 있습니다.";
		}
		else {
			return "가로: "+x+"cm\n세로: "+y+"cm\n높이: "+z+"cm\n"
					+ "지금 박스에는 물건이 들어 있습니다.";
		}
	}
}
