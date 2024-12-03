package test;

public class Test2 {

	public static void main(String[] args) {
		// 기본자료형 => 형변환, 타입변환
		// => 자바의 기본 데이터 타입을 변환
		// => boolean 타입을 제외한 기본 데이터 타입 간의 변환
		// => 정수와 실수 연산 => 형이 틀리면 연산 수행 안됨
		// => 하나의 자료형으로 통일한 후에 연산 동작
		int a = 3;
		double b = 4.5;
		System.out.println(a + b); //7.5
		
//		1. 묵시적으로 형변환(자동으로 형변환)
//		=>  작은 데이터 타입이 -> 큰 데이터 타입으로 변환
//		=> 형변환을 명시적으로 하지 않음
//		실수형변수 = 정수형변수값을 저장 => 자동으로 형변환
//		실수 = 정수, 큰 데이터 타입 변수 = 작은 데이터 타입 변수
//		byte -> short(char) -> int -> long -> float -> double
		
		// 정수형 변수 n 에 10을 저장 => 변수선언
		int n = 10;
		// 실수형변수 d에 정수형 변수 n을 저장
		double d = n;//자동으로 형변환
		// d 출력 
		System.out.println(d);//10.0
		
		byte a1 = 10;
		short a2 = 256;
//		a1 = a2; // 작은형 = 큰형=>에러발생
		a2 = a1; // 2byte 큰형 = 1byte 작은형
		System.out.println(a2);
		
//		2. 명시적으로 형변환(강제 형변환)
//		큰 데이터 타입 => 작은 데이터 타입으로 변환
//		형변환 연산을 이용해서 강제적으로 형변환
//		강제적으로 형변환시 기존 데이터타입이 아닌 다른 데이터타입으로 저장
//		작은데이터타입 = (작은데이터타입)큰데이터타입
		
		double d2 = 3.7;
//		정수형 = 실수형
		int n2 = (int)d2; //(int)실수형에서 명시적으로 정수형 형변환
		System.out.println((int)d2);//3
		System.out.println(n2);//3
		
		byte b1 = 10;
		short b2 = 256;
//		byte = short (형변환) 저장
		b1 = (byte)b2;
//		byte 범위 -128 ~ 127
//		10 = (byte)256; => byte 형변환 에러발생 
//		기억장소 범위가 넘어감 => overflow
		System.out.println(b1); // 0
		
//		----------------------------------
		int i = 100;
		float f = i; //자동으로 형변환
		System.out.println(f);//100.0
		
		// long 8byte, float 4byte
		// 실수형을 정수형보다 무조건 큰 타입으로 취급
		long l = 83983L;
		float f2 = l; //실수float형 = 정수long형
		System.out.println(f2);//83983.0
		
		// byte(1), short(2) <-> char(2) 형변환
		char ch = 65;
		short sh = 65;
		byte by = 65;
//		char(2) = byte(1)  , 큰형 = 작은형 => 자동으로 형변환
//		byte 타입의 음수 범위가 char 타입보다 크므로 => 자동 형변환 불가능
		ch = (char)by;
		System.out.println(ch); //A
		
//		char(2) = short(2)
//		short 타입의 음수 범위가 char 타입보다 크므로 => 자동 형변환 불가능
		ch = (char)sh;
		System.out.println(ch); //A
		
//		형이 맞지 않아서 자동 형변환 불가능
//		byte = char
		by = (byte)ch;
		System.out.println(by);//65
//		short = char
		sh = (short)ch;
		System.out.println(sh);//65
		
//		int(4byte 큰형) = char(2byte 작은형) => 자동으로 형변환(int 형 큼)
		int i1 = ch;
		System.out.println(i1); //65
		
		ch = (char)i1;
		System.out.println(ch); //A
		
		//long(큰) = int(작은) => 자동으로 형변환
		int i2 = 1234;
		long l22 = i2; //자동으로 형변환
		System.out.println(l22);//1234
		//int(작은) = long(큰) => 명시적으로 형변환
		i2 = (int)l22; //명시적으로 형변환
		
//		범위가 넘어가서 오버플로overflow 발생 => 이상한 결과 나옴
		long l3 = 10000000000L;
		int i3 = (int)l3;
		System.out.println(i3);//1410065408 이상한 결과
		
		//주의사항
//		double = float 자동 형변환
		float f5 = 1.1f;
//		근사치 표현에 의해 정상적인 데이터가 아닌 데이터 전달
//		=> 부족한 자릿수를 채울 때 근사치 표현에 의해 이상한 값 추가
		double d5 = f5;
		System.out.println(d5);//1.100000023841858 => 주의
		d5 = 1.1;
		System.out.println(d5);//1.1
		
		f5 = (float)1.1;
		System.out.println(f5);//1.1
		
		int i5 = 1;
		d5 = i5;
		System.out.println(d5);//1.0

	}

}
