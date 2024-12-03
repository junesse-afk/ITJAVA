package test;

public class Test2 {

	public static void main(String[] args) {
//		Student 클래스 정의
//		멤버변수 num , name, java, db, jsp, html
//		메서드 sum() java, db, jsp, html 점수의 합 구해서 리턴
//		메서드 intro() "번호 : " , "이름 : " 출력 리턴값은 없음
		
//		Student 객체생성(기억장소 할당, 초기값 할당), 인스턴스 화
		Student s = new Student();
//		멤버변수에 값 저장
		s.num = 1;
		s.name = "홍길동";
		s.java = 100;
		s.db = 90;
		s.jsp = 95;
		s.html = 85;
//		메서드 intro() 호출
		s.intro();
//		sum() 메서드 호출 "학생의 점수합계" 출력
		System.out.println("학생의 점수합계 : " + s.sum());
//		sum() 메서드 호출 "학생의 점수평균" 출력
		System.out.println("학생의 점수평균 : " + s.sum()/4);
		
		Student s2 = new Student();
		s2.num = 2;
		s2.name = "이길동";
		s2.java = 90;
		s2.db = 80;
		s2.jsp = 100;
		s2.html = 90;
		s2.intro();
		System.out.println("학생의 점수합계 : " + s2.sum());
		System.out.println("학생의 점수평균 : " + s2.sum()/4);
		
		
		

	}

}
