package test;

public interface RemoteControl {
//	인터페이스 RemoteControl
//	멤버변수 => 무조건 객체생성없이 사용하는 상수변수 
//	       => static final 생략가능
//	MAX_VOLUME = 10 초기값
//	MIN_VOLUME = 0 초기값
	/* static final */ int MAX_VOLUME = 10;
	/* static final */ int MIN_VOLUME = 0;
	
//	추상메서드 => 무조건 추상메서드만 있음 
//	         => abstract 생략가능
//	리턴값없음 turnOn()
	public /* abstract */ void turnOn();
//	리턴값없음 turnOff()
	public /* abstract */ void turnOff();
//	리턴값없음 setVolume(int volume)
	public /* abstract */ void setVolume(int volume);
}
