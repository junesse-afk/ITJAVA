package test;

import test.A.B;

public class Test1 {

	public static void main(String[] args) {
//		내부클래스, 중첩클래스, 중첩인터페이스
//		멤버클래스(인스턴스 멤버클래스, 정적 멤버클래스)
//		로컬클래스(메서드 실행 할때 동작하는 클래스)
//		A 클래스 객체생성
		A a = new A();
		
//		인스턴스 B 클래스 객체생성, 멤버변수 field1 = 3, method1() 호출
//		A.B b = a.new B();  
//		b.field1 = 3;
//		System.out.println(b.field1);
//		b.method1();
		
		a.methodB();
//		A클래스 멤버변수 B b;
//		A클래스 생성자 b = new B();
//		A클래스 methodB() b.method1();
		
//		static C 클래스 객체생성, 멤버변수 field1 = 3, method1() 호출
//		                멤버변수 field2 = 3, method2() 호출
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
//		A 클래스 method() 메서드 호출
		a.method();

	}

}
