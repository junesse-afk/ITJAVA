package test;

public class Test3 {

	public static void main(String[] args) {
//		2. 비교연산자(관계연산자) 
//		== 같다, != 같지않다(다르다), > 크다, >= 크거나 같다, < 작다, <= 작거나 같다
//		두 피연산자(항) 간의 대소 관계를 비교 => 결과 true/false 형
//		두 피연산자(항)는 형이 일치 => 연산 수행 
		
		int a = 10;
		int b = 5;
		System.out.println("a == b => " + (a == b)); //false
		System.out.println("a != b => " + (a != b)); //true
		System.out.println("a > b => " + (a > b)); //true
		System.out.println("a >= b => " + (a >= b)); //true
		System.out.println("a < b => " + (a < b)); //false
		System.out.println("a <= b => " + (a <= b)); //false
		
		boolean c = (a == b) ;
		System.out.println(c);//false
		
		char ch = 'A';  // 65
//		ch == 65
		System.out.println(ch == 'A');//true
		System.out.println(ch == 65);//true
		
//		3 == 3.0
		System.out.println(3 == 3.0);//true(3.0 == 3.0)
//		int == double 비교 => int형이 double 자동변환 후 비교
		
//		0.1 == 0.1f => 이상값 저장 (주의)
		System.out.println(0.1 == 0.1f);//false
//		double == float 연산 => float가 double 변환
//		=> 근사치 표현 0.1f => 0.1000004456
//		=> 서로 다른 값으로 인식되어서 false
		System.out.println((float)0.1 == 0.1f);//true
		
	}

}
