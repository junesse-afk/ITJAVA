package test;

import test.Button.OnClickListener;

public class Window {
//	Window 클래스 정의
//	Button button1 객체생성
	Button button1 = new Button();
//	Button button2 객체생성
	Button button2 = new Button();
	
//	멤버변수 OnClickListener listener = new 익명객체 생성
//	onClick()  "전화를 겁니다"
	OnClickListener listener = new OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};
	
//	Window() 생성자
//	button1.setListener(listener) 메서드 호출
//	button2.setListener(new 익명객체)메서드 호출
//	onClick()  "메시지를 보냅니다"
	
	public Window() {
		button1.setListener(listener);
		button2.setListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다");
			}
		});
	}
}
