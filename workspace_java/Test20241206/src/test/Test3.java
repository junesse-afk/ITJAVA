package test;

public class Test3 {

	public static void main(String[] args) {
//		부모 = 자식 객체생성(업캐스팅 : 부모형으로 자동형변환)
//		메서드오버라이딩 된 메서드호출() => 다형성 적용
//		: 부모의 참조변수, 오버라이딩메서드 동일
//		: 자식이 재정의한 메서드 구현 내용 다양함
		
		Animal ani = new Animal();
		System.out.println(ani);
		ani.move();
		
//		Tiger 업캐스팅 객체생성
		Animal animal = new Tiger();
		System.out.println(animal);
//		메서드호출()
		animal.move();
		
//		Eagle 업캐스팅 객체생성
		Animal animal2 = new Eagle();
		System.out.println(animal2);
//		메서드 호출()
		animal2.move();
		
		System.out.println("----------------------");
		
//		Zoo동물원 클래스 정의
		
//		Tiger 받는 setTiger(Tiger 받는 변수)메서드 
//		move() 메서드 호출
		
//		Eagle 받는 setEagel(Eagle 받는 변수)메서드
//		move() 메서드 호출
		
//		모든 동물을 받는 setAnimal(Animal 받는 변수)메서드
//		move() 메서드 호출
		
//		Tiger 객체생성
		Tiger tiger = new Tiger();
//		Eagle 객체생성
		Eagle eagle = new Eagle();
		
//		Zoo 객체생성
		Zoo zoo = new Zoo();
//		setTiger(Tiger)메서드 호출
		zoo.setTiger(tiger);
//		setEagel(Eagle)메서드 호출
		zoo.setEagel(eagle);
//		setAnimal(Tiger)메서드 호출
		zoo.setAnimal(tiger);
//		setAnimal(Eagle)메서드 호출
		zoo.setAnimal(eagle);
		
		zoo.setAnimal(ani);
		zoo.setAnimal(animal);
		zoo.setAnimal(animal2);

	}

}
