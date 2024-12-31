package test;

public class SportsCar extends Car{

	//클래스 SportsCar 정의 Car 상속
	// 멤버변수 model
	String model;
//	기본생성자 =>상속할때 부모의 기본생성자 호출(생략)
	public SportsCar() {
//		기본생성자가 없을때 => 부모의 특정 생성자 호출
		super("파란색", 2000);
		System.out.println("SportsCar() 기본생성자");
	}
	//model 값을 받아서 생성자 구현 (부모의 생성자 호출)
	public SportsCar(String model) {
		super("빨간색", 1000);
		this.model = model;
	}
	
	// 메서드 sportsPrn() 정의 color:cc:model
	public void sportsPrn() {
//		부모의 메서드 호출
		super.prn();
		System.out.println(color + ":" + cc + ":" + model);
	}
}
