package test;

public class Student extends Person{
//	기본생성자
	public Student() {
//		부모의 기본 생성자 호출
//		super();
//		부모의 값을 받는 생성자 호출
		super("홍길동");
		System.out.println("Student 자식의 기본생성자");
	}
	
//	자식클래스 Student  부모클래스 Person 상속
//	메서드 studentPrn() 출력 "학생이 공부한다"
	public void studentPrn() {
//		부모의 메서드 호출()
		super.personPrn();
		
		System.out.println("학생이 공부한다");
	}
}
