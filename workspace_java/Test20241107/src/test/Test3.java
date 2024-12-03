package test;

public class Test3 {

	public static void main(String[] args) {
//		while 이용 1 ~ 10 카운트 합 구하기 => 출력
		int s = 0;
		int i = 1;
		while(i <= 10) {
			s += i;
			i++;
		}
		System.out.println("1 ~ 10 카운트 합 " + s);
		
//		while 1 ~ 10, if 3의 배수 출력, 3의 배수의 합 구해서 마지막출력
		s = 0;
		i = 1;
		while(i <= 10) {
			if(i % 3 == 0) {
				System.out.println(i);
				s += i;
			}
			i++;
		}
		System.out.println("3의 배수의 합 " + s);
		
//		while 1 ~ 100, if 3의 배수 이면서 동시에 5의 배수 출력,
//		                                   합 구해서 마지막출력
		s = 0;
		i = 1;
		while(i <= 100) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
				s += i;
			}
			i++;
		}
		System.out.println("3의 배수 이면서 동시에 5의 배수의 합 " + s);
		
//		while 이용,  dan 변수 2단 출력, i 변수 1 ~ 9 카운트
//		2 * 1 = 1
//		...
//		2 * 9 = 18
		int dan = 2;
		i = 1;
		while(i <= 9) {
			System.out.println(dan + "*" + i + "=" + dan * i);
			i++;
		}
		
	}

}
