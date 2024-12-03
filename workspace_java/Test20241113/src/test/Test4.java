package test;

public class Test4 {
//	public static void 함수이름(전달받은 값을 저장하는 변수) {
	// void 리턴 결과 없을 때, 결과값의형 리턴 결과 있을 때
//	//자주 사용하는 기능
//	//함수 이름 부른곳으로(호출한곳) 되돌아감(생략가능)
//	return 결과값;
//}
	public static void main(String[] args) {
//		hello() 메서드 호출 => 인사말 출력 hello 함수정의, 결과없음
		hello();
		
//		원의 면적 cir(반지름값) 
//		=> 반지름 * 반지름 * 3.14 원의 면적을 구해서 출력하는 
//		   cir(반지름값을 저장하는 변수) 함수 정의 , 리턴할 결과없음
		int a = 10;
		cir(a);
		
//		짝수 홀수 구하는 기능을 fun1(수를 전달받아서 저장하는 변수) 
//		짝수 홀수 출력 함수 정의 , 리턴할값 없음 
		
		fun1(8);
		
	}//main()
	
	public static void fun1(int num) {
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		return;
	}
	
	public static void cir(int r) {
		System.out.println(r * r * 3.14);
		return;
	}

	public static void hello() {
		// void 리턴값 없음
		System.out.println("안녕하세요");
		System.out.println("안녕");
		System.out.println("hello");
		System.out.println("hi");
		return;
	}

	
}//class
