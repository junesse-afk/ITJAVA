package test;

import java.util.Scanner;

public class Test3 {
	
	//9번
	static final int MAX_SIZE = 10;
	static int isWhat[] = new int[MAX_SIZE];
	static int point = -1;
//	9번
	static void into(int num) {
		if(point >= 10) {
			System.out.println("full");
		}
		isWhat[++point] = num;
		// isWhat[0] = 5
		// isWhat[1] = 2 
		// isWhat[1] = 4 
		// isWhat[2] = 1
		// isWhat[2] = 3
		// isWhat[1] = 6
	}
	static int take() {
		if(isEmpty() == 1) {
			System.out.println("Empty");
		}
		return isWhat[point--];
		//return isWhat[1] => point-- 0
		//return isWhat[2] => point-- 1
		//return isWhat[2] => point-- 1
		//return isWhat[1] => point-- 0
		//return isWhat[1] => point-- 0
		//return isWhat[0] => point-- -1
	}
	
	static int isEmpty() {
		if(point == -1) {
			return 1;
		}
		return 0;
	}
	
	static int isFull() {
		if(point == 10) {
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
//		2023년 2회 정보처리기사 실기 기출
//		1번
//		int n[] = new int[5];
//		int i;
//		Scanner scanner = new Scanner(System.in);
//		for(i = 0; i < 5; i++) {
//			System.out.print("숫자를 입력해주세요 : ");
//			n[i] = scanner.nextInt();
////			입력값이 54321 되도록 입력
//		}
//		for(i = 0; i < 5; i++) {
//			System.out.print(n[(i + 1) % 5]);
//		}
		//결과 43215
		//괄호 정답 n[(i + 1) % 5]
		
		System.out.println();
		System.out.println("-------------------");
		
		//2번
		int m = 4620;
		int a = m / 1000;
		int b = (m % 1000) / 500;
		int c = (m % 500) / 100;
		int d = (m % 100) / 10;
		
		System.out.println(a);//4
		System.out.println(b);//1
		System.out.println(c);//1
		System.out.println(d);//2
		
		// 괄호 
//		  m / 1000;
//		 (m % 1000) / 500;
//		 (m % 500) / 100;
//		 (m % 100) / 10;
		System.out.println();
		System.out.println("-------------------");
		//3번 
		String test1;
		String test2;
		String test3;
		
		test1 = test();
		test2 = test();
		test3 = test();
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
//		자바 결과 
//		홍길동
//		김철수
//		박영희
		
//		C언어 결과
//		박영희
//		박영희
//		박영희
		System.out.println();
		System.out.println("-------------------");
		//5번 
		int n[] = {73,95,82};
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += n[i];
		}
		switch (sum/30) {
		case 10:
		case 9:System.out.print("A");
		case 8:System.out.print("B");
		case 7:
		case 6:System.out.print("C");
		default:System.out.print("D");
		}
//		결과
//		BCD
		System.out.println();
		System.out.println("-------------------");
		// 7번
		int c7 = 0;
		for(int i = 1; i <= 2023; i++) {
			if(i % 4 == 0) {
				c7++;
			}
		}
		System.out.println(c7);
		// 결과  505
		System.out.println();
		System.out.println("-------------------");		
		//9번
		int e;
		into(5);
		into(2);
		while(!(isEmpty() == 1)) {
			System.out.println(take());
			into(4);
			into(1);
			System.out.println(take());
			into(3);
			System.out.println(take());
			System.out.println(take());
			into(6);
			System.out.println(take());
			System.out.println(take());
		}
		
//		결과 2		1		3		4		6		5
		System.out.println();
		System.out.println("-------------------");
		//14번
		String str1 = "Programming";
		String str2 = "Programming";
		String str3 = new String("Programming");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
//		결과 
//		true
//		false
//		true
//		true
		System.out.println();
		System.out.println("-------------------");
		//18번  오름차순
		int E[] = {64,25,12,22,11};
		int n18 = E.length;
		int i = 0;
		do {
			int j = i + 1;
			do {
				if(E[i] > E[j]) {
					int tmp = E[i];
					E[i] = E[j];
					E[j] = tmp;
				}
				j++;
			}while(j < n18);
			i++;
		}while(i < n18 - 1);
		
		for(i = 0; i <= 4; i++) {
			System.out.print(E[i] + " ");
		}
//		괄호 >
//		결과 11 12 22 25 64
		System.out.println();
		System.out.println("-------------------");
		// 19번
		String a19 = "engineer information processing";
		String b19 =  a19.substring(0, 3); //a[:3] 
		System.out.println(b19); //eng
		String c19 =  a19.substring(4, 6); //a[4:6] 
		System.out.println(c19); //ne
		String d19 =  a19.substring(28); //a[28:] 
		System.out.println(d19); //ing
		String e19 = b19 + c19 + d19;
		System.out.println(e19); //engneing
//		결과 engneing
		
		
	}
	

	
	//3번 test() 메서드 
	static String n = "";
//	static Scanner scanner = new Scanner(System.in);
	
	public static String test() {
		System.out.print("입력하세요 : ");
		
//		n = scanner.nextLine();
		return n;
	}

}
