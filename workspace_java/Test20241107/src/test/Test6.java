package test;

public class Test6 {

	public static void main(String[] args) {
//		continue; => 반복문의 시작점인 증가값, 조건으로 올라감
//				  => 반복문 계속 진행
//		1 ~ 10 반복 => i  5이면 반복문의 시작점으로 이동하고 계속진행
//		=> i 출력
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("==================");
//		1 ~ 10 출력 => 2의 배수 출력하지 않고 반복문의 시작점 이동
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("==================");
//		1 ~ 10 출력 => 2의 배수 제외하고 합 구해서 출력
		int s = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			//2의 배수 제외
			s += i;
			System.out.println(i);
		}
		System.out.println(s);
		
		System.out.println("==================");
//		1 ~ 100 까지 반복, for, if, continue 이용
//		10의 배수가 아닌것을 제외하고 출력 => 10의 배수 출력 
		for(int i = 1; i <= 100; i++) {
			if(i % 10 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
