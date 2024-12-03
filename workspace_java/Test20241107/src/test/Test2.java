package test;

public class Test2 {

	public static void main(String[] args) {
//		for(초기값; 조건; 증가값) {
//			실행문;
//		}
		
//		초기값;
//		while(조건) {
//			실행문;
//			증가값;
//		}
		
//		조건 true => 실행문 반복
//			false => 반복문 종료	
		
//		while 1 ~ 10 카운트 출력
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("===================");
//		while 10 9 8 ... 1 출력 , 1 변수 재사용
		i = 10;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
		System.out.println("===================");
//		while 2, 4, 6, 8, 10  출력 , 1 변수 재사용
		i = 2;
		while(i <= 10) {
			System.out.println(i);
			i += 2;
		}
		

	}

}
