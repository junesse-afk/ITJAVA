package test;

public class AnimalSound {
//	AnimalSound 클래스 정의
//	리턴값 없음 animalSound(Animal animal) 메서드 정의
//	재정의 sound() 메서드 호출 => 다형성
	
	public void animalSound(Animal animal) {
//		Dog,Cat 상관없이 부모의 sound() 강제적으로 재정의된 메서드
		animal.sound(); // 다형성
		
//		if(animal instanceof Dog) {
//			System.out.println("Dog 객체");
//			animal.sound();
//		}
//		if(animal instanceof Cat) {
//			System.out.println("Cat 객체");
//			animal.sound();
//		}
	}
	
}
