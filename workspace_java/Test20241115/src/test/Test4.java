package test;

public class Test4 {

	public static void main(String[] args) {
		
//		sum(정수형 두 수를 저장하는 변수,변수) 함수 정의
//		두 수의 합 구하기
//		리턴할 값 두 수의 합(리턴할형 정수형)
		System.out.println("두 수의 합 : " + sum(10, 20));
		
//		evenSum(정수형 수를 저장하는 변수) 함수 정의
//		1 ~ 전달받은 정수 반복 => 짝수의 합 구하기
//		리턴할 값 짝수의 합(리턴할형 정수형)
		System.out.println("1 ~ num 짝수 합 : " + evenSum(10));
	}
	
	public static int evenSum(int num) {
		int s = 0;
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				s += i;
			}
		}
		return s;
	}
	
	
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

}
