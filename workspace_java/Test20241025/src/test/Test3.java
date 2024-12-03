package test;

public class Test3 {

	public static void main(String[] args) {
		// 기억장소 크기(4byte)로 지정하고 기억장소 이름을 a로 부여하고 초기값을 10 저장
		int a = 10;
		
		// 기본자료형 (기억장소에 저장될 데이터 형)
//		1. 정수형 : 소수점 없는 수(양수,0,음수)
//		    => byte(1byte), short(2byte)
//		    => 기본형 int(4byte) 00000000 00000000 00000000 00001010
//		    => long(8byte)
		
		byte b = 100; // -128 ~ 127,  -2의 7승 ~ 2의 7승 -1
//		b = 128;
//		=> 자바 내장 프로그램 만들어서  byte 정보를 저장하고 사용할 수 있게 함
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		short c = 500; //-32768 ~ 32767, -2의 15승 ~ 2의 15승 -1
		
		int d = 300;//-2147483648 ~ 2147483647, -2의 31승 ~ 2의 31승 -1
		
		// 1000 정수형 기본 int , 1000L, 1000l long형 인식
//		d = 1000L;  4바이트 = 8바이트
		long e = 1000;  // 8바이트 = 4바이트
		e = 2000L;
		
//		2. 실수형 : 소수점 있는 수
//		   => float(4byte), 기본형 double(8byte)
//		   => 3.5
//		   => 부동 소수점 방식 : 0.1 => 1.0 * 10 -1승 
//		   => float  부호1비트,지수(승)8비트,가수23비트 => 32비트(4byte)
//		   => double 부호1비트,지수(승)11비트,가수52비트 => 64비트(8byte)
		
		//기본 숫자 double => float 표시 F,f 
		float f = 2.5f;
		
		double g = 2.5;
		
//		4. 논리형 : 참(true)/거짓(false)
//		   => boolean(1byte)
//		남여, 여부, .... 
		
		boolean h = true;
		h = false;
		
		

	}

}
