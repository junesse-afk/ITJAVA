package test;

public class Test4 {

	public static void main(String[] args) {
		//클래스 SportsCar 정의 Car 상속
		// 멤버변수 model
		// 메서드 sportsPrn() 정의 color:cc:model
		
//		SportsCar 객체생성
		SportsCar sportsCar = new SportsCar();
		System.out.println(sportsCar);
//		메서드 호출 prn(), sportsPrn()
		sportsCar.prn();
		sportsCar.sportsPrn();
		
		SportsCar sportsCar2 = new SportsCar("스포츠");
		System.out.println(sportsCar2);
		sportsCar2.prn();
		sportsCar2.sportsPrn();
	}

}
