package test;

public class Test4 {

	public static void main(String[] args) {
//		인터페이스 Calc  정의 
//		추상메서드 정의 int add(int num1, int num2)
//		추상메서드 정의 int sub(int num1, int num2)
//		추상메서드 정의 int mul(int num1, int num2)
//		추상메서드 정의 int div(int num1, int num2)
		
//		상속받은  클래스 Calculator
		
		Calc calc = new Calculator();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.sub(10, 20));
		System.out.println(calc.mul(10, 20));
		System.out.println(calc.div(10, 20));
		
//		인터페이스 Calc2  정의 
//		추상메서드 정의 prn()
		
		Calc2 calc2 = new Calculator();
		calc2.prn();
		
	}

}
