package test;

public class Calculator {
//	Calculator 클래스 정의
//	멤버변수 정의 : color 인스턴스 멤버변수 정의 
//	       : double pi 스태틱(클래스, 정적) 멤버변수 정의
//	메서드() 정의 :  prn() 인스턴스 메서드 출력 
//	: plus(int x, int y) 스태틱(클래스, 정적) 메서드 정의
//	 => 두 수 더한 값 리턴 
//  : minus(int x, int y) 스태틱(클래스, 정적) 메서드 정의
//	 => 두 수 뺀 값 리턴
	String color;  //인스턴스 멤버변수
	static double pi; //스태틱(클래스, 정적) 멤버변수
//	1) 객체생성하지 않고 클래스.멤버변수 접근 바로해서 사용
//	2) 클래스 단에 기억장소 만들어짐 => 공용 기억장소 사용
	public void prn() { //인스턴스 메서드
		System.out.println(color + ":" + pi);
	}
	public static int plus(int x, int y) {
//스태틱(클래스, 정적) 메서드 : 스태틱(클래스, 정적) 멤버변수 만 사용
//		System.out.println(color + ":" + pi); //에러
		return x + y;
	}
	public static int minus(int x, int y) {
//		스태틱(클래스, 정적) 메서드 : 스태틱(클래스, 정적) 멤버변수 만 사용
//		System.out.println(color + ":" + pi);
		return x - y;
	}
	
}
