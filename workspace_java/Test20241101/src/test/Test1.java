package test;


public class Test1 {

	public static void main(String[] args) {
		//제어문
		//1. 조건문(if, switch case)
		//2. 반복문(for, while, do while)

//		조건문 if : 조건에 따라 문장(명령)을 선택
//		조건의 결과 => boolean 형 true/false
//		조건 => 관계연산자 논리연산자 사용
//		나이가 8살 이상(크거나 같으면)이면 학교에 다닙니다
//        그렇지 않다면 학교에 다니지 않습니다.
		
//		삼항연산자 => 조건문 ? 참값 : 거짓값
		
//		if(조건문 : 나이가 8살 이상 이면) {
//			조건의 결과가 true(참) 이면 실행할 문장
//			학교에 다닙니다
//		}else {
//			조건의 결과가 false(거짓) 이면 실행할 문장
//			학교에 다니지 않습니다.
//		}
		
		int age = 5;
		System.out.println(age >= 8);
		if(age >= 8) {
			System.out.println("나이 : " + age);
			System.out.println("학교에 다닙니다");
		}else {
//			age < 8
			System.out.println("나이 : " + age);
			System.out.println("학교에 다니지 않습니다.");
		}
		
//		char 형 변수 gender 선언 = 초기값 'F'
//		gender가 'F'이면 "여성입니다" 출력
//				아니면 "남성입니다" 출력
		char gender = 'F';
		String s = "";
		if(gender == 'F') {
			System.out.println("성별 : " + gender);
			System.out.println("여성입니다");
			s = "여성";
		}else {
			System.out.println("성별 : " + gender);
			System.out.println("남성입니다");
			s = "남성";
		}
		System.out.println(s);
		
		int num = 9;
//		if else
//		홀수 : 수에 2로 나누어서 나머지가 1 이면 => 홀수 출력 
//		짝수 : 수에 2로 나누어서 나머지가 0 이면 => 짝수 출력(2의 배수)
		if(num % 2 == 1) {
			System.out.println(num + ": 홀수");
		}else {
//			num % 2 == 0
			System.out.println(num + ": 짝수");
		}
		
//		3의 배수 : 수에 3로 나누어서 나머지가 0이면 => 3의 배수 출력
//		                                0이 아니면 => 3의 배수 아님
		if(num % 3 == 0) {
			System.out.println(num + ": 3의 배수");
		}else {
			System.out.println(num + ": 3의 배수 아님");
		}
		
		// 음수, 음수 아님(양수,영) 출력, 절대값(부호없애기)구하기 출력
		int num2 = -5;
		if(num2 < 0) {
			System.out.println("음수");
			System.out.println("절대값 : " + -num2);
		}else {
			System.out.println("음수 아님(양수,영)");
			System.out.println("절대값 : " + num2);
		}
		
		// 두 수를 비교해서 => 최대값 구하기(출력)
		int a = 30;
		int b = 20;
		int max = 0;
		if(a > b) {
			System.out.println(a);
			max = a;
		}else {
//			a <= b
			System.out.println(b);
			max = b;
		}
		System.out.println("최대값 : " +  max);
		
		
//		정수형 num3 변수 선언, 초기값 저장
//		num3 변수 값이 4 ~ 7 사이 이면 => "4 ~7 사이 수"
//		                        아니면 => "4 ~7 사이 수 아님"
		int num3 = 8;
		if( num3 >= 4  && num3 <= 7 ) {
			System.out.println("4 ~7 사이 수");
		}else {
			System.out.println("4 ~7 사이 수 아님");
		}
		
//		age 변수에 나이가 5세 미만 이거나 65세 이상인 경우 "무료입장"
//		                                    아니면 "입장료 1000원"
		age = 30;
		if(age < 5 || age >= 65) {
			System.out.println("무료입장");
		}else {
			System.out.println("입장료 1000원");
		}
		
//		num4 변수 3의 배수 이면서 5의 배수 인 경우  
//		                           "3의 배수 동시에 5의 배수"
//		                  아니면 "3의 배수 동시에 5의 배수 아님"
		int num4 = 4;
		if(num4 % 3 == 0 && num4 % 5 == 0) {
			System.out.println("3의 배수 동시에 5의 배수");
		}else {
			System.out.println("3의 배수 동시에 5의 배수 아님");
		}
		
//		num4 변수 3의 배수 이거나 5의 배수 인 경우  
//                              "3의 배수 이거나 5의 배수"
//                         아니면 "3의 배수도 5의 배수도 아님"
		if(num4 % 3 == 0 || num4 % 5 == 0) {
			System.out.println("3의 배수 이거나 5의 배수");
		}else {
			System.out.println("3의 배수도 5의 배수도 아님");
		}
		
	}

}
