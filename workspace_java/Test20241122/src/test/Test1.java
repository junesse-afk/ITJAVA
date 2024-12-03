package test;

public class Test1 {

	public static void main(String[] args) {
//		클래스 정의
//		Car 클래스 정의 
//		=> 멤버변수 company, model, price
//		=> 메서드() run() "차가 달린다" 출력
		
//		Car 클래스 변수 선언 = new 객체생성(기억장소 할당,초기값 할당)
//		                        인스턴스 화
//		Car 정의된 클래스(설계도)에 대한 객체(인스턴스) 생성
//		new Car() 메모리(힙 Heap)에 인스턴스 생성 => 주소 부여
//		주소값을 Car c 지역변수,참조변수에 저장 
		int a = 10;
//		생성자 : 객체생성을 담당, 클래스 이름()
		Car c = new Car();
		System.out.println("Car 주소 : " + c);
//		멤버변수 호출 값 저장, 출력
		c.company = "현대";
		c.model = "소나타";
		c.price = 1000;

		System.out.println(c.company);
		System.out.println(c.model);
		System.out.println(c.price);
		
//		메서드() 호출
		c.run();
				
	}

}
