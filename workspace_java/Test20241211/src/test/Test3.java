package test;

public class Test3 {

	public static void main(String[] args) {
//		p375 Wrapper 클래스
//		기본자료형 => 클래스로 정의한 내장객체 java.lang
		
//		boolean => Boolean
		
//		byte => Byte
//		char => Character  =>
//		short => Short
//		int => Integer   =>
//		long => Long
		
//		float => Float
//		double => Double
		
//		기본자료형
		int i = 100;
//		참조형 java.lang.Integer 클래스 => 내장객체
		Integer integer = new Integer(100);
		System.out.println(integer.MIN_VALUE);//-2147483648
		System.out.println(integer.MAX_VALUE);//2147483647
		
//		정수형 <= Integer 클래스 변경
//		int i2 = integer; //자동변경
//		기본자료형 = 객체형 => 컴파일 시 변경
		int i2 = integer.intValue(); // 언박싱(unboxing)
		System.out.println(i2);//100
		
//		integer => int 자동으로 변경 계산
//		int sum = i + integer;
		int sum = i + integer.intValue();// 언박싱(unboxing)
		System.out.println(sum);
		
//		int => Integer
//		Integer integer2 = i; //자동변경
		Integer integer2 = Integer.valueOf(i);//오토박싱(autoboxing)
		
//		숫자형태의 문자열을 => 정수형으로 변경 static
		int num = Integer.parseInt("200");
//		int num = (int)"200"; => 문법적 에러
		System.out.println(num);
		

		
		
		
		
		
		
		
		

	}

}
