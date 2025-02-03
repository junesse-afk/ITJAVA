package test;

//3번
class A{
	int a;
	int b;
}

public class Test1 {
	//3번
	static void func1(A m) {
		m.a *= 10;
	}
	static void func2(A m) {
		m.a += m.b;
	}

	public static void main(String[] args) {
//		2022년 1회 정보처리기사 실기 기출
		// 3번
		A m = new A();
		m.a = 100;
		func1(m);
		m.b = m.a;
		func2(m);
		System.out.printf("%d\n", m.a);
		System.out.printf("%d\n", m.b);
		//결과값 2000
		System.out.println();
		System.out.println("----------------");
		//6번
		exam(20);
		
		//11번
		Thread t1 = new Thread(new Car());
		t1.start();
		
		// 밑줄 Car
		
		System.out.println();
		System.out.println("----------------");
		//15번
		int number = 1234;
		int div = 10;
		int result = 0;
		while(number > 0) {
			result = result * div;
			result = result + number % div;
			number = number / div;
		}
		System.out.printf("%d\n" , result);
		
		//19번  소인수 분해 => 가장 큰 소수를 찾기
		int number1 = 13195;
		int max_div = 0;
		int i ;
		// 2 ~ 13194
		for(i = 2; i < 13195; i++) {
//		조건이 만족하는 값 2, 홀수 && 13195 % 홀수 나머지 0 수 찾기
//		isPrime(i) == 1   소수를 찾는것
//		number1 % i == 0  13195 의 약수 인가
		if(isPrime(i) == 1 && number1 % i == 0) 
		{
//			System.out.println(isPrime(i) == 1 && number1 % i == 0);
			max_div = i;
			System.out.printf("%d\n", i);
		}
		}
		System.out.printf("%d\n", max_div);
	}
	//19번
//	소수를 찾는것
	static int isPrime(int number) {
//		System.out.println("isPrime(number)" + number);
		int i;
		for(i = 2; i < number; i++) {
			if(number % i == 0) {
//				System.out.println("return 0");
				return 0;// 나누어 떨어지는 수
			}
		}
//		System.out.println("return 1");
		return 1;//나누어 떨어지지 않으면  소수
	}
	
	//6번 
	static void exam(int num1) {
		int num2 = 2;
		System.out.println("a = " + num1 + " b = " + num2);
	}


}
//11번 
class Car implements Runnable{
	int a;
	@Override
	public void run() {
		System.out.println("message");
	}
}
