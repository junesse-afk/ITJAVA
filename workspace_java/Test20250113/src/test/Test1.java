package test;

public class Test1 {

	public static void main(String[] args) {
//		Myfunction4 함수형인터페이스 
//		int 두수를 받아서 int 리턴 calc()
		
		// printMultiply(100,100, 람다함수 두수의 곱 )호출
//		MyFunction2 f1 = (x) -> {return x*x;};
		printMultiply(100, 100, (x , y) -> {
			return x * y;
		});
	}
	
//	메서드 printMultiply(정수형 x, 정수형 y, Myfunction4 f) 정의
//	출력 "실행결과" f.calc() 호출
	public static void printMultiply(int x, int y, Myfunction4 f) {
		System.out.println("실행결과 : " + f.calc(x, y));
	}
	

}
