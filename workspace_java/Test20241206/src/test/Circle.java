package test;

public class Circle extends Shape{

//	Circle 원 자식 클래스 상속 Shape
//	메서드 오버라이딩 prn() "원을 그린다"
	
//	p252
//	@Override : @ 어노테이션(Annotation) Override 이름
//	: 자바에서 제공하는 어노테이션은 컴파일러에게 특정한 정보를 제공
//	: 부모의 메서드를 재정의 한것을 컴파일러에게 정보 제공
//	: 자바 표준 어노테이션
	
	@Override
	public void prn() {
		System.out.println("원을 그린다");	
	}
	
	public void cirprn() {
		System.out.println("cirprn() 원을 그린다");	
	}
	
}
