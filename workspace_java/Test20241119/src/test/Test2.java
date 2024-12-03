package test;

public class Test2 {

	public static void main(String[] args) {
//		Tree 클래스 정의 
//		멤버변수 (나무의 특징을 저장하는 변수)
//		나무의 이름 name , 나무의 나이 age
//		메서드(나무 관련된 기능을 정의하는 함수)
//		prn2() 출력 "나무가 자란다"
		
//		Tree 클래스를 사용하기 위해서 기억장소 할당(객체생성)
		Tree t = new Tree();
//		Tree t2 = new Student(); //에러발생
		System.out.println(t);
//		Tree 안에 있는 변수에 값을 저장
		t.name = "소나무";
		t.age = 10;
//		Tree 안에 있는 변수에 저장된 내용을 출력
		System.out.println(t.name);
		System.out.println(t.age);
//		Tree 안에 있는 prn2() 함수 호출
		t.prn2();
		
//		Tree 클래스를 사용하기 위해서 기억장소 할당(객체생성) => t2
//		Tree 안에 있는 변수에 값을 저장 (대나무, 20)
//		Tree 안에 있는 변수에 저장된 내용을 출력
//		Tree 안에 있는 prn2() 함수 호출
		Tree t2 = new Tree();
		System.out.println(t2);
		t2.name = "대나무";
		t2.age = 20;
		System.out.println(t2.name);
		System.out.println(t2.age);
		t2.prn2();
		
		System.out.println("-------------------------");
		
//		Animal 클래스 정의 
//		멤버변수 (동물의 특징을 저장하는 변수)
//		동물의 이름 name , 동물의 나이 age
//		메서드(동물 관련된 기능을 정의하는 함수)
//		run() 출력 "동물이 달린다"
		int i = 10; //값 
		Animal a = new Animal();//값은 다른 기억장소에 저장하고 주소를 a 변수에 저장
		System.out.println("Animal형의 기억장소 주소 : " + a);
		a.name = "고양이";
		a.age = 5;
		System.out.println(a.name);
		System.out.println(a.age);
		a.run();
		

	}

}
