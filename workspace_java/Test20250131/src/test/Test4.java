package test;

import java.util.Scanner;

class A{
	public void paint() {
		System.out.println("A");
		draw();
	}
	public void draw() {
		System.out.println("B");
		draw();// 자식의 draw() 호출
	}
}
class B extends A{

	@Override
	public void paint() {
		super.draw();
		System.out.println("C");
		this.draw();
	}

	@Override
	public void draw() {
		System.out.println("D");
	}
	
}

//5번
class Data{
	char c;
	int num;
}

//11번
class Parent11{
	int compute(int num) {
		if(num <= 1) {
			return num;
		}
		return compute(num - 1) + compute(num - 2);
	}
}

class Child11 extends Parent11{
	int compute(int num) {
		System.out.println("Child11 compute() " + num);
		if(num <= 1) {
			return num;
		}
		return compute(num - 1) + compute(num - 3);
//		compute(7)
//		compute(6) + compute(4)
//		compute(5) + compute(3) + compute(4)
//		compute(4) + compute(2) + compute(3) + compute(4)
//		compute(3) + compute(1) + compute(2) + compute(3) + compute(4)
//		compute(2) + compute(0) + compute(1) + compute(2) + compute(3) + compute(4)
//		compute(1) + compute(-1) + compute(0) + compute(1) + compute(2) + compute(3) + compute(4)
//		compute(1) + compute(-1) + compute(0) + compute(1) + compute(1) + compute(-1) + compute(3) + compute(4)
//		compute(1) + compute(-1) + compute(0) + compute(1) + compute(1) + compute(-1) + compute(2) + compute(0) + compute(4)
//		compute(1) + compute(-1) + compute(0) + compute(1) + compute(1) + compute(-1) + compute(1) + compute(-1) + compute(0) + compute(4)
//		compute(1) + compute(-1) + compute(0) + compute(1) + compute(1) + compute(-1) + compute(1) + compute(-1) + compute(0) + compute(3) + compute(1)
//		compute(1) + compute(-1) + compute(0) + compute(1) + compute(1) + compute(-1) + compute(1) + compute(-1) + compute(0) + compute(2) + compute(0) + compute(1)
//		compute(1) + compute(-1) + compute(0) + compute(1) + compute(1) + compute(-1) + compute(1) + compute(-1) + compute(0) + compute(1) + compute(-1) + compute(0) + compute(1)
		// 결과 2
		
	}	
}

//13번
class Person{
	private static  String name;
	public Person(String val) {
		name = val;
	}
	public static String get() {
		// static 변수가 아님 => 에러 발생
		return name;
	}
	public void print() {
		System.out.println(name);
	}
}

public class Test4 {

	public static void main(String[] args) {
//		2023년 3회 정보처리기사 실기 기출
// 		1번
		A b = new B();
		b.paint();
		b.draw();
//		B		D		C		D		D
		
//		A a = new A();
//		a.paint();//무한루프
//		a.draw(); //무한루프
		
//		4번
//		완전수 : 자기 자신을 제외한 약수(진약수)들의 합이 자기 자신이 되는 수
//		6, 28, 496, 8128
		
		int i = 0;
		int sum = 0;
		for(i = 2; i <= 100; i++) {
			if(test(i) == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		//결과 34  => 6 + 28
		
		// 5번
		int num = 10;
		Data d1 = new Data();
		Data d2 = new Data();
		
		d1.num = num;
		d2.num = num;
		
		System.out.println(d1.num);
		System.out.println(d2.num);
		// 결과 
		// 10
		// 10
		// 괄호 -> 
		
//		short var1 = 1, var2 = 2;
//		short *ptr = NULL;
//		ptr = &var1;  // var1 변수의 주소
//		var2 = *ptr;  // var1 변수의 주소에 해당하는 값
//		결과
//		var1 = 1
//		ptr = var1 주소
//		var2 = 1
		
//		포인트 1증가는 => 다음데이터 가리킴
//		*ptr   *(ptr+1)
//		ptr[0] ptr[1]
		
//		구조체 
//		(*ptr).x,  (*ptr).y 우선순위 때문 괄호필요
//		괄호대신 ptr->x, ptr->y
//		ptr[i].x, ptr[i].y
		
		
		
		
		// 8번
		System.out.println(f(7));
		//결과 5040 => 7 * 6 * 5 * 4 * 3 * 2 * 1
		//10번
		String p = "KOREA";
		System.out.printf("%s\n" , p); //p // KOREA
		System.out.printf("%s\n" , p.substring(1)); //p+1 //OREA
		System.out.printf("%s\n" , p.charAt(0)); //*p //K
		System.out.printf("%s\n" , p.charAt(3)); //*(p+3) //E
		System.out.printf("%s\n" , (char)(p.charAt(0) + 4)); //*p + 4  //O
		
		//11번
		Parent11 parent11 = new Child11();
		System.out.println(parent11.compute(7));
		//결과 2
		
		//13번
		Person person2 = new Person("Kim");
		person2.print();
		//결과 Kim
		//에러줄 7번라인
		
		//14번 파이썬 
//		num1, num2 = input().split()
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(num1 + " " + num2);
		int num3 = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + num3);
		
	}
	//8번
	public static int f(int n) {
		if(n <= 1) {
			return 1;
		}else {
			return n * f(n - 1);
		}
	}
	
	
//	4번
	public static int test(int n) {
		int i = 0;
		int sum = 0;
		for(i = 1; i <= n / 2; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		if(n == sum) {
			return 1;
		}
		return 0;
	}

}
