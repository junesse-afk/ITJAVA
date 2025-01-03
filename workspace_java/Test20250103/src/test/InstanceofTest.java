package test;

public class InstanceofTest {
//	InstanceofTest 클래스 정의 
//	method(Parent 받는 변수) 정의 
//	if Child1 다운캐스팅 가능한지 판별 다운캐스팅, "Child1변환성공"
//else if Child2 다운캐스팅 가능한지 판별 다운캐스팅, "Child2변환성공"
//    else "Child로 변환되지 않음"
	public void method(Parent parent) {
//		Parent parent = 자신, 자식들(업캐스팅) 
		if(parent instanceof Child1) {
//			자식 = 업캐스팅된 부모(다운캐스팅)
			System.out.println(parent instanceof Child1);//true
			System.out.println(parent instanceof Child2);//false
			Child1 child1 = (Child1)parent;
//			Child2 child2 = (Child2)parent;
			System.out.println("Child1변환성공");
			parent.prn();
			child1.prn();
			child1.child1Prn();
		}else if(parent instanceof Child2) {
			System.out.println(parent instanceof Child1);//false
			System.out.println(parent instanceof Child2);//true
//			Child1 child1 = (Child1)parent;
			Child2 child2 = (Child2)parent;
			System.out.println("Child2변환성공");
			parent.prn();
			child2.prn();
			child2.child2Prn();
		}else {
			System.out.println("Child로 변환되지 않음");
		}
	}
}
