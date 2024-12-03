package test;

public class Test1 {

	public static void main(String[] args) {
//		for i변수 1 ~ 100 반복 
//		=> s변수 카운트값의 1 ~ 100 누적합 구하기 
//		=> if 중간 출력 i 10, 20, 30 ~ 100(10의 배수)
//		=> 마지막 누적합 출력
		int s = 0;
		for(int i = 1; i <= 100; i++) {
			s += i;
			if(i % 10 == 0) {
				System.out.println(i);
			}
		}
		System.out.println(s);
		
//		for i 변수 반복 1 ~ 10 
//	evenTotal변수 1 ~ 10 짝수의 합 => 2, 4, 6, 8, 10 => 2의 배수
//	oddTotal변수 1 ~ 10 홀수의 합 => 1, 3, 5, 7, 9 => 2의 배수 아님
//		마지막 evenTotal변수,oddTotal변수 출력
		int evenTotal = 0;
		int oddTotal = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				evenTotal += i;
			}else {
				oddTotal += i;
			}
		}
		System.out.println("1 ~ 10 짝수 합 : " + evenTotal);
		System.out.println("1 ~ 10 홀수 합 : " + oddTotal);
		
		evenTotal = 0;
		for(int i = 2; i <= 10; i += 2) {
			evenTotal += i;
		}
		System.out.println("1 ~ 10 짝수 합 : " + evenTotal);
		
		oddTotal = 0;
		for(int i = 1; i <= 9; i += 2) {
			oddTotal += i;
		}
		System.out.println("1 ~ 10 홀수 합 : " + oddTotal);
		
	}

}
