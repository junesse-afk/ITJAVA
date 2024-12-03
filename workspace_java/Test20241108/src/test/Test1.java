package test;

public class Test1 {

	public static void main(String[] args) {
//		p123 
//		1) if else if 구문 , switch case 구문
//		조건 operator '+','-','*','/' => 사칙연산 출력
		int num1 = 10;
		int num2 = 2;
		char operator = '~';
		if (operator == '+') {
			System.out.println(num1 + num2);
		} else if (operator == '-') {
			System.out.println(num1 - num2);
		} else if (operator == '*') {
			System.out.println(num1 * num2);
		} else if (operator == '/') {
			System.out.println(num1 / num2);
		} else {
			System.out.println("연산자 아님");
		}

		switch (operator) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("연산자 아님");
		}

//		2) for 1 ~ 100 반복
//		if 3의 배수의 갯수 구하기 => 마지막에 출력
//		if 5의 배수의 갯수 구하기 => 마지막에 출력
		int count1 = 0;
		int count2 = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 3 == 0) {
////				System.out.println(i);
//				count1++;
//			}
//			if(i % 5 == 0) {
////				System.out.println(i);
//				count2++;
//			}
//		}
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0) {
				count1++;
			}
			if (i % 5 == 0) {
				count2++;
			}
			i++;
		}
		System.out.println("3의 배수 개수 : " + count1);
		System.out.println("5의 배수 개수 : " + count2);

//		3) for(char ch = 'A';조건 ;증가값)  A ~ Z 출력
//		if 'G' 이면 반복문 빠져나오기
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			if(ch == 'G') {
				break;
			}
		}

	}

}
