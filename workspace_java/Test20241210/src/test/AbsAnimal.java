package test;

public abstract class AbsAnimal {
//	추상클래스 AbsAnimal
//	멤버변수 String name
	private String name;
//	메서드() prn() "추상클래스 일반메서드" 출력
	public void prn() {
		System.out.println("추상클래스 일반메서드");
	}
//	추상메서드() => 메서드 틀
//	public abstract void move();
	public abstract void move();
	
}
