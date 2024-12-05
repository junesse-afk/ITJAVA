package test;

public class Person {
//	기본생성자
//	public Person() {
//		System.out.println("부모의 기본생성자");
//	}
//	부모 Person
//	부모의 기본생성자 없이 이름을 받는 생성자
//	=> 메시지 출력 "부모의 이름을 받는 생성자"
	public Person(String name) {
		System.out.println("부모의 이름을 받는 생성자");
	}
	
//	부모클래스 Person
//	메서드 personPrn() 출력 "사람이 밥을 먹는다"
	public void personPrn() {
		System.out.println("사람이 밥을 먹는다");
	}
}
