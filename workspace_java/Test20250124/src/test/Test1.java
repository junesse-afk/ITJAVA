package test;

public class Test1 {

	public static void main(String[] args) {
//		2022년 2회 정보처리기사 실기 기출
//      7번
		int i = 3;
		int k = 1;
		switch (i) {
		case 1: k += 1;
		case 2: k++;
		case 3: k = 0;
		case 4: k += 3;
		case 5: k -= 10;
		default: k--;
		}
		System.out.println(k);
		// 결과 -8
		
//		8번 
		A a[] = new A[2] ;
		// java 부분 추가
		a[0] = new A();
		a[1] = new A();
		for(i = 0; i < 2; i++) {
			a[i].n = i;
			a[i].g = i + 1;
		}
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[0].n + a[1].g);
		//결과값 2
		
		//13 번
		String a13 = "REMEMBER NOVEMBER" ;
//		a[:3] + a[12:16]
		String b13 = a13.substring(0, 3) + a13.substring(12, 16);
		System.out.println(b13); //REM EMBE
//		"R AND %s" % "STR"
		String c13 = String.format("R AND %s", "STR");
		System.out.println(c13);
		System.out.println(b13 + c13);// R AND STR
		// 결과 REMEMBER AND STR
		
		//15번
		String p1 = "2022";
		String p2 = "202207";
		
		int a15 = len(p1); //4
		int b15 = len(p2); //6
		
		System.out.println(a15 + b15); //10
		
//		결과 10
		
		// 16번 
		int a16[] = {0,2,4,8};
		int b16[] = new int[3];
//		int i16 = 1;
		int sum = 0;
//		int *p1; 주소
		
		for(i = 1 ;i < 4; i++  ) {
//			p1 = a 주소 + i;
			b16[i - 1] = a16[i] - a16[i - 1];
			sum = sum + b16[i - 1] + a16[i];
//			i = 1  
//			b16[0] = a16[1] - a16[0];  // 2 - 0 = 2
//			sum = sum + b16[0] + a16[1]; // 2  + 2 = 4
//			i = 2  
//			b16[1] = a16[2] - a16[1];  // 4 - 2 = 2
//			sum = sum + b16[1] + a16[2]; //4 + 2  + 4 = 10
//			i = 3  
//			b16[2] = a16[3] - a16[2];  // 8 - 4 = 4
//			sum = sum + b16[2] + a16[3]; //10 + 4  + 8 = 22

		}
		System.out.println(a16[0]);//0
		System.out.println(a16[1]);//2
		System.out.println(a16[2]);//4
		System.out.println(a16[3]);//8
		
		System.out.println(b16[0]);//2
		System.out.println(b16[1]);//2
		System.out.println(b16[2]);//4
		System.out.println(sum);
		// 결과값 22
		
		//17번 멤버변수, 지역변수 
		Conv obj = new Conv(3);
		
		obj.a = 5;
		
		int b = obj.func();
	
		System.out.println(obj.a + b);
		// 결과 61 
		
	}
	
	//15번
	static int len(String p) {
		int r = 0;
		int i = 0;
		while(i < p.length()) {
			r++;
			i++;
		}
		return r;
	}

}
//17번
class Conv{
//	생성자
	public Conv(int a) {
		this.a = a;
	}
//	메서드
	public int func() {
		int b = 1;
		System.out.println("b = " + b);
		for(int i = 1; i < a; i++) {
			b = a * i + b;
			System.out.println("b = " + b);
		}
		return a + b;
	}
//	멤버변수
	int a;
}


//8번
class A{
	int n;
	int g;
	
	@Override
	public String toString() {
		return "A [n=" + n + ", g=" + g + "]";
	}
	
}
