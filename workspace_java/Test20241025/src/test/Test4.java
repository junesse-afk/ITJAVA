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
		// 형변환(int)
		System.out.println((int)ch1);
		int ch2 = 97;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		//유니코드 : 전 세계의 모든 문자를 처리할 수 있도록
		//         만든 표준 문자 전산 처리방식
		// 유니코드 16진수(2byte) => https://www.unicode.org/charts/
//		Hangul Syllables 코드표 => '\\u열행'
		System.out.println('\uD558');
		
		// 유니코드 
		// 자바 기본 인코딩 방식 => 2byte (UTF-16)
		// 알파벳 => 1byte 메모리 낭비 => 인터넷 UTF-8 (1 ~ 4 byte사용)
		// => 메모리 낭비 적고 전송 속도 빠름
		
		
		// 리터럴(데이터 값) : 프로그램에서 사용하는 숫자값, 문자값, 논리값
				//                : 10, 3.4, 'A', true
		float a = 3.4f;
		
		// 상수 : 변하지 않는 수(항상 그대로 인 변수), 대문자
		// final : 마지막 값, 변수를 변경하지 못하게 막아줌, 초기값은 변경 가능
		final float PI;
		PI = 3.14159f;
//		PI = 3.14f;// 수정 할때 에러 발생
		
		// 원면적 : 반지름 * 반지름 * 3.14
		int r=5;
		System.out.println(r * r * PI);
		r = 10;
		System.out.println(r * r * PI);
		r = 20;
		System.out.println(r * r * PI);
	}

}
