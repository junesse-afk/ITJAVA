package test;

public class Car {
	// Car 클래스 정의
	// 멤버변수 carName, 정수형 speed
	// 기본생성자 => 자동으로 만들어짐
	//          => 생성자 정의해서 carName = "국민차"
	//          => speed = 10;
	// 메서드() => speedUp(속도를 전달 받는 변수) 정의
	//            speed 속도를 증가하고 리턴
	//         => speedDown(속도를 전달 받는 변수) 정의
	//            speed 속도를 감소하고 리턴
//	멤버변수
	public String carName;
	public int speed;
	
//	기본생성자
	public Car() {
		System.out.println("기본생성자");
		this.carName = "국민차";
		this.speed = 10;
	}

//	메서드
	public int speedUp(int s) {
		speed += s;
		return speed;
	}
	
	public int speedDown(int s) {
		speed -= s;
		return speed;
	}
	
	
}
