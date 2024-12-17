package test;

public class Person {
//	Person 클래스 정의 
//	멤버변수 name, age 
	protected String name;
	protected int age;
//	기본 생성자, 멤버변수 값을 받는 생성자
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	prn() 메서드 
	public void prn() {
		System.out.println(name + "," + age);
	}
}
