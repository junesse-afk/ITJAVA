package test;

public class Audio implements RemoteControl, Searchable{

//	클래스 Audio 상속(구현) RemoteControl
//	멤버변수 int volume 정의
	int volume;
//	메서드 강제적으로 재정의
//	turnOn() "Audio를 켭니다"
//	turnOff() "Audio를 끕니다"
//	setVolume(int volume)
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}
	@Override
	public void setVolume(int volume) {
//		if volume > MAX_VOLUME 비교 volume = MAX_VOLUME
//		else if volume < MIN_VOLUME 비교 volume = MIN_VOLUME	
//		else volume = volume
//		출력 "현재 TV 볼륨 : volume"
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	@Override
	public void search(String url) {
		System.out.println("Audio : " + url + " 을 검색합니다");
	}

}
