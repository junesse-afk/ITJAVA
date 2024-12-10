package test;

public class Test5 {

	public int num = 10;
	public final int NUM = 100;
//	객체생성없이 상수변수 사용
	public static final int NUM2 = 500;
	
	public static void main(String[] args) {
		System.out.println(NUM2);
		System.out.println(Test5.NUM2);
//		final 예약어
//		final 멤버변수 : 수정 못하게 막아줌, 상수변수 
//		final 메서드() : 메서드 오버라이딩(재정의) 할 수 없음
//		final 클래스 : 상속을 할 수 없음
		Test5 test5 = new Test5();
		test5.num = 20;
//		final 멤버변수 : 수정 못하게 막아줌, 상수변수 
//		test5.NUM = 200;
//		Test5.NUM2 = 1000;
		
		System.out.println(test5.num);
		System.out.println(test5.NUM);
	}

}
