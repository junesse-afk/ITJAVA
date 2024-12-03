package test;

public class Person {
//	Person 클래스 정의
//	멤버변수 name, float height, float weight
	public String name;
	public float height;
	public float weight;
//	메서드() prn() 이름 : , 키 : , 몸무게 :   출력
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
	
//	기본생성자 => 생략가능, 다른생성자가 있으면 만들어 줘야함
//	출력 "Person() 기본생성자"
	public Person() {
		System.out.println("Person() 기본생성자");
	}
	
//	이름을 받아서 초기값 할당 하는 생성자
	public Person(String name) {
		this.name = name;
	}
//	키를 받아서 초기값 할당 하는 생성자
	public Person(float height) {
		this.height = height;
	}
//	몸무게를 받아서 초기값 할당 하는 생성자 
//	=> 에러발생 => 같은형인  float형으로 받으면 같은 생성자로 인식 
//	public Person(float weight) {
//		this.weight = weight;
//	}
	
//	이름, 키를 받아서 초기값 할당 하는 생성자 
	public Person(String name, float height) {
		this.name = name;
		this.height = height;
	}
	
//	이름, 몸무게를 받아서 초기값 할당 하는 생성자 
//	=> 에러발생 => 같은형인  name, float형으로 받으면 같은 생성자로 인식
//	public Person(String name, float weight) {
//		this.name = name;
//		this.weight = weight;
//	}
	
//	몸무게 이름를 받아서 초기값 할당 하는 생성자
//	=> 에러없이  같은형인  float,name 형으로 받으면 다른 생성자로 인식
	public Person(float weight, String name) {
		this.name = name;
		this.weight = weight;
	}
	
//	키, 몸무게 받아서 초기값 할당 하는 생성자 
//	=> float 갯수가 틀리면 다른 생성자로 인식
	public Person(float height, float weight) {
		this.height = height;
		this.weight = weight;
	}
	
//	이름, 키, 몸무게 받아서 초기값 할당 하는 생성자 
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}