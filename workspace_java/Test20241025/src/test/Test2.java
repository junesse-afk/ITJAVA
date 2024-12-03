package test;

public class Test2 {

	public static void main(String[] args) {
		
		// 변수 : 변하는 수(기억장소에 크기를 지정하고 이름을 부여)
		// 변수 선언 
		int a;
		// 변수에 값을 저장(제일 처음 저장하는 값을 초기값)
		a = 32;
		int b = 2;
		
		// 37 / 5,  37 % 5
		a = 37;
		b = 5;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// 연산자 + 더하기, - 빼기 , * 곱하기, / 나누기, % 나머지
		// 35를 10으로 나누기 => 출력
		System.out.println("a / b = " + (a / b)); //3
		// 35를 10으로 나누어서 나머지 => 출력
		System.out.println("a % b = " + (a % b)); //5
		
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
//		int ^b=10;
		
//		5. 한글 사용 가능
		int 변수 = 10;
		
//		6. 길이 제한 없음
		
//		적합하지 않은 변수 이름 ? 1, 3
//		1) 2018 2)_hello 3) int 4) MAX_COUNT 5) numberOfBaby
		
		// 변수 정의 해서 12 값을 저장
		int count  = 30;
		// 출력 => 바구니에 저장된 사과는 12개 입니다
		System.out.println("바구니에 저장된 사과는 " + count + "개 입니다");
		

	}

}
