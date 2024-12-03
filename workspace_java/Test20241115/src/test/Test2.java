package test;

public class Test2 {

	public static void main(String[] args) {
//		절대값 구하는 함수 abs(전달받은값이 정수형 변수정의) 정의
//		if 절대값 구해서 리턴(리턴할형 정수형) 
		System.out.println("절대값 : " + abs(-7));
		
//		합을 구하는 함수 total(전달받은값이 정수형 변수정의) 정의
//		for 1 부터 ~ 전달받은값  합을 구해서 리턴(리턴할형 정수형)
		System.out.println("합 리턴 받은 값 : " + total(10));
	}
	
	public static int total(int num) {
//		for 1 부터 ~ 전달받은값  합을
		int s = 0;
		for(int i = 1; i <= num; i++) {
			s += i;
		}
		return s;
	}
	
	
//	public static int abs(int a) {
//		int result = 0;
//		if(a < 0) {
////			음수 => 부호 없앰
//			result = a * -1;
//		}else {
////			양수, 0 => 부호 그대로
//			result = a;
//		}
//		return result;
//	}
	
	public static int abs(int a) {
		if(a < 0) {
			a = a * -1;
		}
		return a;
	}

}
