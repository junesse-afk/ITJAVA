package test;

import java.util.ArrayList;

import student.Student;
import student.StudentDAO;
import student.Subject;


public class Test7 {

	public static void main(String[] args) {
//		패키지 student 파일 Student 클래스 정의
//		멤버변수 int num, name 데이터 은닉
//		메서드 set, get 정의

//		패키지 student 파일 StudentDAO 클래스 정의
//		insertStudent(Student를 저장한 배열ArrayList변수 정의) 메서드 정의
//		for 출력
		
//		1명 Student 객체생성 set메서드 호출 값 저장 
//		import student.Student;
		Student student1 = new Student();
		student1.setNum(1);
		student1.setName("홍길동");
		
		Subject subject1 = new Subject();
		subject1.setName("국어");
		subject1.setScore(90);
		
		student1.setSubject(subject1);
		
//		2명 Student 객체생성 set메서드 호출 값 저장
		Student student2 = new Student();
		student2.setNum(2);
		student2.setName("이길동");
		
		Subject subject2 = new Subject();
		subject2.setName("국어");
		subject2.setScore(100);
		
		student2.setSubject(subject2);
		
//		Student를 저장한 배열ArrayList 객체생성
//		배열에 Student 저장
		ArrayList<Student> arrayList = 
				new ArrayList<Student>();
		arrayList.add(student1);
		arrayList.add(student2);
		
//		StudentDAO 객체생성
		StudentDAO studentDAO = new StudentDAO();
//		insertStudent(Student 저장된 배열 주소) 메서드 호출
		studentDAO.insertStudent(arrayList);
	}

}