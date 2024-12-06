package test;

public class Test2 {

	public static void main(String[] args) {
//		메서드 오버라이딩
//		다형성 : 메서드 이름은 동일한데 메서드 내에 동작내용 다름
		
//		패키지 test 파일 Shape 도형 부모 클래스
//		prn() "도형을 그린다"
		
//		Circle 원 자식 클래스 상속 Shape
//		메서드 오버라이딩 prn() "원을 그린다"
		
//		Tri 삼각형 자식 클래스 상속 Shape
//		메서드 오버라이딩 prn() "삼각형을 그린다"
		
//		Rec 사각형 자식 클래스 상속 Shape
//		메서드 오버라이딩 prn() "사각형을 그린다"
		
//		다형성
//		: 상위클래스 공통 부분의 메서드를 제공
//		: 하위클래스 추가요소를 더하면
//		: 코드 양도 줄어들고 유지보수도 편리
		
//		Circle 객체생성  prn() 메서드 호출
		Circle circle = new Circle();
		circle.prn();
		
//		Tri 객체생성  prn() 메서드 호출
		Tri tri = new Tri();
		tri.prn();
		
//		Rec 객체생성  prn() 메서드 호출
		Rec rec =  new Rec();
		rec.prn();
		
		//-----------------------------
		
//		기본자료형 형변환
//		자동으로 형변환 실수 = 정수
		double a = 3;
		System.out.println(a);//3.0
		
//		명시적으로 형변환  정수 = (정수형으로 명시적 형변환)실수
		int b = (int)3.5;
		System.out.println(b);//3
		
//		참조형의 형변환
//		자동으로 형변환  부모 = 자식 객체생성
//		명시적으로 형변환 자식 = (자식형으로 명시적 형변환)부모
		
		
	}

}
