package test;

import java.util.Iterator;

public class MovieThread extends Thread{
//	MovieThread 클래스 만들기 Thread 상속
//	run메서드 오버라이딩
//	for 1 ~ 3 반복 "동영상을 재생합니다"
//	sleep() 1초 멈춤
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			System.out.println(i + "동영상을 재생합니다");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
