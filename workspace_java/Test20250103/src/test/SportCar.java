package test;

public class SportCar extends Car{
//	The type SportCar cannot subclass the final class Car

//	SportCar 클래스 정의 상속 Car
//	메서드 오버라이딩  speedUp() 10증가, 
//	               stop() "스포츠카 멈춤", speed = 0
	
//	@Override
//	public void speedUp() {
//		speed += 10;
//	}

	@Override
	public void stop() {
//		Cannot override the final method from Car
		System.out.println("스포츠카 멈춤");
		speed = 0;
	}
	
}
