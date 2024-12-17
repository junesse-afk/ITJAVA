package test;

public class Test7 {

	public static void main(String[] args) {
		
//		1. 변수(자료형), 자료형의 형변환
//		2. 연산자
//		3. 제어문(조건문, 반복문)
//		3-2. 배열
//		4. 객체(멤버변수, 멤버함수(메서드))
//		5. 객체 지향 개념
		
//		1) 변수 선언(변수명 만드는 규칙)
		int a = 10;
		double b = 3.4;
		char c = 'A';
		boolean d = true;
		String e = "문자열";
		
//		2) 연산자
//		+, -, *, /, %    계산 결과 
//		== != > >= < <=  true/false
//		&& || !          true/false
		
//		3) 제어문 if, switch, 반복문 for while
		
//		버스 탑승 요금
//		나이 변수, 요금 변수
//		if 8세 작으면 (취학 전 아동)  1000원
//		8이상 ~ 14 작으면 2000원
//		14이상 ~ 20 작으면 2500원
//		나머지 3000원
//		출력 5세 요금은 1000원 입니다
		int age = 7;
		int charge = 0;
		if(age < 8) {
			charge = 1000;
		}else if(age < 14) {
			charge = 2000;
		}else if(age < 20) {
			charge = 2500;
		}else {
			charge = 3000;
		}
		System.out.println(age + "세 요금은 " + charge + "원 입니다");
		
//		4) 배열
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		int arr2[] = new int[] {10,20,30,40,50};
		int arr3[] = {10,20,30,40,50};
		
//		문자열 배열 선언 => 3개 값을 저장
//		출력
		String str[] = {"자바","데이터베이스","스프링"};
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
//		5) 객체 지향 프로그래밍 개념 특징 (언어 종류)
//		 - 캡슐화(은닉), 상속(상속성), 다형성, 추상화
		
//		6) 클래스 정의 , 멤버변수 정의, 생성자 정의, 메서드 정의
//		   객체생성 , 메서드 호출
//		Person 클래스 정의 
//		멤버변수 name, age 
//		기본 생성자, 멤버변수 값을 받는 생성자
//		prn() 메서드 
		Person person = new Person("홍길동",20);
		person.prn();
		
//		7) 상속
//		Student 클래스 정의 상속 Person
//		멤버변수 학번 num 
//		prn2() 메서드 출력 num : name 
		
		Student student = new Student();
		student.prn();
		student.prn2();
		
//		8) 접근 제어자 public protected 
//		             생략(default,package) private
		
//		9) 클래스(정적) 변수, 인스턴스 변수, 로컬변수
		
//		10) 가비지 컬렉터(Garbage Collector)
		
//		11) final 개념
		
//		12) 형변환 , instanceof 연산자
		
		Person person2 = new Student(); //업캐스팅
		person2.prn();
		
		Student student2 = (Student)person2; //다운캐스팅
		student2.prn();
		student2.prn2();
		
//		13) 추상클래스, 인터페이스 => 이해
		
//		서술형 15문제  실습형 3문제
		
	}

}
