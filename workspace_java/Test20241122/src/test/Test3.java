package test;

public class Test3 {

	public static void main(String[] args) {
//		p152
//		클래스 Person
//		멤버변수 : 나이, 이름, 성별, 결혼여부(boolean), 자녀수
//		메서드() : prn() 출력 나이 : , 이름 : , 성별 :, 
//		         결혼여부:, 자녀수:
//		객체생성, 멤버변수 호출 값 저장, 메서드() 호출
		Person p = new Person();
		p.age = 10;
		p.name = "이순신";
		p.gender = "남";
		p.isMarried = true;
		p.childCnt = 3;
		p.prn();

	}

}
