package test;

public class Parent {

//	기본생성자
//	public Parent() {
////		자기 자신 생성자 호출
//		this(5);
//		System.out.println("Parent 기본생성자");
//	}
	
//	하나의 정수형 값을 받는 생성자
	public Parent(int a) {
		System.out.println("Parent 값을 받는 생성자");
	}
	
	
	public void parentPrn() {
		System.out.println("부모메서드");
	}
	
}
