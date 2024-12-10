package test;

public class CircleA extends AbsShape{

//	자식클래스 CircleA 상속 AbsShape
//	추상메서드 => 추상메서드 구현(메서드 오버라이딩) 원을 그린다
	@Override
	public void prn() {
		System.out.println("원을 그린다");
		
	}
}
