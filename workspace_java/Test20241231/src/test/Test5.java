package test;

import p1.Person;
import p2.Student;

public class Test5 {

	public static void main(String[] args) {
		//패키지 p1  Person 클래스 정의 
//		멤버변수 privateVar, packageVar, 
//		protectedVar, publicVar
//		메서드 personPrn() 출력
		
		//패키지 p2  Student 클래스 정의 Person 클래스 상속 
//		멤버변수 privateVar2, packageVar2, 
//		protectedVar2, publicVar2
//		메서드 studentPrn()
		
//		Person 객체생성
		Person person = new Person();
//		멤버변수 접근 값을 저장
//		person.privateVar="private변수";//같은 클래스 => 에러
//		person.packageVar="package변수";//같은 폴더 => 에러
//		person.protectedVar="protected변수";// 다른폴더 상속관계 아님=>에러
		person.publicVar="public변수";//모두 접근
//		멤버변수 접근 값을 출력
		System.out.println(person.publicVar);
//		메서드 personPrn() 호출
		person.personPrn();
		System.out.println("----------------");
//		Student 객체생성
		Student student = new Student();
//		멤버변수,부모 멤버변수 접근 값을 저장
		student.publicVar="부모 public변수"; //다른폴더
		student.publicVar2="자식 public변수"; //다른폴더
//		멤버변수,부모 멤버변수 접근 값을 출력
		System.out.println(student.publicVar);
		System.out.println(student.publicVar2);
		System.out.println("----------------");
//		메서드 personPrn() 호출
		student.personPrn();
		System.out.println("----------------");
//		메서드 studentPrn() 호출
		student.studentPrn();
		
		

	}

}
