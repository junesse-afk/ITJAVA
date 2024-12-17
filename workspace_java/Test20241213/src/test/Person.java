package test;

public class Person {
//	클래스 Person
//	멤버변수 : 나이, 이름, 성별, 결혼여부(boolean), 자녀수
	public int age;
	public String name;
	public String gender;
	public boolean isMarried;
	public int childCnt;
	
//	기본생성자
	public Person() {
		
	}
	
//	초기값을 받는 생성자 => 멤버변수 저장
	public Person(int age, String name, String gender, boolean isMarried, int childCnt) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.isMarried = isMarried;
		this.childCnt = childCnt;
	}
	
	
//	메서드() : prn() 출력 나이 : , 이름 : , 성별 :, 
//	         결혼여부:, 자녀수:
	public void prn() {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("결혼여부 : " + isMarried);
		if(isMarried == true) {
			System.out.println("결혼여부 : " + "결혼 함");
		}else {
			System.out.println("결혼여부 : " + "결혼 안함");
		}
		System.out.println("자녀수 : " + childCnt);
	}
}