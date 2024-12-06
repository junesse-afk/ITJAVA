package test;

public class Test4 {

	public static void main(String[] args) {
		int a = (int)3.5;//3
		double b = 3; //3.0
//		부모 = 자식 객체생성 => 자동으로 형변환(업캐스팅)
//		자식 = (부모 = 자식) 객체생성 => 명시적으로 형변환(다운캐스팅)
//		    => 자기자신인 자식으로 되돌아감
		
//		업캐스팅 : session.setAttribute("이름",모든형을 받는 변수
//		                             (모든형의 부모Object변수))
//		다운캐스팅 : String 변수 
//		               = (String)session.getAttribute("이름")
		
//		부모 = 부모
		Animal ani = new Animal();
		System.out.println(ani);
		ani.move();
		
//		자식 = 부모 (명시적 형변환 다운캐스팅)
//		Eagle eagle = (Eagle)ani;  => 예외발생
//		eagle.move();
//		java.lang.ClassCastException: 
//		class test.Animal cannot be cast to	class test.Eagle 
		System.out.println("-----------------------");
		
//		부모 = 자식(업캐스팅)
		Animal animal = new Eagle();
		System.out.println(animal);
		animal.move(); // 부모 접근, 재정의 접근
//		animal.moveEagle(); //자식 접근 못함
		
		System.out.println("-----------------------");
//		자식 = 부모(부모 = 자식 업캐스팅) (명시적 형변환 다운캐스팅)
		Eagle eagle = (Eagle)animal;
		eagle.move();
		eagle.moveEagle();
		
		System.out.println("-----------------------");
//		부모 = 자식 객체생성(업캐스팅)
		Animal animal2 = new Tiger();
//		Tiger tiger = (다운캐스팅 형변환)(부모 = 자식)
		Tiger tiger = (Tiger)animal2;
//		move 메서드 호출	
		tiger.move();
//		moveTiger 메서드 호출
		tiger.moveTiger();
		System.out.println("-----------------------");
//		Zoo객체생성
		Zoo zoo = new Zoo();
//		setAnimal(new Tiger()); 메서드 호출 (업캐스팅)
		zoo.setAnimal(new Tiger());
//		setAnimal(new Eagle()); 메서드 호출 (업캐스팅)
		zoo.setAnimal(new Eagle());
		
		System.out.println("-----------------------");
//		p273 다운캐스팅 instanceof연산자
//		instanceof : 다운캐스팅 하기전에 원래 자료형 확인
		Animal aa = new Animal();
		System.out.println(aa instanceof Animal);//true
		System.out.println(aa instanceof Eagle);//false
		System.out.println(aa instanceof Tiger);//false
		
		System.out.println("-----------------------");
		Animal aaE = new Eagle();
		System.out.println(aaE instanceof Animal);//true
		System.out.println(aaE instanceof Eagle);//true
		System.out.println(aaE instanceof Tiger);//false
		
		System.out.println("-----------------------");
		Animal aaT = new Tiger();
		System.out.println(aaT instanceof Animal);//true
		System.out.println(aaT instanceof Eagle);//false
		System.out.println(aaT instanceof Tiger);//true
	}

}
