package test;

public class Test1 {

	public static void main(String[] args) {
//		관계(비교) 연산자
//		1. 나이 age 변수 정의, 초기값 저장
		int age = 15;
//		관계식 => 나이가 20세 이상(크거나 같다)이면 T/F
//		출력
		System.out.println(age >= 20); //false
//		관계식 => 나이가 20세 미만(작다)이면 T/F
		System.out.println(age < 20); //true
		
//		2. 정수형 변수 num 정의 , 초기값 저장
		int num = -5;
//		관계식 => num 변수에 저장된 값이 음수(0보다 작으면)이면 T/F
//		출력
		System.out.println(num < 0);//true
//		관계식 => num 변수에 저장된 값이 양수(0보다 크다)이면 T/F
		System.out.println(num > 0);//false
//		관계식 => num 변수에 저장된 값이 0 (0 같다)이면 T/F
		System.out.println(num == 0);//false
		
//		논리연산자
//		1. 정수형 변수 num2 정의, 초기값 저장
//		관계연산자  논리연산자  관계연산자
//		num2가 4보다 큰 경우(관계)   num2가 7보다 작은 경우(관계)
//		두 경우를 모두 만족하면(논리연산자 연결) => true/false 
		int num2 = 5;
		System.out.println(num2 > 4  &&  num2 < 7);
		System.out.println(!(num2 > 4  &&  num2 < 7));
		
//		2. 정수형 변수 num3 정의, 초기값 저장
//		관계연산자  논리연산자  관계연산자
//		num3가 4보다 작거나 같은 경우(관계)   num3가 7보다 크거나 같은 경우(관계)
//		두 경우 중 하나의 경우가 만족하면(논리연산자 연결) => true/false 
		int num3 = 5;
//		System.out.println(관계연산자  논리연산자  관계연산자);
		System.out.println(num3 <= 4  ||  num3 >= 7);
		
//		3. char ch 변수 정의 , 초기값 저장
		char ch = 'A';
//		관계식 논리연산자 관계식
//		대문자 A(65) ~ Z(90) 이면 => true/false 
		System.out.println(ch >= 'A' && ch <= 'Z');
		System.out.println(ch >= 65 && ch <= 90);
		
//		4. 성별 정수형 변수 gender 정의 =>  1, 2, 3, 4 중에 초기값 저장
//		1, 3 중에 하나라도 있으면 남 => true 
//		2, 4 중에 하나라도 있으면 여 => false
//		관계식 논리연산자 관계식
		int gender = 2;
		System.out.println(gender == 1 || gender == 3);
		
	}

}
