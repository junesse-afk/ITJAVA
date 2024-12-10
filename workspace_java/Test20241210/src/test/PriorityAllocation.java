package test;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("등급 높은 고객 전화 먼저 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("스킬 높은 상담원 우선 배분");
	}

}
