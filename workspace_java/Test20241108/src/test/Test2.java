package test;

public class Test2 {

	public static void main(String[] args) {
//		1 2 3 4 5
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 

		for (int j = 1; j <= 5; j++) {
			System.out.print("j = " + j + " : ");
			for (int i = 1; i <= 5; i++) {
//			1 2 3 4 5
				System.out.print(i + " ");
			}
			System.out.println();
		}

//	*****
//	*****
//	*****
//	*****
//	*****
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

//	j 행,i 열
//	11,12,13,14,15
//	21,22,23,24,25
//	31,32,33,34,35
//	41,42,43,44,45
//	51,52,53,54,55
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 5; i++) {
				if (i != 5) {
					System.out.print(j + "" + i + ",");
				} else {
					System.out.print(j + "" + i + "");
				}
			}
			System.out.println();
		}

//	2 ~ 9단 출력
//	for 2 ~ 9단 
//	for 1 ~ 9곱해서  하나의 단 출력 dan * i = dan * i

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
		}

		System.out.println("=========================");

//	p123
//	2)for for 구구단 if 짝수단만 출력 / continue구문 (홀수단 제외)

		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 2 == 0) {
				System.out.println(dan + "단");
				for (int i = 1; i <= 9; i++) {
					System.out.println(dan + "*" + i + "=" + dan * i);
				}
			}

		}
		System.out.println("=========================");

		for (int dan = 2; dan <= 9; dan++) {
			if (dan % 2 == 1) {
				continue;
			}
			System.out.println(dan + "단");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
		}
		
		System.out.println("=========================");
//		p123
//		3)for for 구구단 
//		  if 단보다 곱하는 수가 작거나 같은 경우까지 만 출력	(break)
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
				if(dan <= i) {
					break;
				}
			}
		}
		
	}// main()

}// 클래스
