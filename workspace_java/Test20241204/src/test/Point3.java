package test;

import point.Point2;

public class Point3 extends Point2{
//	Point3 클래스 정의 Point2 상속
//	멤버변수 private int z
//	public set, get메서드
//	메서드() public prn3() x,y,z 출력
	
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
//	상속관계 private (클래스 내) 접근 못함
//	=> public (모두접근), 생략 package(같은폴더)
//	=> protected(다른폴더 중에 상속관계일 경우에만 접근 가능)
	public void prn3() {
		System.out.println(x + "," + y + "," + z);
	}
	
}
