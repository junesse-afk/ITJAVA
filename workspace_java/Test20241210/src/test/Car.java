package test;

public abstract class Car {
//	Car 추상클래스
//	run() 추상메서드()
	public abstract void run();
//	refuel() 추상메서드()
	public abstract void refuel();
//	stop() 일반메서드 "차가 멈춥니다"
	public void stop() {
		System.out.println("차가 멈춥니다");
	}
}
