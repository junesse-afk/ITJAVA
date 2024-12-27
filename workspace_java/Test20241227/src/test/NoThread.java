package test;

public class NoThread {
	
//	멤버변수 => 정수형 count, 문자열 data
	private int count;
	private String data;
//	생성자 => count, data 받는 생성자
	public NoThread(int count,String data) {
		this.count = count;
		this.data = data;
	}
//	메서드 => 리턴값 없음 run() for 1 ~ count 반복 출력 1 : data
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(i + ":" + data);
		}
	}

}
