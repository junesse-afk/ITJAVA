package test;

public class Test4 {

	public static void main(String[] args) {
//		변수 : 기억장소 하나에 값 하나만 저장
		int a1 = 10;
		int a2 = 20;
		int a3 = 30;
		int a4 = 40;
		int a5 = 50;
//		System.out.println(a1);
		int a6;
//		System.out.println(a6);//초기값이 없어서 에러발생
		
//		배열 : 같은형 기억장소를 여러개 만들어서 사용
//		1) 배열선언 할때 : 초기값 0 할당
		int a[] = new int[5];
		System.out.println(a); //[I@15975490 5개 기억장소 주소
		System.out.println(a[0]);//초기값 0
		System.out.println(a[1]);//초기값 0
		System.out.println(a[2]);//초기값 0
		System.out.println(a[3]);//초기값 0
		System.out.println(a[4]);//초기값 0
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println(a[0]);//10
		System.out.println(a[1]);//20
		System.out.println(a[2]);//30
		System.out.println(a[3]);//40
		System.out.println(a[4]);//50
		
//		2) 배열선언 할때 : 원하는 초기값 할당
		int b[] = {10, 20, 30, 40, 50};
		System.out.println(b[0]);//10
		System.out.println(b[1]);//20
		System.out.println(b[2]);//30
		System.out.println(b[3]);//40
		System.out.println(b[4]);//50	
		
//		3) 배열선언 할때 : 원하는 초기값 할당
		int c[] = new int[]{10, 20, 30, 40, 50};
		System.out.println(c); //주소 
		System.out.println("배열 크기 저장하는 변수 : " + c.length);
		for(int i = 0; i < c.length; i++) {
			//i = 0 => c[0]
			//i = 1 => c[1]
			//i = 2 => c[2]
			//i = 3 => c[3]
			//i = 4 => c[4]
			System.out.println(c[i]);//10  출력
		}
		
	}

}
