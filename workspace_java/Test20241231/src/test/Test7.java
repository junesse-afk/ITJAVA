package test;

public class Test7 {

	public static void main(String[] args) {
//		메서드 재정의(메서드 오버라이딩) : 상속 관계 일때 
//		부모의 메서드를 자식이 재정의 사용
		
//		Computer클래스 정의 Cal상속
//		areaCircle() 메서드 재정의 Math.PI 이용 

//		Computer 객체생성
		Computer computer = new Computer();
//		areaCircle 메서드 호출
		System.out.println("원면적 : " + computer.areaCircle(10));
	}

}
