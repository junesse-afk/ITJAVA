package test;

public class Test1 {

	public static void main(String[] args) {
		//2021년 2회 정보처리기사 실기
		//7번 비트 연산
		int a = 100;
		int result = 0;
		for(int i = 1; i < 3; i++) {
			result = a >> i;
			System.out.println(result);
			result = result + 1;
			System.out.println(result);
		}
		System.out.println(result);
//		결과 26
		System.out.println();
		System.out.println("----------------");
		// 16번
		int res;
		res = mp(2, 10);
		System.out.printf("%d" , res);
//		결과 1024
		System.out.println();
		System.out.println("----------------");
		// 17번
		System.out.println(Test1.check(1));
		System.out.println(check(1));
		// 괄호답 : static
		System.out.println();
		System.out.println("----------------");
		//18번 
		int []ary = new int[3];
		int s = 0;
		ary[0] = 1;
		ary[1] = ary[0] + 2;
		ary[2] = ary[0] + 3;
		for(int i = 0; i < 3; i++) {
			s = s + ary[i];
		}
		System.out.printf("%d" , s);
		// 결과값 8
		System.out.println();
		System.out.println("----------------");		
		//19번
//		부모 = 부모
		ovr1 a1 = new ovr1();
//		자식 = 자식
		ovr2 a2 = new ovr2();
		
//		부모 = 자식  => 결과 12
//		ovr1 a1 = new ovr2();
//		ovr1 a2 = new ovr2();
		
		System.out.println(a1.sun(3, 2));
		System.out.println(a2.sun(3, 2));
		System.out.println(a1.sun(3, 2) + a2.sun(3, 2));
		//결과값 11
	}//main()
	
	//17번
	static String check(int num) {
		return (num >= 0) ? "positive" : "negative"; 
	}
	
	//16번
	public static int mp(int base, int exp) {
		int res = 1;
		for(int i = 0; i < exp; i++) {
			res = res * base;
		}
		return res;
	}

}

//19번 클래스 
class ovr1{
	public int sun(int x, int y) {
		return x + y;
	}
}
class ovr2 extends ovr1{
	public int sun(int x, int y) {
		return x - y + super.sun(x, y);
	}
}