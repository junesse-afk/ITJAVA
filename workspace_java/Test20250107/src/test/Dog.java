package test;

public class Dog extends Animal{

//	Dog 클래스 Animal 상속
//	Dog 생성자  kind = "포유류"
	public Dog() {
		this.kind = "포유류";
	}
//	sound 메서드 오버라이딩  "멍멍" 출력
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
