package test;

public class Test1 {

	public static void main(String[] args) {
//		Window 클래스 정의
//		Button button1 객체생성
//		Button button2 객체생성
		
//		멤버변수 OnClickListener listener = new 익명객체 생성
//		onClick()  "전화를 겁니다"
		
//		window() 생성자
//		button1.setListener(listener) 메서드 호출
//		button2.setListener(new 익명객체)메서드 호출
//		onClick()  "메시지를 보냅니다"
		System.out.println("==========");
//		Window 객체생성
		Window window = new Window();
//		button1 touch() 메서드 호출
		window.button1.touch();
//		button2 touch() 메서드 호출
		window.button2.touch();
	}

}
