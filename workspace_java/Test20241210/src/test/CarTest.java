package test;

public class CarTest {

	public static void main(String[] args) {
//		p288
//		Car 추상클래스
//		run() 추상메서드()
//		refuel() 추상메서드()
//		stop() 일반메서드 "차가 멈춥니다"
		 
//		Bus 자식클래스 상속 Car
//		takePassenger() 일반메서드 "승객을 버스에 태움니다"
//		run() 추상메서드 재정의 "버스가 달린다"
//		refuel() 추상메서드 재정의 "천연가스를 충전합니다"
		
//		AutoCar 자식클래스 상속 Car
//		load() 일반메서드 "짐을 싣습니다"
//		run() 추상메서드 재정의 "차가 달린다"
//		refuel() 추상메서드 재정의 "휘발유를 주요합니다"
		
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();

	}

}
