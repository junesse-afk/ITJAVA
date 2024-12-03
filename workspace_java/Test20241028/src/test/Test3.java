package test;

public class Test3 {

	public static void main(String[] args) {
//		연산 과정에서 자동 형변환
//		연산을 수행 할때 데이터 타입을 일치 시킨 후 => 연산 수행(자동으로 형변환)
//		1. int 타입보다 작은 타입끼리 연산 => int 변환 연산 
//		2. int 타입보다 큰 타입 연산 => 큰 타입 변환 연산
		
		byte b1 = 10, b2 = 20, b3;
		System.out.println(b1 + b2);//30 int형
//		b1 + b2 => byte + byte => int => 자동으로 형변환
		b3 = (byte)(b1 + b2);
		System.out.println(b3);//30 byte형
		
		char ch = 'A'; //65
//		ch + 3 => char + int => int => 자동으로 형변환
		System.out.println("A" + 3); //문자열 연결 숫자 A3
		System.out.println(ch + 3); //68
		char ch2 = (char)(ch + 3);
		System.out.println(ch2);//D
		
		int i1 = 100;
		long l1 = 200L;
//		int + long => long
		System.out.println(i1 + l1); //300 (long)
		int i2 = (int)(i1 + l1);
		System.out.println(i2); //300(int)
		
		float f2 = 0.1f;
		double d2 = 0.1;
//		float + double => double + double => double
//		=> 부족한 자릿수를 채울 때 근사치 표현에 의해 이상한 값 추가 => 잘못된 결과
		System.out.println(f2 + d2); //0.20000000149011612
//		double -> float 강제적으로 변환 후 연산
		System.out.println(f2 + (float)d2); //0.2
		
//		리터럴 끼리 연산 => 형변환 발생 하지 않는다 
		byte b5 = 100 + 20; 
//		byte b6 = 100 + 30;//-128 ~ 127 범위 넘어감
		byte b6 = (byte)(100 + 30);
		System.out.println(b6); //-126 이상한 결과(overflow)
		
		double d5 = 1.2;
		float f5 = 0.9F;
//		(int)double + (int)float
		int i5 = (int)d5 + (int)f5; // 1 + 0 => 1
		System.out.println(i5); //1
//		(int)(double + float)
		int i6 = (int)(d5 + f5); // 1.2 + 0.9 => 2.1 => 2
		System.out.println(i6);	//2	
		
//		5 / 2 연산 => int/int => 결과 정수형
		int i7 = 5;
		int i8 = 2;
		System.out.println(i7 / i8); //2
//		5 / 2 연산 => 2.5
		System.out.println(i7 / (float)i8); //2.5

	}

}
