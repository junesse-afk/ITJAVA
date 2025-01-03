package test;

class A{ }

class B extends A{ }
class C extends A{ }

class D extends B{ }
class E extends C{ }

public class Test3 {
	public static void main(String[] args) {
//		  A
//		B   C
//		D   E
		
//		B클래스 객체생성
		B b = new B();
//		C클래스 객체생성
		C c = new C();
//		D클래스 객체생성
		D d = new D();
//		E클래스 객체생성
		E e = new E();
		
//		A = B C D E 자식 업캐스팅 	
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		System.out.println(a1 instanceof B);
		B b2 = (B)a1;
		System.out.println(a2 instanceof C);
		C c2 = (C)a2;
		System.out.println(a3 instanceof D);
		D d2 = (D)a3;
		System.out.println(a4 instanceof E);
		E e2 = (E)a4;
		
		System.out.println("-------------------");
		
//		B = d, C = e  업캐스팅
		B b1 = d;
		C c1 = e;
		System.out.println(b1 instanceof D);
		D d3 = (D)b1;
		System.out.println(c1 instanceof E);
		E e3 = (E)c1;
//		B = e, C = d  업캐스팅
//		B b2 = e;
//		C c2 = d;
		System.out.println(b1 instanceof D);
		System.out.println(c1 instanceof E);

	}

}
