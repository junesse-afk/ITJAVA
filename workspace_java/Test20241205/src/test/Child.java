package test;

public class Child extends Parent{
	
	public Child() {
//		부모 Parent 객체생성=> 부모의 기본생성자 Parent()
//		부모의 다른 생성자 호출 => super()
		super(100);
		System.out.println("Child 기본생성자");
	}
	
//	extends Parent 코드를 상속 받아서 사용
	public void chardPrn() {
		System.out.println("자식메서드");
	}
	
}
