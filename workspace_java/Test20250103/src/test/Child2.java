package test;

public class Child2 extends Parent{
	@Override
	public void prn() {
System.out.println("Parent prn() 부모의 메서드 Child2 재정의");
	}

	public void child2Prn() {
		System.out.println("Child2 child2Prn()");
	}
}
