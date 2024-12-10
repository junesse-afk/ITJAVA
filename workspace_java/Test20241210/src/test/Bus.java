package test;

public class Bus extends Car{
//	Bus 자식클래스 상속 Car
//	takePassenger() 일반메서드 "승객을 버스에 태움니다"
//	run() 추상메서드 재정의 "버스가 달린다"
//	refuel() 추상메서드 재정의 "천연가스를 충전합니다"
	public void takePassenger() {
		System.out.println("승객을 버스에 태움니다");
	}
	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}
	@Override
	public void refuel() {
		System.out.println("천연가스를 충전합니다");
	}

}
