package test;

public class Zoo {
//	Zoo동물원 클래스 정의
	
//	Tiger 받는 setTiger(Tiger 받는 변수)메서드 
//	move() 메서드 호출
	public void setTiger(Tiger tiger) {
		System.out.println("Tiger 전달 받음");
		tiger.move();
	}
	
//	Eagle 받는 setEagel(Eagle 받는 변수)메서드
//	move() 메서드 호출
	public void setEagel(Eagle eagle) {
		System.out.println("Eagle 전달 받음");
		eagle.move();
	}
	
//	모든 동물을 받는 setAnimal(Animal 받는 변수)메서드
//	move() 메서드 호출
	public void setAnimal(Animal animal) {
		System.out.println("모든 동물 전달 받음");
		animal.move();
//		instanceof연산자 이용
		if(animal instanceof Tiger) {
//			자식 = animal 업캐스팅된 부모 => 다운캐스팅 Tiger
			Tiger tiger = (Tiger)animal;
//			move() 메서드 호출
			tiger.move();
//			moveTiger() 메서드 호출
			tiger.moveTiger();
		}
		if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.move();
			eagle.moveEagle();
		}
		
	}
	
	
}
