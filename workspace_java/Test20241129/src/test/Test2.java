package test;

public class Test2 {

	public static void main(String[] args) {
//		클래스 Car정의
//		static 멤버변수 kind 차 종류
//		인스턴스 멤버변수 price 차 가격
//		static 메서드() prn()   static 멤버변수 출력 
//		인스턴스 메서드() prn2()  kind, price 출력
//		------------------------------
//		kind static 멤버변수(클래스 멤버변수)에 값 저장
		Car.kind = "소나타";
//		Car.price = 1000;
		
//		Car객체생성
		Car c = new Car();
//		price 인스턴스 멤버변수 값 저장
		c.price = 1000;
//		prn(), prn2() 메서드 호출
		Car.prn();
//		Car.prn2();
		c.prn2();
		System.out.println("-----------------");
//		Car객체생성
		Car c2 = new Car();
//		price 인스턴스 멤버변수 값 저장
		c2.price = 2000;
//		prn(), prn2() 메서드 호출
		Car.prn();
		c2.prn2();
	}

}
