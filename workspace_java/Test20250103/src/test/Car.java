package test;

public /* final */ class Car {
//    final class => 상속을 못하게 막아 줌
	
//	Car 클래스 정의
//	멤버변수 정수형 speed
	/* final */ int speed = 0;
//	final : 초기값 제외 값을 수정 못하게 막아 줌
	
//	메서드() speedUp() 멤버변수 speed + 1증가
	public void speedUp() {
//		The final field Car.speed cannot be assigned
		speed += 1;
	}
//	메서드() stop() "차를 멈춤", speed = 0 변경 
//	=> stop 메서드 메서드 오버라이딩(재정의) 못하게 정의
	public /* final */ void stop() {
//		final : 메서드 오버라이딩(재정의) 못하게 막아 줌
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
}
