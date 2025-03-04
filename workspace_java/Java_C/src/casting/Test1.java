package casting;

class Phone { // 전화기
	public void call() {}
}
class HandPhone extends Phone { // 2G폰 (폴더, 슬라이드)
	public void sms() {}
}
class SmartPhone extends HandPhone { 
	public void kakaoTalk() {}
}
// --------------------------------
class GroundUnit {
	public void move() {
		System.out.println("클릭한 위치로 이동~");
	}
}
class Tank extends GroundUnit {
	public void seize() {
		System.out.println("시즈모드!!");
	}
}
class Virture extends GroundUnit {
	public void mine() {
		System.out.println("지뢰심기~!");
	}
}

// ------------------------------------------
class Hero {
	String name;
	int hp;
	Weapon w;
	
	public void attack () {
		w.attack();
		
	}
}


abstract class Weapon {
	public abstract void attack();
}
class Sword extends Weapon {
	@Override
	public void attack() {
		System.out.println("검으로 공격!");
	}
}
class Bow extends Weapon {
	@Override
	public void attack() {
		System.out.println("활로 공격!");
	}
}
class Gun extends Weapon {
	@Override
	public void attack() {
		System.out.println("총으로 공격!");
	}
}
// -------------------------------------
interface Flyer {
	public void fly();
}

class Animal {}
class Bird extends Animal implements Flyer {
	public void fly() {
		System.out.println("Bird 비행~");
	}
}
class Person {}
class SuperMan extends Person implements Flyer {
	public void fly() {
		System.out.println("SuperMan 비행~");
	}
}
class 메카닉 {}
class Airplane extends 메카닉 implements Flyer {
	public void fly() {
		System.out.println("Airplane 비행~");
	}
}

class Person2 {
	public void printThis() {
		System.out.println(this);
	}
}
public class Test1 {
	public static void main(String[] args) {
		
		
		String[] objs = {"asd", "asd", "cccc", "ssssss"};
		
		for (String s : objs) {
			System.out.println(s.length());
		}
	 	
	 	
	 	
	 	Person2 p2 = new Person2();
		
//		Phone 할아버지; // 전화밖에 못한다고 가정
//		HandPhone 아버지; // 전화, 문자
//		SmartPhone 나; // 다 할수 있음
//		
//		Phone 전화기 = new Phone();
//		HandPhone 폴더폰 = new HandPhone();
//		SmartPhone 스마트폰  = new SmartPhone();
//		
//		할아버지 = 폴더폰;
//		나 = (SmartPhone)할아버지;
//		
//		나.kakaoTalk();
//		
//		System.out.println("정상 실행!");
		
	}
}
class Parent {
	public Parent() {
		System.out.println("P 생성자");
	}
	
	public void parentMethod() {
		System.out.println("P");
	}
}
class Child extends Parent {
	
	public Child() {
		super();
		System.out.println("C 생성자");
	}
	public void childMethod() {
		System.out.println("C");
	}
}



class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends B {}
class F extends C {}
class G extends C {}
class H extends F {}

