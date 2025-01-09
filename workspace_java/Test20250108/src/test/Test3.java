package test;

public class Test3 {

	public static void main(String[] args) {
		// 명시적으로 클래스 이름 선언
//		상속 class 클래스이름 extends 부모클래스{}
//		구현 class 클래스이름 implements 부모인터페이스{}
		
		//익명 객체 : 이름이 없는 객체
//		상속 부모클래스 변수 = new 부모클래스() {}
//		구현 부모인터페이스 변수 = new 부모인터페이스() {}
		
//		Person 클래스 정의
//		wake() 메서드 "7시에 일어납니다" 출력
		
//		Anonymous 클래스 정의
//		멤버변수 정의
//		Person변수 field = new Person 클래스() {}
//		work() "출근합니다"
//		wake() 재정의 "6시에 일어납니다" , work() 메서드 호출 
		
//		method1() 메서드 정의
//		Person변수 localVar = new Person 클래스() {}
//		walk() "산책합니다"
//		wake() 재정의 "7시에 일어납니다", walk() 메서드 호출
//		localVar.wake() 호출
		
//		method2(Person person) 메서드 정의
//		person.wake() 메서드 호출
		
//		Anonymous 객체생성
		Anonymous anonymous = new Anonymous();
//		익명객체변수 field  사용 wake() 메서드 호출
		anonymous.field.wake();
//		method1() 호출
		anonymous.method1();
//		method2(익명객체 Person생성) 호출
//		익명객체 => study()메서드 정의 "공부를 합니다"
//		          wake() 메서드 재정의 8시에 일어납니다, study() 호출
		anonymous.method2(new Person() {
			public void study() {
				System.out.println("공부를 합니다");
			}
			@Override
			public void wake() {
				System.out.println("8시에 일어납니다");
				study();
			}
		});
		
	}

}
