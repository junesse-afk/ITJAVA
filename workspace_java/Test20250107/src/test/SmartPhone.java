package test;

public class SmartPhone extends Phone{
//	SmartPhone 자식클래스 Phone 상속 받기
//	생성자 owner 받는 생성자
//	추상메서드 재정의 "벨 소리가 울린다"
//	메서드 정의 internetSearch() "인터넷 검색을 합니다"
	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void sound() {
		System.out.println("벨 소리가 울린다");
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
}
