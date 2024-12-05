package test;

public class Tiger extends Animal{


	
//	자식클래스 Tiger 상속 Animal
	
//	부모의 메서드 재정의(수정)
//	public void move() {
////		부모의 메서드 호출()
//		super.move();
//		System.out.println("move() 호랑이 네 발로 움직인다");
//	}
	
	@Override
	public void move() {
		System.out.println("move() 호랑이 네 발로 움직인다");
	}	
	
//	메서드 moveTiger() 출력 "호랑이 네 발로 움직인다"
//	public void moveTiger() {
//		System.out.println("moveTiger() 호랑이 네 발로 움직인다");
//	}
}
