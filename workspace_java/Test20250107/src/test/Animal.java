package test;

public abstract class Animal {
//	Animal 추상클래스
//	멤버변수 문자열 kind
	String kind;
//	일반 메서드 breathe() "숨을 쉽니다"
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
//	추상 메서드 sound() 리턴값 없음
	public abstract void sound();
}
