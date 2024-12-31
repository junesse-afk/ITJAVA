package test;

public class User2 extends Thread{
	// 상속 Thread
	// 멤버변수 Calculator calculator정의 
	private Calculator calculator;

	// set메서드() => 쓰레드 이름 저장 this.setName("User2")
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}

	// run() 메서드 오버라이딩 => setMemory(20) 호출
	@Override
	public void run() {
		calculator.setMemory(20);
	}
}
