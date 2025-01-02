package test;

public class Subject {
//	Subject 클래스 정의
//	멤버변수 subjectName, subjectScore
//	subjectPrn() 출력
	
	String subjectName;
	int subjectScore;
	
	public Subject() {
		
	}
	
	public Subject(String subjectName, int subjectScore) {
		this.subjectName = subjectName;
		this.subjectScore = subjectScore;
	}
	
	public void subjectPrn() {
		System.out.println(subjectName + ":" + subjectScore);
	}
}
