package test;

public class Test2 {

	public static void main(String[] args) {
//		Person 클래스 정의
//		멤버변수 name, float height, float weight
//		메서드() prn() 이름 : , 키 : , 몸무게 :   출력
		
//		기본생성자 => 생략가능, 다른생성자가 있으면 만들어 줘야함
//		출력 "Person() 기본생성자"
		
//		이름을 받아서 초기값 할당 하는 생성자
		
//		키, 몸무게 받아서 초기값 할당 하는 생성자
		
//		이름, 키, 몸무게 받아서 초기값 할당 하는 생성자 
		
		Person person = new Person();
		person.prn();
		
		Person person2 = new Person("홍길동");
		person2.prn();
		
		Person person3 = new Person(130f,50.0f);
		person3.prn();
		
		Person person4 = new Person("이순신", 180.0f, 80.0f);
		person4.prn();

	}

}
