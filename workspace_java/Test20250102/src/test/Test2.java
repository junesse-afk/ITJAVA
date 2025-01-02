package test;

import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) {
//		p193 싱글톤(하나객체) : 전체 프로그램에서 단 하나의 객체 만 만들기
//		              : 단 하나의 객체생성해서 사용
//		              : static 이용해서 객체생성
		
//		싱글톤 패턴 : 객체지향프로그램에서 인스턴스를 단 하나만 생성하는 디자인패턴
//		디자인 패턴 : 객체지향프로그램에서 프로그램을 어떻게 구현해야 
//		    유연하고(수정용이), 재활용성 높은 프로그램을 만들 수 있는지 정리한 내용 
		
		// Calendar 객체생성
		Calendar calendar = Calendar.getInstance();
//		Calendar calendar2 = new Calendar();
		
//		Singleton 클래스 정의
//		private static Singleton 멤버변수 선언 = new Singleton 객체생성
//		private 기본생성자
//      static Singleton 리턴 getInstance() 메서드 
//		=> 리턴 Singleton 멤버변수 
		
//		Singleton 2개 객체생성 => new 에러발생
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		Singleton 2개(s1,s2) 객체생성 => getInstance()
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
//		s1,s2 두개 비교 같으면 => "같은 Singleton 객체입니다"
//		s1,s2 두개 비교 틀리면 => "다른 Singleton 객체입니다"
		if(s1 == s2) {
			System.out.println("같은 Singleton 객체입니다");
		}else {
			System.out.println("다른 Singleton 객체입니다");
		}

	}

}
