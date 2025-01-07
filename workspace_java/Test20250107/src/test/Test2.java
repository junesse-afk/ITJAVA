package test;

public class Test2 {

	public static void main(String[] args) {
//		Animal 추상클래스
//		멤버변수 문자열 kind
//		일반 메서드 breathe() "숨을 쉽니다"
//		추상 메서드 sound() 리턴값 없음
		
//		Dog 클래스 Animal 상속
//		Dog 생성자  kind = "포유류"
//		sound 메서드 오버라이딩  "멍멍" 출력
		
//		Cat 클래스 Animal 상속
//		Cat 생성자  kind = "포유류"
//		sound 메서드 오버라이딩  "야옹" 출력		
		
//		Dog 객체생성
//		sound메서드 호출
//		Cat 객체생성
//		sound메서드 호출
		Dog dog = new Dog();
		dog.sound();
		Cat cat = new Cat();
		cat.sound();
		System.out.println("=======================");
//		Dog Cat 부모 = 자식 객체생성  => 메서드 호출
		Animal animal1 = new Dog();
		System.out.println(animal1.kind);
		animal1.breathe();
		animal1.sound(); // 멍멍 => 다형성
		
		Animal animal2 = new Cat();
		System.out.println(animal2.kind);
		animal2.breathe();
		animal2.sound(); // 야옹 => 다형성
		
		System.out.println("=======================");
//		AnimalSound 클래스 정의
//		리턴값 없음 animalSound(Animal animal) 메서드 정의
//		재정의 sound() 메서드 호출 => 다형성
		
//		AnimalSound 객체생성 =>animalSound  메서드 호출
		AnimalSound animalSound = 
				new AnimalSound();
		animalSound.animalSound(dog);
		animalSound.animalSound(cat);

	}

}
