
public class Test2 {

	public static void main(String[] args) {
		
		// 1 ~ 10 까지 합(sum) 계산 후 출력
		// 출력형식) "sum: XX"
		
		int sum = 0;
		
//		sum = 0 + 1;
//		sum = 1 + 2;
//		sum = 3 + 3;
//		sum = 6 + 4;
//		sum = 10 + 5;
		
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum + 5;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("sum: " + sum);
		
		// 1 ~ 100 짝수의합(even), 홀수의합(odd) 계산 후 출력
		// 출력형식) "1 ~ 100까지 짝수의 합: XX"
		//		   "1 ~ 100까지 홀수의 합: XX"
		
		int even = 0;	// 짝수
		int odd = 0;	// 홀수
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
		System.out.println("-------------------");
		// 7의 갯수를 출력
		// ex) int n = 247427723;
		//	   출력결과: 3
		
//		int n = 273;
//		
//		int i = 10;
//		
//		i = i * 10; // i: 100
//		i = i * 10; // i: 1000
//		i *= 10;
//		
//		System.out.println(n / 10); // 두자리일때 
//		System.out.println(n / 100); // 세자리일때
//		System.out.println(n / 1000); // 네자리일때
		
//		int count = 0;
//		int num = n / 100;
//		if (num == 7) {
//			count++;
//		}
		// ----------------------------------------
		// int n = 247427723;
		// 뒤에서 부터 한자리씩
		
//		int n = 274;
//		
//		int count = 0;
//		int num = n % 10;
//		if (num == 7) {
//			count++;
//		}
//		n /= 10;	// n값을 27로 바꾸는 작업 
//		
//		num = n % 10;
//		if (num == 7) {
//			count++;
//		}
//		n /= 10;
		
		// -------------------------------
		int n = 274772323;
		
		int count = 0;
		while (n != 0) {
			if ((n % 10) == 7) count++;
			n /= 10;
		}
		System.out.println(count);
		
	}

}
