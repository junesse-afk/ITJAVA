package test;

public class Test3 {

	public static void main(String[] args) {
//		반복문 for, while, do~while
//		반복문 : 조건이 true이면 반복하고
//		        조건이 false이면 반복문 빠져나옴
//		for문 : 처음과 마지막을 알고 있으면 선택
//		while문 : 반복 횟수가 정해져 있지 않은 반복문
//		예) 밥을 10번 드세요 => 횟수가 정해짐 => for
//		예) 밥을 그릇이 빌 때까지 드세요 => 횟수가 정해져 있지 않음 => while
//		반복문 구성요소 => 카운트 변수 정의 초기값, 조건문, 실행문, 증가값
//		for(카운트 변수 정의 초기값;조건문;증가값) {
//			실행문;
//		}
		
//		1 ~ 10 까지 카운트를 하면서 10번 반복 => 카운트 값 출력
//		i = i + 1 / i += 1 / i++
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
//		1) 카운트 변수 정의 초기값  int i = 1;
//		2) 조건문 i <= 10; => true
//		3) 실행문 System.out.println(i);
//		4) 증가값 i++
//		5) 조건문 i <= 10; => true
//		6) 실행문 System.out.println(i);
//		4 ~ 6 반복
//		7) 증가값 i++ => 11
//		8) 조건문 i <= 10; => false
//		9) 반복문을 빠져나옴
		
//		System.out.println("1 : Hello, World!");
//		System.out.println("2 : Hello, World!");
//		System.out.println("3 : Hello, World!");
//		System.out.println("4 : Hello, World!");
//		System.out.println("5 : Hello, World!");
		
//		int i = 1; for문 안에 변수 선언
//		=>for문에서 만 사용하는 지역변수
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + " : Hello, World!");
		}
		
//		0 ~ 9 카운트 하면서 카운트값 출력
		for(int i = 0; i <= 9; i++) {
			System.out.println(i);
		}
		System.out.println("----------------");
//		for + 배열이용
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("----------------");
		
//		1 3 5 7 9 카운트 하면서 카운트값 출력
		for(int i = 1; i <= 9; i += 2) {
			System.out.println(i);
		}
		System.out.println("----------------");
//		10 9 8 ~ 1 카운트 하면서 카운트값 출력
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("----------------");
//		1 ~ 10 출력
		int min = 1;
		int max = 10;
		for(int i = min; i <= max; i++) {
			System.out.println(i);
		}
		System.out.println("----------------");
		System.out.println("<2단>");
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 2 = 4");
		System.out.println("2 * 3 = 6");
		System.out.println("2 * 4 = 8");
		System.out.println("2 * 5 = 10");
		System.out.println("2 * 6 = 12");
		System.out.println("2 * 7 = 14");
		System.out.println("2 * 8 = 16");
		System.out.println("2 * 9 = 18");
		System.out.println("----------------");
		
		int dan = 5;
//		1 ~ 9 까지 카운트를 하면서  2 * 1 = 2 식 출력
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
		int s = 0;
//		1 ~ 5 까지 카운트 => 1 + 2 + 3 + 4 + 5 => 합을 구해서 출력 
		for(int i = 1; i <= 5; i++) {
//			카운트 출력
			System.out.println(i);
//			카운트 합 구하는 식
//			s += 1; // 0 + 1 + 1 + 1 + 1 + 1 //카운트 개수 
			s += i; // 0 + 1 + 2 + 3 + 4 + 5 //카운트 합
		}
		System.out.println(s); //15
		
	}

}
