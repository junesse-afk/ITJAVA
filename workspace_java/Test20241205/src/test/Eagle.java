package test;

public class Eagle extends Animal{


//	자식클래스 Eagle 상속 Animal
	
//	public void move() {
//		System.out.println("move() 독수리 날개로 움직인다");
//	}
	
	@Override
	public void move() {
		super.move();
		System.out.println("move() 독수리 날개로 움직인다");
	}
	
//	메서드 moveEagle() 출력 "독수리 날개로 움직인다"
//	public void moveEagle() {
//		System.out.println("moveEagle() 독수리 날개로 움직인다");
//	}
}
