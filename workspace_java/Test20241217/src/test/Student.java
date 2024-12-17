package test;

public class Student extends Person{
//	Student 클래스 정의 상속 Person
//	멤버변수 학번 num 
//	prn2() 메서드 출력 num : name 
	private int num;
	
	public void prn2() {
		System.out.println(num + ":" + name);
	}
	
}
