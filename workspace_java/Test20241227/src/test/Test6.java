package test;

public class Test6 {

	public static void main(String[] args) {
//		MovieThread 클래스 만들기 Thread 상속
//		run메서드 오버라이딩
//		for 1 ~ 3 반복 "동영상을 재생합니다"
//		sleep() 1초 멈춤
		
//		MusicRunnable 클래스 만들기 Runnable 상속
//		run메서드 오버라이딩
//		for 1 ~ 3 반복 "음악을 재생합니다"
//		sleep() 1초 멈춤
		
//		객체생성
		MovieThread movieThread = new MovieThread();
		Thread thread = new Thread(new MusicRunnable());
//		쓰레드 실행
		movieThread.start();
		thread.start();

	}

}
