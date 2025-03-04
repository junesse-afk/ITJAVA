package test;

public class Test4 {

	public static void main(String[] args) {
//		RemoteControl 인터페이스
//		추상메서드 turnOn()
//		추상메서드 turnOff()
		
//		Anonymous2 클래스 정의
//		부모 인터페이스 변수field = new 부모인테페이스() {}
//		turnOn "TV를 켭니다"
//		turnOff "TV를 끕니다"
		
//		method1() 메서드
//		부모 인터페이스 변수localVar = new 부모인테페이스() {}
//		turnOn "Audio를 켭니다"
//		turnOff "Audio를 끕니다"
//		localVar.turnOn() 메서드 호출
		
//		method2(RemoteControl rc) 메서드
//		turnOn() 메서드 호출

		
//		Anonymous2 객체생성
		Anonymous2 anonymous2 = new Anonymous2();
//		익명객체변수 field  사용 turnOn() 메서드 호출
		anonymous2.field.turnOn();
//		method1() 호출
		anonymous2.method1();
//		method2(익명객체 RemoteControl생성) 호출
//		익명객체 => turnOn()메서드 정의 "SmartTV를 켭니다"
//		          turnOff() 메서드 재정의 "SmartTV를 끕니다" 호출
		anonymous2.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다");
			}
		});
		
	}

}
