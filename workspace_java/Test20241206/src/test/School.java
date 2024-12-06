package test;

public class School {
	
//	메서드 정의 : 리턴값 없음 draw(원, 삼각형, 사각형,...)
//	출력 "모든 도형 그리기", prn() 메서드 호출
	
	public void draw(Shape shape) {
		System.out.println("모든 도형 그리기");
		shape.prn();
//		shape.cirprn();
	}
	
//	public void cirdraw(Circle circle) {
//		System.out.println("모든 도형 그리기");
//		circle.prn();
//	}
	
//	public void tridraw(Tri tri) {
//		System.out.println("모든 도형 그리기");
//		tri.prn();
//	}
	

}
