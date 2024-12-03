package test;

public class Test2 {

	public static void main(String[] args) {
//		4. 대입연산자(할당연산자) =, 확장대입연산자( +=, -=, *=, /=, %=)
//		변수(기억장소)에 값을 대입(저장) 연산자
//		좌변 변수에 대입(저장,할당,초기화) = 우변에 데이터(변수,리터럴,계산식)를 
//		=> 모든 연산자 중에서 우선순위가 가장 낮다
//		=> 연산 방향 우 -> 좌로 진행
//		x = y = 3 -> y변수에 3을 대입하고, x변수에 y변수를 대입
		int x;
		int y;
		x = y = 3;
		System.out.println(x);//3
		System.out.println(y);//3
		
//		확장(복합)대입연산자( +=, -=, *=, /=, %=)
//		대입연산자와 산술연산자 조합한 연산자
//		좌변, 우변의 데이터끼리 산술연산을 먼저 수행 => 결과를 좌변 변수에 대입
//		자동 형변환 일어 나지 않음
		
		int b = 10;
		System.out.println(b);
//		b = 2; //기존 기억장소에 값을 변경해서 저장
		b = b + 2; // 기존 기억장소에 값을 가지고 + 2 하고 
		           //  => 기존 기억장소에 값을 변경
		System.out.println(b);//12
		b += 2;
		System.out.println(b);//14
		
		b = 20;
//		기존변수에 -10을 한 결과 저장
		b -= 10; // b = b - 10
		System.out.println(b); //10
		
		b = 10;
//		기존변수에 *10을 한 결과 저장
		b *= 10; // b = b * 10
		System.out.println(b);//100
		
		b = 100;
//		기존변수에 /10을 한 결과 저장
		b /= 10; // b = b / 10
		System.out.println(b);//10
		
		b = 100;
//		기존변수에 % 10을 한 결과 저장
		b %= 10; // b = b % 10
		System.out.println(b);//0
		
//		-------------------------------
//		=> 자동 형변환 일어 나지 않음
//		byte형 변수 b1, b2 선언하고 10, 20 초기값 저장
		byte b1 = 10;
		byte b2 = 20;
		
//		b1, b2 더하기 계산하고(정수형으로 형변환) b1변수에 저장(대입)
		b1 = (byte)(b1 + b2); // 더하기 연산 시 정수형으로 형변환
		System.out.println(b1);//30
		
//		+= 확장대입연산자 이용해서 연산 
		b1 += b2; // 더하기 연산 시 형변환없음(확장대입연산자)
		System.out.println(b1);//50
		
//		char형 변수 ch 선언하고 초기값 'A' 대입 
		char ch = 'A';
//		ch 변수에 3을 더하고 => 결과 ch 변수에 저장(대입)
		ch = (char)(ch + 3);
		System.out.println(ch);//D
//		+= 확장대입연산자 이용 => 형변환 없음
		ch += 3;
		System.out.println(ch);//G
	}

}
