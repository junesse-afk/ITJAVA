package test;

public class Test4 {

	public static void main(String[] args) {
//		Parent 클래스 정의 
//		Child1 클래스 정의 Parent 상속
//		Child2 클래스 정의 Parent 상속
		
//		Child1 자식객체생성
		Child1 child1 = new Child1();
//		Child2 자식객체생성
		Child2 child2 = new Child2();
//		Parent 객체생성
		Parent parent = new Parent();
		
		System.out.println(child1 instanceof Child1);//true
		System.out.println(child2 instanceof Child2);//true
		System.out.println(parent instanceof Parent);//true
		System.out.println("----------------------");
//		부모 = 자식 업캐스팅
		Parent parent1 = new Child1();
		Parent parent2 = new Child2();
		System.out.println(parent1 instanceof Child1);//true
		System.out.println(parent1 instanceof Child2);//false
		System.out.println(parent2 instanceof Child1);//false
		System.out.println(parent2 instanceof Child2);//true
		System.out.println(parent instanceof Child1);//false
		System.out.println(parent instanceof Child2);//false
		System.out.println("----------------------");
//		InstanceofTest 클래스 객체생성
//		method(Child1) 호출
//		method(Child2) 호출
//		method(Parent) 호출
		
//		InstanceofTest 클래스 정의 
//		method(Parent 받는 변수) 정의 
//		if Child1 다운캐스팅 가능한지 판별 다운캐스팅, "Child1변환성공"
//	else if Child2 다운캐스팅 가능한지 판별 다운캐스팅, "Child2변환성공"
//	    else "Child로 변환되지 않음"                  
		
		InstanceofTest instanceofTest = new InstanceofTest();
		instanceofTest.method(child1);
		instanceofTest.method(child2);
		instanceofTest.method(parent);
		
//		상속 -> 메서드 오버라이딩(재정의) + 타입변환(업캐스팅) 
//		=> 다형성 
		
		

	}

}
