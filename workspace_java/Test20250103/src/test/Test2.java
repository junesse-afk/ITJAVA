package test;

public class Test2 {

	public static void main(String[] args) {
//		참조형의 형변환(부모 자식 상속관계)
//		자동 형변환 (부모 = 자식) 업캐스팅
//		명식적 형변환 (자식 = 업캐스팅된 부모) 다운캐스팅
		
//		자식 = 부모
//		Exception in thread "main" 
//		java.lang.ClassCastException:
//		class test.Car cannot be cast to class test.SportCar 
		
//		SportCar sportCar = (SportCar)new Car();
//		sportCar.speedUp();
//		sportCar.stop();
		
		
//		부모 = 자식 (업캐스팅)
		Car car = new SportCar();
		car.speedUp();
		System.out.println(car.speed);
		car.stop();
		System.out.println(car.speed);
		
		System.out.println(car instanceof SportCar);
		
//		자식 = (명시적 형변환)업캐스팅된 부모 (다운캐스팅)
		SportCar sportCar = (SportCar)car;
		sportCar.speedUp();
		System.out.println(sportCar.speed);
		sportCar.stop();
		System.out.println(sportCar.speed);
		

	}

}
