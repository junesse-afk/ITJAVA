
public class Test5 {

	public static void main(String[] args) {

		// if ~ else if
//		int num = 2;
//		
//		if (num == 1) {
//			System.out.println(1);
//		} else if (num == 2) {
//			System.out.println(2);
//		} else if (num == 3) {
//			System.out.println(3);
//		} else {
//			System.out.println("???");
//		}
		
		// if (return)
//		int num = 2;
//		if (num == 1) {
//			System.out.println(1);
//			return;
//		} 
//		if (num == 2) {
//			System.out.println(2);
//			return;
//		} 
//		if (num == 3) {
//			System.out.println(3);
//			return;
//		}
//		System.out.println("???");
		
		// switch - case
//		int num = 2;
//		switch (num) {
//		case 1: System.out.println(1); break;
//		case 2: System.out.println(2); break;
//		case 3: System.out.println(3); break;
//		default: System.out.println("???"); break;
//		}
		
		// 90점대: A학점
//		int score = 98;
//		
//		if (90 <= score && score <= 100) {
//			System.out.println("A");
//		} else if (80 <= score && score <= 89) {
//			System.out.println("B");
//		} else if (70 <= score && score <= 79) {
//			System.out.println("C");
//		} else if (60 <= score && score <= 69) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		int score = 98;
		
		switch (score / 10) {
		case 10:
		case 9: System.out.println("A"); break;
		case 8: System.out.println("B"); break;
		case 7: System.out.println("C"); break;
		case 6: System.out.println("D"); break;
		default: System.out.println("F"); break;
		}
		
		
	}
}
