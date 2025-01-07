package test;

public class Test3 {

	public static void main(String[] args) {
//		인터페이스 RemoteControl
//		멤버변수 => 무조건 객체생성없이 사용하는 상수변수 
//		       => static final 생략가능
//		MAX_VOLUME = 10 초기값
//		MIN_VOLUME = 0 초기값
//		추상메서드 => 무조건 추상메서드만 있음 
//		         => abstract 생략가능
//		리턴값없음 turnOn()
//		리턴값없음 turnOff()
//		리턴값없음 setVolume(int volume)
		
//		클래스 Television 상속(구현) RemoteControl
//		멤버변수 int volume 정의
//		메서드 강제적으로 재정의
//		turnOn() "TV를 켭니다"
//		turnOff() "TV를 끕니다"
//		setVolume(int volume)
//		if volume > MAX_VOLUME 비교 volume = MAX_VOLUME
//		else if volume < MIN_VOLUME 비교 volume = MIN_VOLUME	
//		else volume = volume
//		출력 "현재 TV 볼륨 : volume"
		
//		클래스 Audio 상속(구현) RemoteControl
//		멤버변수 int volume 정의
//		메서드 강제적으로 재정의
//		turnOn() "Audio를 켭니다"
//		turnOff() "Audio를 끕니다"
//		setVolume(int volume)
//		if volume > MAX_VOLUME 비교 volume = MAX_VOLUME
//		else if volume < MIN_VOLUME 비교 volume = MIN_VOLUME	
//		else volume = volume
//		출력 "현재 Audio 볼륨 : volume"
		
//		Television 객체생성 , turnOn() set() turnOff() 메서드 호출
//		Audio 객체생성 , 메서드 호출
		Television television = new Television();
		television.turnOn();
		television.setVolume(100);
		television.setVolume(-5);
		television.setVolume(8);
		television.turnOff();
		television.search("www.television.com");
		
		Audio audio = new Audio();
		audio.turnOn();
		audio.setVolume(10);
		audio.turnOff();
		audio.search("www.audio.com");
		System.out.println("------------------");
//		부모 = 자식 객체생성 , 메서드 호출 
//		추상인터페이스, 강제적 메서드 재정의, 업캐스팅,
//		동일메서드 호출(내용은 자식이 재정의) 다형성 
		RemoteControl remoteControl = null;
		remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setVolume(5);
		remoteControl.turnOff();
//		remoteControl.search(); 에러
		
		remoteControl = new Audio();
		remoteControl.turnOn();
		remoteControl.setVolume(7);
		remoteControl.turnOff();
//		remoteControl.search(); 에러
		
//		인터페이스 다중 상속 가능
//		인터페이스 Searchable 정의
//		추상 메서드 리턴값 없음 search(String url) 정의
		
//		Television, Audio 에 ,Searchable 상속(구현)
		Searchable searchable = new Television();
		searchable.search("www.tv.com");
		
		searchable = new Audio();
		searchable.search("www.au.com");
	}

}
