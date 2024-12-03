package test;

public class Test5 {

	public static void main(String[] args) {
//		반복문 빠져나오기 => break;
//		for 1 ~ 10 반복 출력 => if 5이면  반복문 빠져나오기
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
		}
		System.out.println("======================");
//		for 1 ~ 10 반복  i 출력
//		i 변수 값이 3의 배수이면 반복문 빠져나오기
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i % 3 == 0) {
				break;
			}
		}
		System.out.println("======================");
//		초기값 생략
		int i = 1;
		for(/*초기값 생략*/; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("======================");
//		조건 생략 => 무한 반복(조건문, break 사용)
		for(i = 1; /*조건식 생략*/; i++) {
			System.out.println(i);
			if(i == 10) {
				break;
			}
		}
		System.out.println("======================");
//		증가값 생략 => 무한 반복 (증가값)
		for (i = 1; i <= 10; /* 증가값 생략 */) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("======================");
//		모두 생략 => 무한반복
		for( ; ; ) {
			System.out.println(i);
			if(i == 11) {
				break;
			}
		}
		System.out.println("======================");
//		1 ~ ... for 조건문 생략, 1증가
//		1 ~ ... if 합이 100보다 크거나 같을때 반복문 break 중단
//		마지막 i 출력, s 출력
		int s = 0;
		for(i = 1; ; i++) {
			s += i;
			if(s >= 100) {
				break;
			}
		}
		System.out.println("i = " + i);
		System.out.println("s = " + s);
	}

}
