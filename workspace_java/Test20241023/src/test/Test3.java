package test;

public class Test3 {

	public static void main(String[] args) {
		// 변수(지역 변수) : 기억장소에 이름을 부여하고, 
		//                어떤 데이터를 저장할지 데이터 형태지정
		//                초기값 저장
		int a; // 변수 선언(정수형의 기억장소 만들어서 기억장소 이름을 부여)
		a = 10; // 초기값 저장
		System.out.println(a);
		
		// 컴퓨터 데이터 0, 1 저장 => 1bit => 1byte(8bit) => 4byte(32bit)
		//                        0    => 00001011  =>
		
		// 기본자료형 (기억장소에 저장될 데이터 형)
//		1. 정수형 : 소수점 없는 수(양수,0,음수)
//		    => byte(1byte), short(2byte)
//		    => 기본형 int(4byte) 00000000 00000000 00000000 00001010
//		    => long(8byte)
		
		byte b = 10; // -128 ~ 127,  -2의 7승 ~ 2의 7승 -1
//		b = 128; // byte숫자 범위 넘어감 , byte = int 에러발생
		
		short c = 300; //-32768 ~ 32767, -2의 15승 ~ 2의 15승 -1
//		c = -40000; // short 숫자 범위 넘어감
		
		int d = 100000000; //-2147483648 ~ 2147483647, -2의 31승 ~ 2의 31승 -1
//		d = 100000000000;// int 숫자 범위 넘어감
		
		long e = 200000;// -2의 63승 ~ 2의 63승 -1
		//기본적으로 숫자값을 int 인식
		// => long 인식하게 표현 => 숫자L, 숫자l
//		d = 200L; => int = long 
//		d = 2147483648; => 정수형 범위 초과
		e = 2147483648L; // 기본 정수형 숫자를  long형 표시
		e = 1000; // 자동으로 정수형에서 long형으로 변환되면서 저장
		
//		2. 실수형 : 소수점 있는 수
//		   => float(4byte), 기본형 double(8byte)
		
//		3. 문자형 : 글자 한 자 저장 => 컴퓨터 내부 정수형으로 저장
//		   => char(2byte)
		
//		4. 논리형 : true/false
//		   => boolean(1byte)
		
		// 참조형(객체형)
//		1. 문자열(String),... => 내장객체 
//		2. 사용자가 정의한 객체...
		
		
	}

}
