package test;

public class Car {
//	클래스 Car정의
//	static 멤버변수 kind 차 종류
//	인스턴스 멤버변수 price 차 가격
//	static 메서드() prn()   static 멤버변수 출력 
//	인스턴스 메서드() prn2()  kind, price 출력
	
	public static String kind;
	public int price;
	
	public static void prn() {
		System.out.println(kind);
//		System.out.println(price);
	}
	
	public void prn2() {
		System.out.println(kind);
		System.out.println(price);
	}
	
}
