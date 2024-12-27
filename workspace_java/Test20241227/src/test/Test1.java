package test;

public class Test1 {

	public static void main(String[] args) {
//		프로세스(Process)
//		- 프로그램이 실행하여 메모리에 로딩된 상태
//		- 멀티 테스킹(Multi Tasking)
//		 : 하나의 CPU에 프로세스(여러 프로그램)을 동시에 수행
//		 : 이클립스 실행하면서 크롬을 실행하는 것
		
//		쓰레드(Thread)
//		- 하나의 프로세스 내에 쓰레드 한개(동시에 동작 한개) 일때
		System.out.println("명령1");
		System.out.println("명령2");
//		- 하나의 프로세스 내에 동시에 수행가능한 작업을 늘리면
//		   쓰레드 여러개 갖는 멀티 쓰레드(Multi Thread)를 구현
//		ex) 웹 애플리케이션 서버, 메신저(메시지 송신, 수신 동시에 수행)
		
//		싱글쓰레드(Single Thread)
//		NoThread 클래스 정의
//		객체생성 3개
		NoThread noThread1 = new NoThread(10, "A작업");
		NoThread noThread2 = new NoThread(5, "B작업");
		NoThread noThread3 = new NoThread(10, "C작업");
		
//		메서드 호출 3개
		noThread1.run();
		noThread2.run();
		noThread3.run();

	}

}
