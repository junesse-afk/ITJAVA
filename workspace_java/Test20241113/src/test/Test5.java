package test;

public class Test5 {

	public static void main(String[] args) {
//		두 수를 더해서 결과를 받은 fun1(두 수를 받아서 저장하는 변수)
//		함수 정의, 리턴값 있음
		System.out.println("리턴받은 결과 : " + fun1( 10 , 20 ));
		int c = fun1( 10 , 20 );
		System.out.println("리턴받은 결과 : " + c);
		System.out.println("리턴받은 결과 / 2 : " + c / 2);
	
//		float 두 수를 곱해서 결과를 받은 
//		fun2(두 수를 받아서 저장하는 float 변수)
//		함수 정의, float 리턴값 있음
		System.out.println(fun2(8.5f, 3.4f));
		System.out.println(fun2(8.5f, 3.4f) / 2 );
	}//main()
	
	public static float fun2(float a, float b) {
		return a * b;
	}
	
	
	public static int fun1(int a, int b) {
		System.out.println("받은 값 : " + a);
		System.out.println("받은 값 : " + b);
		return a + b;
	}

}//class
