package test;

public abstract class Phone {
//	Phone 추상클래스 
//	멤버변수 문자열 owner
	String owner;
//	owner 받는 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
//	turnOn() 폰 전원을 켭니다 메시지 출력
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
//	turnOff() 폰 전원을 끕니다 메시지 출력
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
//	추상메서드 리턴값없음 sound() 틀
	public abstract void sound();
}
