package test;

public class Student2 {
//	Student2 클래스 정의
//	멤버변수 int studentID, studentName, 
//	멤버변수 Subject subject
//	prn() 메서드 출력
	
	int studentID;
	String studentName; 
	Subject subject;
	
	public void prn() {
		System.out.println(studentID + ":" + studentName);
		subject.subjectPrn();
	}
	
}
