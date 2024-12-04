package test;

public class Test5 {

	public static void main(String[] args) {
//		부모클래스 Person
//		메서드 personPrn() 출력 "사람이 밥을 먹는다"
		
//		자식클래스 Student  부모클래스 Person 상속
//		메서드 studentPrn() 출력 "학생이 공부한다"
		
//		자식클래스 Student 객체생성
//		personPrn() , studentPrn() 메서드 호출
		Student student = new Student();
		student.personPrn();
		student.studentPrn();

		
	}

}
