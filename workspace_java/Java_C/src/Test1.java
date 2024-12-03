import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 자바에서 콘솔창으로 입력받는 방법
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("num: " + num);
		
		// &&(&), ||(|) 차이
		int i = 10;
		boolean result = i > 9 || i++ > 9;
		System.out.println(i);
		
		if (i > 0) {
			System.out.println("양수!");
		} else if (i < 0) {
			System.out.println("음수!");
		}
		
		
	}

}
