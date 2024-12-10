package test;

public class AutoCar extends Car{
//	AutoCar 자식클래스 상속 Car
//	load() 일반메서드 "짐을 싣습니다"
//	run() 추상메서드 재정의 "차가 달린다"
//	refuel() 추상메서드 재정의 "휘발유를 주유합니다"
	public void load() {
		System.out.println("짐을 싣습니다");
	}
	@Override
	public void run() {
		System.out.println("차가 달린다");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다");
		
	}

}
