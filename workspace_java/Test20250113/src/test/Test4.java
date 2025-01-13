package test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
//		TravelCustomer 클래스
//		멤버변수 name, age, price
//		생성자 3개의 멤버변수 값을 받는 생성자
//		getName() getAge() getPrice() 메서드 정의
//		toString() 메서드 멤버변수 내용 출력
		
//		TravelCustomer 객체생성 3개
		TravelCustomer customer1 = 
				new TravelCustomer("이순신", 40, 100);
		TravelCustomer customer2 = 
				new TravelCustomer("김유신", 20, 100);
		TravelCustomer customer3 = 
				new TravelCustomer("홍길동", 13, 50);
		
//		List<TravelCustomer> = ArrayList() 객체생성
		List<TravelCustomer> list = 
				new ArrayList<TravelCustomer>();
		
//		배열 TravelCustomer 3개 저장
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		//고객명단  출력
		list.stream().map(c -> c.getName())
				     .forEach(s -> System.out.println(s));
		System.out.println("----------------------");
//		20세 이상 고객명단 정렬하여 출력 filter() sorted() forEach()
//		map()  name, age, price 지정
		list.stream().filter(c -> c.getAge() >= 20)
					 .map(c -> c.getName())
					 .sorted()
					 .forEach(s -> System.out.println(s));
		System.out.println("----------------------");
		
		list.stream().filter(c -> c.getAge() >= 20)
		 			.map(c -> c.getAge())
		 			.sorted()
		 			.forEach(s -> System.out.println(s));
		System.out.println("----------------------");
//		총 여행 비용
		int total = list.stream()
				    .mapToInt(c -> c.getPrice())
				    .sum();
		System.out.println("총 여행 비용 : " + total);
		
	}
}
