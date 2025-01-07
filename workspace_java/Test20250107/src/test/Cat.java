package test;

public class Cat extends Animal{

//	Cat 클래스 Animal 상속
//	Cat 생성자  kind = "포유류"
	public Cat() {
		this.kind = "포유류";
	}
//	sound 메서드 오버라이딩  "야옹" 출력
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
