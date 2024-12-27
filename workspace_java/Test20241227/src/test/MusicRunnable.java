package test;

public class MusicRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			System.out.println(i + "음악을 재생합니다");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
