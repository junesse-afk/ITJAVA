package test;

public class Singleton {
//	Singleton 클래스 정의
//	private static Singleton 멤버변수 선언 = new Singleton 객체생성
//	private 기본생성자
//  static Singleton 리턴 getInstance() 메서드 
//	=> 리턴 Singleton 멤버변수 
	private static Singleton singleton = new Singleton();
//	기본생성자
	private Singleton() {
	}
	public static Singleton getInstance() {
		return singleton;
	}
	
}
