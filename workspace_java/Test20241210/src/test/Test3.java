package test;

public class Test3 {

	public static void main(String[] args) {
//		p314
//		인터페이스 InterAnimal
//		public interface 인터페이스이름{
//			추상메서드() 정의 => abstract 생략가능
//		}
		
//		인터페이스 상속 받은 클래스 EagleInter
		
//		인터페이스 상속 받은 클래스 TigerInter
		
//		부모 인터페이스 = 틀을 구현한 자식 클래스 (업캐스팅,다형성)
//		InterAnimal interAnimal = new InterAnimal();
		InterAnimal interAnimal = new EagleInter();
		interAnimal.move();
		
		interAnimal = new TigerInter();
		interAnimal.move();

	}

}
