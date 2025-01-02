package test;

public class Test3 {

	public static void main(String[] args) {
//		Student 클래스 정의
//		멤버변수 int studentID, studentName, 
//		int koreaScore, int mathScore
		
//		prn() 메서드 출력 studentID : studentName
//		                koreaScore , mathScore
		
//		Student 객체생성
		Student student = new Student();
//		멤버변수 값 저장
		student.studentID = 1;
		student.studentName = "홍길동";
		student.koreaScore = 100;
		student.mathScore = 90;
		student.koreaSubject = "국어";
		student.mathSubject = "수학";
//		prn() 메서드 호출 
		student.prn();

	}

}
