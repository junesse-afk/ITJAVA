package test;

public class Anonymous2 {
//	Anonymous2 클래스 정의
//	부모 인터페이스 변수field = new 부모인테페이스() {}
//	turnOn "TV를 켭니다"
//	turnOff "TV를 끕니다"
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
	};
	
//	method1() 메서드
//	부모 인터페이스 변수localVar = new 부모인테페이스() {}
//	turnOn "Audio를 켭니다"
//	turnOff "Audio를 끕니다"
//	localVar.turnOn() 메서드 호출
	public void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다");
			}
		};
		localVar.turnOn();
	}
	
//	method2(RemoteControl rc) 메서드
//	turnOn() 메서드 호출
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
