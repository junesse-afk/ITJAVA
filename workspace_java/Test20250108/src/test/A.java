package test;

public class A {
	B b;
// 기본 생성자
	public A() {
		System.out.println("A 생성자");
		 b = new B();
	}
//	인스턴스 클래스 B
//	=> B 생성자, 멤버변수 int field1, static int field2,
//	=> 메서드 method1, static 메서드 method2
	class B{
		public B() {
			System.out.println("B 생성자");
		}
		int field1;
//		static int field2;
		public void method1() {
			System.out.println("B클래스 method1");
		}
//		public static void method2() {
//			System.out.println("B클래스 method2");
//		}
	}//B 클래스
	
//	정적(static, 클래스) 클래스 C
//	=> C 생성자, 멤버변수 int field1, static int field2
//	=> 메서드 method1, static 메서드 method2
	static class C{
		public C() {
			System.out.println("C 생성자");
		}
		int field1;
		static int field2;
		public void method1() {
			System.out.println("C클래스 method1");
		}
		public static void method2() {
			System.out.println("C클래스 method2");
		}
	}//C 클래스
//	리턴값없음 method 메서드( 클래스D )
//	=> D생성자, 멤버변수 int field1, static int field2
//	=> 메서드 method1, static 메서드 method2
//	=> D객체생성, field1 = 3, method1() 호출
	public void method() {
		class D{
			public D() {
				System.out.println("D 생성자");
			}
			int field1;
//			static int field2;
			public void method1() {
				System.out.println("D클래스 method1");
			}
//			public static void method2() {
//				System.out.println("D클래스 method2");
//			}
		}//D 클래스
		D d = new D();
		d.field1 = 3;
		d.method1();
		
	}//method()
	
	public void methodB() {
		b.method1();
	}
	
}//A 클래스 

