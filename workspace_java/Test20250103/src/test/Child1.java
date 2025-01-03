package test;

public class Child1 extends Parent{

	@Override
	public void prn() {
System.out.println("Parent prn() 부모의 메서드 Child1 재정의");
	}

	public void child1Prn() {
		System.out.println("Child1 child1Prn()");
	}
	
}
