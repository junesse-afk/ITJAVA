package test;

public class TravelCustomer {
//	TravelCustomer 클래스
//	멤버변수 name, age, price
	String name;
	int age;
	int price;
//	생성자 3개의 멤버변수 값을 받는 생성자
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
//	getName() getAge() getPrice() 메서드 정의
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	
//	toString() 메서드 멤버변수 내용 출력
	@Override
	public String toString() {
		return "TravelCustomer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
}
