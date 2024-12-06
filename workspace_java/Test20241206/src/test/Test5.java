package test;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
//		부모  Shape = 자식 Circle 객체생성 => 업캐스팅
		Shape shape = new Circle();
		System.out.println(shape instanceof Shape);//true
		System.out.println(shape instanceof Circle);//true
		System.out.println(shape instanceof Tri);//false
//		자식 = 업캐스팅된 부모  객체생성 => 다운캐스팅
		Circle circle = (Circle)shape;
//		prn()메서드 호출
		circle.prn();
		System.out.println("----------------------");
		// 배열에 특정한 형을 저장(제네릭타입)
		ArrayList<Circle> arr = new ArrayList<Circle>();
//		arr.add(1); => 에러발생
//		arr.add("안녕"); => 에러발생
		arr.add(circle);//업캐스팅 형변환없이 저장
		Circle circle2 = arr.get(0);//다운캐스팅 형변환없이 저장
		circle2.prn();
		System.out.println("----------------------");
//		배열에 모든형을 저장
		ArrayList arr2 = new ArrayList();
		arr2.add(1);//=> Object형으로 업캐스팅 형변환
		arr2.add("안녕");//=> Object형으로 업캐스팅 형변환
		arr2.add(new Circle());//=> Object형으로 업캐스팅 형변환
//		자식 = 업캐스팅 된 부모 => (명시적형변환)다운캐스팅
		Integer integer = (Integer)arr2.get(0);
		System.out.println(integer);//1
		String string = (String)arr2.get(1);
		System.out.println(string);//안녕
		Circle circle3 = (Circle)arr2.get(2);
		circle3.prn();//원을 그린다
		
		

	}

}
