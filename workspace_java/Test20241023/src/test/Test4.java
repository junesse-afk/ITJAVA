package test;

public class Test4 {
	public static void main(String[] args) {
//		3. 문자형 : 글자 한 자 저장 => 컴퓨터 내부 정수형으로 저장
//		   => char(2byte)
//		   => '글자한자' 표시
//		   => 컴퓨터 내용 0, 1 조합 A를 표현 => 65 저장
//		   => 문자 인코딩 : 문자를 정해진 코드 값으로 변환
//		   => 아스키(ASCII)코드 : 문자 인코딩, 영문자 숫자 특수문자를 나타내는 문자세트
//		   => 아스키코드표 검색 
//		   => 아스키코드 1byte(256개) 대문자, 소문자, 특수문자, 기호
//		   => 한글, 다른언어 문자 복잡 => 2byte
//		   => 각 언어 표준 인코딩 정의 => 유니코드
		
		char ch1 = 'A';
		System.out.println(ch1);
		//'A' 정해진 코드값 변환 => int 형으로 변환(형변환)
		System.out.println((int)ch1); //65
		
		// 'a' 변수 정의 => 출력 => 정수형 형변환 출력
		char ch2 = 'a';
		System.out.println(ch2);
		System.out.println((int)ch2); //97
		
		char ch3 = 66; // char = int, (char)66
		System.out.println(ch3);
		
		int  ch4 = 67;
		System.out.println(ch4);
		System.out.println((char)ch4);
		
		// 'A' -> 65 인코딩, 
		// 'A' <- 65 디코딩
		// char ch5 변수 'Z' 저장 하고 출력
		char ch5 = 'Z';
		System.out.println(ch5);
		// char ch6 변수 38 저장하고 출력
		char ch6 = 38;
		System.out.println(ch6);
		// int ch7 변수 97 저장하고 출력, char형 변환해서 출력 
		int ch7 = 97;
		System.out.println(ch7);
		System.out.println((char)ch7);
		
//		char ch8 = "A"; //에러발생
//		ch8 = 'aaa'; //에러발생
		
		//여러개 문자를 저장 => 문자열(String) => 참조형
//		String str = 'A'; //에러발생
		String str = "A";
		str = "AAA";
		System.out.println(str);
		
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//문자 변수에는 음수를 넣으면 오류발생 => 주의
//		char b2 = -66; //에러발생 
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
		
		
		//유니코드 : 전 세계의 모든 문자를 처리할 수 있도록
		//         만든 표준 문자 전산 처리방식
		
		char ch9 = '한';
		System.out.println(ch9);
		// 유니코드 16진수(2byte) => https://www.unicode.org/charts/
//		Hangul Syllables 코드표 => '\\u열행'
		char ch10 = '\uD55C'; //한
		System.out.println(ch10);
		
		ch10 = '\uD64D'; //홍
		System.out.println(ch10);
		
		// 유니코드 
		// 자바 기본 인코딩 방식 => 2byte (UTF-16)
		// 알파벳 => 1byte 메모리 낭비 => 인터넷 UTF-8 (1 ~ 4 byte사용)
		// => 메모리 낭비 적고 전송 속도 빠름
		
	}
}
