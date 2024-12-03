package test;

public class Test1 {

	public static void main(String[] args) {
		//기본자료형 : 기억장소에 값을 저장
		//참조형 : 기억장소에 주소를 저장
		//문자열형 String 참조형, 문자열 관련 주제(객체)를 정해서 만들어 놓은 자바 프로그램
		String str = "안녕";
		System.out.println("문자열 출력 : " + 100);
		System.out.println("문자열 출력 : " + str);
		System.out.println("문자열 출력 : " + "하다");
		
		// 출력 => 특수 출력 문자(이스케이프 문자) 
		// =>  \출력\   "출력"  '출'  출	력
		// 출
		// 력
		// " 문자를 표시하는 특수한 기능을 가지고 있는 문자
		// => 특수한 기능을 가지고 있는 문자가 아니다 표시 =>  \"
		//  \"
		System.out.println("\"출력\"");
		//  \\
		System.out.println("\\출력\\");
		//  \'
		System.out.println("\'출\'");
		// 탭만큼 이동 출력  \t
		System.out.println("출\t력");
		// 다음줄로 이동   \n
		System.out.println("출\n력");
		
		String s = "D:\\Shared\\JAVA\\workspace_java\\Test20241021\\src\\test";
		System.out.println(s);
		//=> 출력결과 D:\Shared\JAVA\workspace_java\Test20241021\src\test
		
//		Hello다음줄
//		"Java"탭 \programming
		System.out.println("Hello\n\"Java\"\t \\programming");

	}

}
