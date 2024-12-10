package test;

public interface Calc {
//	인터페이스에서 선언한 변수는 컴파일과정에서 상수로 변환
//	객체생성 없이 바로 사용 가능
//	static final 생략
//	public static final int a = 10;
	public int a = 10;
	
	double PI = 3.14;
	int ERROR = -99999999;
	
//	인터페이스 Calc  정의 
//	추상메서드 정의 int add(int num1, int num2)
//	추상메서드 정의 int sub(int num1, int num2)
//	추상메서드 정의 int mul(int num1, int num2)
//	추상메서드 정의 int div(int num1, int num2)
	
	public int add(int num1, int num2);
	public int sub(int num1, int num2);
	public int mul(int num1, int num2);
	public int div(int num1, int num2);
	
//	인터페이스는 일반메서드 정의 못함
//	public void p() {
//		System.out.println("구현");
//	}
	
}
