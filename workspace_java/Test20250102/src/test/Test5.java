package test;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
//		Student3 클래스 정의
//		멤버변수 int studentID, studentName, 
//		멤버변수 List<Subject> subjectList
//		prn() 메서드 출력 studentID, studentName
//		             for subjectName + ":" + subjectScore
		
//		Student3 객체생성
		Student3 student3 = new Student3();
//		멤버변수에 값을 저장
		student3.studentID = 3;
		student3.studentName = "삼길동";
//		subjectList = new ArrayList<Subject>();
		student3.subjectList = new ArrayList<Subject>();
//		subjectList.add(new Subject())
		student3.subjectList.add(new Subject("국어", 100));
		student3.subjectList.add(new Subject("수학", 90));
		student3.subjectList.add(new Subject("영어", 80));
		student3.subjectList.add(new Subject("자바", 100));
//		prn() 메서드 호출
		student3.prn();
		
//		자바스크립트 배열 => json 데이터 표현 방식 키:값
//		[
//		{"studentID":"3","studentName":"삼길동",
//		 "subjectList" : [{"subjectName":"국어","subjectScore":"100"},
//		                  {"subjectName":"수학","subjectScore":"90"},
//		                  {"subjectName":"영어","subjectScore":"80"},
//		                  {"subjectName":"자바","subjectScore":"100"}]},
//		{"studentID":"2","studentName":"이길동",
//		 "subjectList" : [{"subjectName":"국어","subjectScore":"100"},
//		                  {"subjectName":"수학","subjectScore":"90"},
//		                  {"subjectName":"영어","subjectScore":"80"},
//		                  {"subjectName":"자바","subjectScore":"100"}]}
//		]
		
	}

}
