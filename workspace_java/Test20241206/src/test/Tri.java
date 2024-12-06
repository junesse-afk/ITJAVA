package test;

public class Tri extends Shape{

//	Tri 삼각형 자식 클래스 상속 Shape
//	메서드 오버라이딩 prn() "삼각형을 그린다"
	
	@Override
	public void prn() {
		System.out.println("삼각형을 그린다");
	}
	
}
