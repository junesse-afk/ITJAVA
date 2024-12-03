package test;

public class Test1 {

	public static void main(String[] args) {
		// 자바의 연산자
//		연산자 : 연산에 사용하는 기호 + - * / %
//		항 : 연산에 사용하는 값     3 + 4
//		단항연산자
//		이항연산자, 삼항연산자
//		연산자 우선순위 : () 괄호 우선순위 높음
//		0. () 괄호
//		1. 산술연산자 + - * / %
//		2. 비교연산자 == != > >= < <=
//		3. 논리연산자 && || !
//		4. 대입연산자 = 
		
		
//		1. 산술연산자 + - * / %	: 사칙연산  
//		산술연산자 우선순위 => * / % => + -
		System.out.println(10 + 2);//12
		System.out.println(10 - 2);//8
		System.out.println(10 * 2);//20
		System.out.println(10 / 2);//5
		System.out.println(10 % 2);//0
		
		// int형 변수(지역변수) a 선언하고 초기값 10 저장
		int a = 10;
		// int형 변수(지역변수) b 선언하고 초기값 3 저장
		int b = 3;
		// int형 변수(지역변수) c 선언 초기값 없음
		int c ;
		
		// a, b 변수를 이용해서 사칙연산하고 출력
		System.out.println(a + b);//13
		System.out.println(a - b);//7
		System.out.println(a * b);//30
		System.out.println(a / b);//3
		System.out.println(a % b);//1
		
		// a, b 사칙연산 => 결과 c 변수에 저장
		// c = a + b
		c = a + b;
		// 출력  a + b = c  => 10 + 3 = 13
		System.out.println("a + b = " + c); // + 연결자
		System.out.println( a + " + " + b + " = " + c);
		
		c = a - b;
		System.out.println("a - b = " + c); // + 연결자
		System.out.println( a + " - " + b + " = " + c);		
		
		c = a * b;
		System.out.println("a * b = " + c); // + 연결자
		System.out.println( a + " * " + b + " = " + c);			
		
		c = a / b;
		System.out.println("a / b = " + c); // + 연결자
		System.out.println( a + " / " + b + " = " + c);		
		
		c = a % b;
		System.out.println("a % b = " + c); // + 연결자
		System.out.println( a + " % " + b + " = " + c);	
		
//		수학점수 정수형 변수 math 초기값 90, 
//		영어점수 정수형 변수 eng 초기값 70,
//		국어점수 정수형 변수 kor 초기값 80
//		총점 정수형 변수 total 선언 초기값 점수 더해서 저장
//		평균 float 변수 avg 선언  초기값  총점에 과목수 나누어서 저장
		int math = 97;
		int eng = 75;
		int kor = 85;
		int total = math + eng + kor;
		System.out.println("총점 : " + total);
		System.out.println("총점 : " + (math + eng + kor));
		float avg = total / 3.0f;
		System.out.println("평균 : " + avg);
		System.out.println("평균 : " + (math + eng + kor) / 3.0f);
		

	}

}
