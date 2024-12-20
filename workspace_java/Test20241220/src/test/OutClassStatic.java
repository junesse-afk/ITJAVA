package test;

public class OutClassStatic {
//	내부클래스가 외부 클래스 생성과 무관하게 사용
//	정적 내부 클래스 정의
	
	private int num = 10;
	private static int sNum = 20;
	
	static class InClassStatic{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// 외부클래스 private 멤버변수 접근
			 System.out.println("내부클래스 inNum : " + inNum);
			 System.out.println("내부클래스 sInNum : " + sInNum);
//			 System.out.println("외부클래스 num : " + num); //인스턴스변수
			 System.out.println("외부클래스 sNum : " + sNum);//static변수
		}
		
		static void sInTest() {
			// 외부클래스 private 멤버변수 접근
//			 System.out.println("내부클래스 inNum : " + inNum);//인스턴스변수
			 System.out.println("내부클래스 sInNum : " + sInNum);//static변수
//			 System.out.println("외부클래스 num : " + num); //인스턴스변수
			 System.out.println("외부클래스 sNum : " + sNum);//static변수
		}
		
	}
	
}
