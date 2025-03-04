package test;

public class Test4 {

	public static void main(String[] args) {
		
//		부모클래스 Animal
//		메서드 move() 출력 "동물이 움직인다"
		
//		자식클래스 Tiger 상속 Animal
//		메서드 moveTiger() 출력 "호랑이 네 발로 움직인다"
		
//		자식클래스 Eagle 상속 Animal
//		메서드 moveEagle() 출력 "독수리 날개로 움직인다"
		
//		----------------------------
//		메서드 오버로딩 : 같은 클래스 내에서 메서드 이름을 동일하게 사용
//		             : 매개변수 개수, 매개변수 형 틀리게
		System.out.println(5);
		System.out.println(3.5);
		System.out.println("문자열");
		
//		메서드 오버라이딩(메서드 재정의)
//		부모와 자식 상속관계에서 부모의 메서드를 재정의(수정)해서 사용
//		자동완성 alt shfit s -> v
//		다형성 
//		: 메서드 이름은 동일 하고 메서드 동작은 자식별로 다르게 동작
		
		
//		Tiger 객체생성
//		moveTiger() 메서드 호출
		Tiger tiger = new Tiger();
		tiger.move();
//		tiger.moveTiger();
		
//		Eagle 객체생성
//		moveEagle() 메서드 호출
		Eagle eagle = new Eagle();
		eagle.move();
//		eagle.moveEagle();
		
		
	}

}
