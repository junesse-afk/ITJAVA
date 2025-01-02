package test;

public class Test4 {

	public static void main(String[] args) {
//		Student2 클래스 정의
//		멤버변수 int studentID, studentName, 
//		멤버변수 Subject subject
//		prn() 메서드 출력
		
//		Subject 클래스 정의
//		멤버변수 subjectName, subjectScore
//		subjectPrn() 출력
		
//		Student2 객체생성
//		멤버변수에 값을 저장
//		prn() 메서드 호출
		Student2 student2 = new Student2();
		student2.studentID = 2;
		student2.studentName = "이길동";
		student2.subject = new Subject();
		student2.subject.subjectName = "국어";
		student2.subject.subjectScore = 100;
		student2.subject.subjectName = "수학";
		student2.subject.subjectScore = 80;
		student2.prn();
		student2.subject.subjectPrn();
	}

}
