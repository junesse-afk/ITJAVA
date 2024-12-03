package test;

public class Member {
//	Member 클래스 정의
//	멤버변수 id,pass,name,int age 정의
	public String id;
	public String pass;
	public String name;
	public int age;
	
//	메서드() prn() 아이디 : , 비밀번호 : , 이름 : , 나이 : 출력
	public void prn() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pass);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
//	생성자=> 기억장소 할당, 초기값 할당
//	기본생성자 => 0, null 기본 초기값 할당
	public Member() {
		
//		System.out.println("기본생성자");
//		자기자신의 생성자를 호출
//		this("kim");
//		this(10);
		this("kim", "111", "김", 5);
		
	}
//	생성자 오버로드overload(생성자 이름은 동일하고, 받는 변수 다름)
//	받는 변수 다름 => 형이 틀림, 개수 틀림, 개수 같을때 형이 틀림
	public Member(String id) {
		this.id = id;
	}
	
	public Member(int age) {
		this.age = age;
	}
	
//	id,pass,name,age 값을 받아서 멤버변수에 초기값 할당하는 생성자
	public Member(String id,String pass,String name,int age) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
	}

}