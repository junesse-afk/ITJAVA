package test;

public class SuperAirplane extends Airplane{

//	SuperAirplane 클래스 정의 Airplane 상속
//	public static final 상수변수 정의 NORMAL = 1
//	public static final 상수변수 정의 SUPER = 2;
//	public 멤버변수 정수형 flyMode = NORMAL
//	fly() 메서드 재정의 
//	flyMode SUPER 같으면 "초고속 비행합니다"
//	              틀리면 부모.fly() 메서드 호출
	public static final int NORMAL = 1;
	public static final int SUPER = 2;
	int flyMode = NORMAL;
	@Override
	public void fly() {
		if(flyMode == SUPER) {
			System.out.println("초고속 비행합니다");
		}else {
			super.fly();
		}
	}
}
