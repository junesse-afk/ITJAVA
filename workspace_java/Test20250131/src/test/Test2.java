package test;

import java.util.HashSet;
import java.util.Set;

class Static{
	public int a = 20;
	static int b = 0;
}

//17번
abstract class Vehicle{
	String name;
	abstract public String getName(String val);
	public String getName() {
		return "Vehicle name: " + name;
	}
}

//17번
class Car extends Vehicle{

	public Car(String val) {
		name = super.name = val;
	}
	
	@Override
	public String getName(String val) {
		return "Car name: " + val;
	}
	
	public String getName(byte val[]) {
		return "Car name: " + val;
	}
	
}

//20번
class Parent{
	int x = 100;
	public Parent() {
		this(500);
	}
	public Parent(int x) {
		this.x = x;
	}
	int getX() {
		return x;
	}
}

//20번
class Child extends Parent{
	int x = 4000;
	public Child() {
		this(5000);
	}
	public Child(int x) {
		this.x = x;
	}
//	@Override
//	int getX() {
//		return x;
//	}
}

public class Test2 {

	public static void main(String[] args) {
//		2023년 1회 정보처리기사 실기 기출
		//1번
		int a;
		a = 10;
		Static.b = a;
		
		Static st = new Static();
		
		System.out.println(Static.b++);// 10 -> 11
		System.out.println(st.b);//11
		System.out.println(a);//10
		System.out.println(st.a);//20
		
		System.out.println();
		System.out.println("-------------------");
		
		//2번 
		String a2 = "Art";
		char[] p = null;
		p = a2.toCharArray(); //char배열
		System.out.println(a2); //a2
		System.out.println(p[0]); //*p
		System.out.println(a2.charAt(0)); //*a2
		System.out.println(p); //p
		
		for(int i = 0; i < a2.length(); i++) {
			System.out.print(a2.charAt(i));
		}
//		결과
//		Art
//		A
//		A
//		Art
//		Art
		
		System.out.println();
		System.out.println("-------------------");
		
		//3번
		String a3 = "qwer";
		String b3 = "qwtety";
		
		for(int i = 0; i < a3.length(); i++) {
			for(int j = 0; j < b3.length(); j++) {
				if(a3.charAt(i) == b3.charAt(j)) {
					System.out.print(a3.charAt(i));
				}
			}
		}
		// 결과  qwe
		
		System.out.println();
		System.out.println("-------------------");
		//9번
		int input = 101110;
		int di = 1;
		int sum = 0;
		
		while(input != 0) {
			// if(input == 0 ) break =>  input != 0  
			sum = sum + (input % 10) * di;
			di = di * 2;
			input = input / 10;
		}
		System.out.println(sum);
		// 결과 46
//		() 괄호내용
//		1. (a) %  ,(b) 10 or 5 or 2
//		2. (a) &  ,(b) 1
		
		System.out.println();
		System.out.println("-------------------");
		
		//14번  오름차순 정렬
		int[] item = new int[] {5, 3, 8, 1, 2, 7};
		int nx = 6;
		Usort(item, nx); //nx, item.length
		
		for(int data : item) {
			System.out.print(data + " ");
		}
//		결과  1 2 3 5 7 8 
//		괄호  idx2, nx 

		System.out.println();
		System.out.println("-------------------");
		
		//15번
		Set<String> a15 = new HashSet<String>();
		a15.add("한국");
		a15.add("중국");
		a15.add("일본");
		
		a15.add("베트남");
		a15.add("중국");
		System.out.println(a15);
		
		a15.remove("일본");
		System.out.println(a15);
		
		a15.add("홍콩");
		a15.add("한국");
		a15.add("태국");
		System.out.println(a15);
//		자바 결과 [중국, 홍콩, 태국, 한국, 베트남]
//		파이썬 결과 {'한국', '중국', '베트남', '홍콩', '태국'}
		
		//17번 
		Vehicle obj = new Car("Spark");
		System.out.println(obj.getName());
		// 결과 Vehicle name: Spark
		
		//20번
		Child obj20 = new Child();
		System.out.println(obj20.getX());
		// 결과 500
	}
	//14번  오름차순 정렬
	public static void Usort(int[] array, int length) {
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length - i - 1; j++ ) {
				if(array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}
	//14번  오름차순 정렬
	private static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp; //idx2
	}

}
