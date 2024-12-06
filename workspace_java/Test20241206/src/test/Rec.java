package test;

public class Rec extends Shape{

//	Rec 사각형 자식 클래스 상속 Shape
//	메서드 오버라이딩 prn() "사각형을 그린다"
	
	@Override
	public void prn() {
		System.out.println("사각형을 그린다");
	}
	
}
