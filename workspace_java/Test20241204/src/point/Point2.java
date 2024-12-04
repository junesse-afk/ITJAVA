package point;

public class Point2 {
//	Point2 클래스 정의
//	멤버변수 protected int x, int y 
//	public set, get 메서드
//	메서드() public prn2() x,y 출력
	
//	private int x;
//	private int y;
	
//	int x;
//	int y;
	
	protected int x;
	protected int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void prn2() {
		System.out.println(x + "," + y);
	}
	
}
