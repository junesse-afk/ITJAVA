package test;

public class Test7 extends Object{

	public static void main(String[] args) {
//	p351 Object 클래스 : 자바의 내장객체(API)
//	                  : 모든 클래스의 부모(extends Object)
//		              : java.lang 패키지(폴더) 기본폴더(자동 스캔)
		              
//		java.lang.Object 클래스
//		: 모든 클래스의 최상위 클래스
//		.toString() : 객체 문자열 표현 반환 (test.Test7@15975490)
//		.equals() : 기억장소(인스턴스) 동일 여부 반환
//		.getClass() : 클래스 반환
//		.hashCode() : 객체 해시 코드 반환(기억장소 주소)
		
		Test7 test7 = new Test7();
		System.out.println(test7);
		
//		Book 객체생성
		Book book = new Book(200, "개미");
//		참조변수 출력
//	    public String toString() {
//	        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//	    }
		System.out.println(book);
		//test.Book@1936f0f5//200,개미//Book [bookNumber=200, bookTitle=개미]
		System.out.println(book.toString());
		//test.Book@1936f0f5//200,개미//Book [bookNumber=200, bookTitle=개미]
		
//		String 클래스
		String s1 = "안녕하세요";
//		toString() 메서드 재정의
		System.out.println(s1);
		
		String s2 = new String("반갑습니다");
		System.out.println(s2);

//		Integer 클래스
		int i = 100;
		Integer integer = new Integer(100);
		System.out.println(i);
		System.out.println(integer);
		
	}

}
