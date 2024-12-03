package test;

public class Test1 {

	public static void main(String[] args) {
//		p139 함수 호출 스택 메모리 
		
//		fun1(정수형값을 전달받아서 저장하는 변수) 함수정의
//		받은수가 양수, 음수, 영 => result 결과 리턴(문자열)
//		=> fun1(값) 호출 => 리턴받으면 출력 
		 System.out.println(fun1(-3)); 
		
//		fun2(정수형값을 전달받아서 저장하는 변수) 함수정의
//		y = 3*x +5
//		3*전달받은값 + 5 => y 결과 리턴(정수형)
//		=> fun2(값) 호출 => 리턴받으면 출력 
		System.out.println(fun2(10));
	}
	
	public static int fun2(int x) {
		int y = 3 * x + 5;
		return y;
	}
	
	
	public static String fun1(int num) {
//		받은수가 양수, 음수, 영
		String result = "영";
		if(num > 0) {
			result = "양수";
		}else if(num < 0) {
			result = "음수";
		}
//		함수는 무조건 결과값 하나만 리턴
		return result;
	}
	

}
