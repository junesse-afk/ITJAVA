package test;

public class Anonymous {
//	Anonymous 클래스 정의
//	멤버변수 정의
//	Person변수 field = new Person 클래스() {}
//	work() "출근합니다"
//	wake() 재정의 "6시에 일어납니다" , work() 메서드 호출 
	
	Person field = new Person() {
		public void work() {
			System.out.println("출근합니다");
		}
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
	};
//	method1() 메서드 정의
//	Person변수 localVar = new Person 클래스() {}
//	walk() "산책합니다"
//	wake() 재정의 "7시에 일어납니다", walk() 메서드 호출
//	localVar.wake() 호출
	public void method1() {
		Person localVar = new Person() {
			public void walk() {
				System.out.println("산책합니다");
			}
			@Override
			public void wake() {
				System.out.println("7시에 일어납니다");
				walk();
			}
		};
		localVar.wake();
	}
	
//	method2(Person person) 메서드 정의
//	person.wake() 메서드 호출
	public void method2(Person person) {
		person.wake();
	}
	
}
