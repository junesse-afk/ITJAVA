package test;

public class Test6 {

	public static void main(String[] args) {
//		p322
//		인터페이스 Scheduler
//		추상 메서드 getNextCall(), sendCallToAgent() 
		
//		상속받은 클래스 RoundRobin, LeastJob, 
//		             PriorityAllocation
		
		Scheduler scheduler = null;
//		부모 = 자식 객체생성 메서드 호출
		scheduler = new RoundRobin();
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		scheduler = new LeastJob();
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		scheduler = new PriorityAllocation();
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		
	}

}
