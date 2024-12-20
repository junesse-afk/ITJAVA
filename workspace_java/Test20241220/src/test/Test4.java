package test;

public class Test4 {

	public static void main(String[] args) {
		// p461 람다식 : 함수형 프로그래밍
		System.out.println("리턴값 : " + add(10, 20));
//		(매개변수) -> {실행문}
//		매개변수 1개 ()생략가능, 리턴 생략 가능, 
//		{} 실행문 1개 {} 생략가능
//		return {} 생략못함
//		변수 = (매개변수) -> {실행문}
//		변수 = (int a, int b) -> {return a + b;}
		MyTest myTest = (a, b) -> {return a + b;};
		MyTest myTest2 = (a, b) -> a + b;
		System.out.println("람다 함수 호출 : " + myTest.add(100, 200));
		
		System.out.println("------------------------");
//		strlen() 함수 호출
		System.out.println("문자열 길이 : " + strlen("안녕하세요"));
//		MyTest2 인터페이스 추상메서드 정의
//		람다함수 구현
		MyTest2 myTest22 = (str) -> {return str.length();};
		MyTest2 myTest23 = str -> str.length();
//		람다함수 호출
		System.out.println("람다 문자열 길이 : " + myTest23.strlen("문자열"));
		
		System.out.println("------------------------");
//		max() 함수 호출
		System.out.println("최대값 : " + max(10, 20));
//		MyTest3 인터페이스 추상메서드 정의
//		람다함수 구현
		MyTest3 myTest3 = (a, b) -> (a >= b) ? a : b;
//		람다함수 호출
		System.out.println("람다 최대값 : " + myTest3.max(100, 200));
//		익명 객체를 생성하는 람다식
		MyTest3 myTest32 = new MyTest3() {
			
			@Override
			public int max(int a, int b) {
				return (a >= b) ? a : b;
			}
		};
		
//		함수프로그램(람다함수) : 자료를 입력받아서 구현하므로
//		외부 자료에 영향을 미치지 않아서 여러 자료를 동시에 
//		처리하는 병렬 처리 방식에 적합
		
	}
	
//	두수 비교해서 최대값 구하는 max()함수 리턴 최대값
	public static int max(int a, int b) {
		if(a >= b) {
			return a;
		}else {
			return b;
		}
	}
	
//	하나의 문자열 길이를 리턴하는 strlen() 함수
	public static int strlen(String str) {
		return str.length();
	}
	

//	두수를 받아서 두수를 더하는 add 함수(메서드) 리턴 두수의 함
	public static int add(int a, int b) {
		return a + b;
	}
	
}
