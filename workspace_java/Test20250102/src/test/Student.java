package test;

public class Student {
//	Student 클래스 정의
//	멤버변수 int studentID, studentName, 
//	int koreaScore, int mathScore
	int studentID;
	String studentName; 
	
	int koreaScore;
	int mathScore;
	String koreaSubject;
	String mathSubject;
//	prn() 메서드 출력 studentID : studentName
//	                koreaScore , mathScore
	public void prn() {
		System.out.println(studentID + ":" + studentName);
		System.out.println(koreaSubject + ":" + koreaScore);
		System.out.println(mathSubject + ":" + mathScore);
	}
}
