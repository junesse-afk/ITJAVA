package test;

public class Test3 {

	public static void main(String[] args) {
//		hello(횟수 전달받은 정수형 변수선언) 함수 정의 
//		for 반복 횟수   1 ~ 반복 회수 => 1 Hello World 출력
//		리턴값 없음
		hello(10);
		
//		gugudan(몇단을 전달받은 정수형 변수선언) 함수 정의
//		for 전달받은 단을 가지고 하나의 단을 출력
//		리턴값 없음
		gugudan(2);
	}
	public static void gugudan(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
		return;
	}
	
	public static void hello(int num) {
		for(int i = 1; i <= num; i++) {
			System.out.println(i + "Hello World");
		}
		return;
	}

}
