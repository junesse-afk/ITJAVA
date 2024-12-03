package test;

public class Test2 {

	public static void main(String[] args) {
		// 단축키 => 한줄 삭제 =>  ctrl d
		
		// 10 , 20 => 소수점 없는 숫자 => 정수형 => 리터럴
		// 프로그램에서 사용하는 모든 숫자, 문자, 논리값 

		// 10 숫자와 20 숫자 => 더하기 명령 => 출력
		System.out.println(100 + 200);
//		10 숫자와 20 숫자 => 빼기 명령( - ) => 출력
		System.out.println(100 - 200);
//		10 숫자와 20 숫자 => 곱하기 명령( * ) => 출력
		System.out.println(100 * 200);
//		10 숫자와 20 숫자 => 나누기 명령( / ) => 출력
//		정수형 / 정수형 => 정수형 => 결과값 0
		System.out.println(100 / 200);
		
		// 숫자가 변해서 적용했으면 좋겠다 => 요구
//		변수 : 값이 변하는 수 (기억장소에 값을 저장해서 변하게 함)
//		=> 기억장소에 이름을 부여하고 형을 지정하고 값을 저장
//		=> 변수를 정의(선언)하고 값을 저장(할당)
//		=> = 오른쪽에 값이나 식을 계산해서 결과값을 왼쪽에 있는 기억장소 변수에 저장
//		int a ; => 변수 정의(선언) , 기억장소 만 만든 상태
		int a = 10; //=> 기억장소에 값을 저장(최초 저장값 , 초기값)
		
		// 기억장소에 이름(b)을 부여하고 형(정수형)을 지정하고 값(20)을 저장
//		int b ;
		int b = 20;
		
		System.out.println("a");//문자 a 출력
		System.out.println(a);//변수 이름 a (기억장소에 저장된 값) 출력
		// 문자열 +(연결자) 숫자,변수
		System.out.println("a = " + a);
		System.out.println(b);
		System.out.println("b = " + b);
		
		// 변수 선언 후 => 기억장소 재사용(기억장소에 다른값을 저장)
		a = 100;
		System.out.println("a = " + a);
		b = 200;
		System.out.println("b = " + b);
		
		a = 1000;
		b = 2000;
		
		// 변하는 수를 이용해서 => 더하기 빼기 곱하기 나누기 명령 => 출력
		System.out.println("a + b = " + (a + b));  // 출력  a + b = 30
		System.out.println("a - b = " + (a - b));  // 출력  a - b = -10
		System.out.println("a * b = " + (a * b));  // 출력  a * b = 200
		System.out.println("a / b = " + (a / b));  // 출력  a / b = 0
		
		// 나이 : 20 출력
		// 20 => 변하는 수로 정의 초기값 20 저장, 기억장소 이름 age , 정수형 지정
		// 변수 선언하고 초기값 할당
		int age = 20;
		// 나이 : 20 출력
		age = 30;
		System.out.println("나이 : " + age);
		System.out.println("age = " + age);
		
		// 변수 이름 정하기 => 규칙적용
//		1.영문자(대문자,소문자), 숫자, 특수문자($, _) 사용 
//		예) Abc, count100, won$, g_level
		int Abc = 10;
		int count100 = 10;
		int won$ = 10;
		int g_level = 10;
//		2. 시작변수명 중에 숫자 사용 할 수 없음
//		예) 1a(사용못함) , $won, _master(사용가능) 
//		int 1a = 10;
		int $won = 10;
		int _master = 10;
//		3. 자바문법에서 사용 중인 예약어 사용 할 수 없음
//		예) class, for, if, int, while
//		int class = 10;
//		int for = 10;
//		4. $ _ 제외 => 다른 특수 문자 사용 못함
//		5. 한글 사용 가능
//		6. 길이 제한 없음
		
//		적합하지 않은 변수 이름 ? 1, 3
//		1) 2018 2)_hello 3) int 4) MAX_COUNT 5) numberOfBaby
		
		// 변수 정의 해서 12 값을 저장
		int Cnt  = 12;
		// 출력 => 바구니에 저장된 사과는 12개 입니다
		System.out.println("바구니에 저장된 사과는 " + Cnt + "개 입니다");
		
		
		
	}

}
