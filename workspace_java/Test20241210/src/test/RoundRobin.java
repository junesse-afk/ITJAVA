package test;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화 순서 대기열 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원 배분");
	}

}
