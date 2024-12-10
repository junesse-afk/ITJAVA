package test;

public class Test2 {

	public static void main(String[] args) {
//		추상클래스 AbsShape
//		public void prn() 추상메서드
//		일반메서드 method() "AbsShape 추상클래스 일반메서드()" 출력
		
//		자식클래스 CircleA 상속 AbsShape
//		추상메서드 => 추상메서드 구현(메서드 오버라이딩) 원을 그린다
		
//		자식클래스 TriA 상속 AbsShape
//		추상메서드 => 추상메서드 구현(메서드 오버라이딩) 삼각형을 그린다
		
//		자식클래스 RecA 상속 AbsShape
//		추상메서드 => 추상메서드 구현(메서드 오버라이딩) 사각형을 그린다
		
		AbsShape absShape = new CircleA();
		absShape.prn(); //추상메서드 재정의
		absShape.method();//일반메서드
		
		absShape = new TriA();
		absShape.prn();//추상메서드 재정의
		absShape.method();//일반메서드
		
		absShape = new RecA();
		absShape.prn();//추상메서드 재정의
		absShape.method();//일반메서드
		System.out.println("--------------------");
		School school = new School();
		
		CircleA circleA = new CircleA();
		school.draw(circleA);
		
		TriA triA = new TriA();
		school.draw(triA);
		
		RecA recA = new RecA();
		school.draw(recA);
	}

}
