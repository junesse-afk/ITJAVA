package test;

import java.util.List;

public class Student3 {
//	Student3 클래스 정의
//	멤버변수 int studentID, studentName, 
//	멤버변수 List<Subject> subjectList
	int studentID;
	String studentName; 
	List<Subject> subjectList;
	
//	prn() 메서드 출력 studentID, studentName
//	             for subjectName + ":" + subjectScore
	public void prn() {
		System.out.println(studentID + ":" + studentName);
		for(Subject subject : subjectList) {
			System.out.println(subject.subjectName + ":" + subject.subjectScore);
		}
	}

	
	
}
