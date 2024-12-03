package test;

public class Car {
//	클래스 정의
//	Car 클래스 정의 
//	=> 멤버변수 company, model, price
//	=> 메서드() run() "차가 달린다" 출력
	public String company;
	public String model;
	public int price;
	
//	생성자 생략 : 기억장소 할당, 초기값 할당
	public Car() {
		
	}
//	초기값을 받는 생성자 => 멤버변수 저장
	public Car(String company, String model, int price) {
//		지역변수, 매개변수 company, model, price
//		멤버변수 = 지역변수;
//		멤버변수 c.company, c.model, c.price
//		Car 안에 정의된 멤버변수 Car 속해있는 클래스.company
//		this: 자기자신클래스(자기자신주소), Car 속해있는 클래스    
//		this.company;
		
		this.company = company;
		this.model = model;
		this.price = price;
	}
	
	
	public void run() {
		System.out.println("차가 달린다");
	}
}
