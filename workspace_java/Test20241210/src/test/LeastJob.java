package test;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화 순서 대기열 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("대기가 가장 적은 상담원 연결");
	}

}
