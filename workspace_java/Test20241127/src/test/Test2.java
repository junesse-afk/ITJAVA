package test;

public class Test2 {

	public static void main(String[] args) {
//		클래스 MyDate 정의
//		멤버변수 name,int year, month, day
//		private 멤버변수 데이터 은닉
//		public set메서드, get메서드 정의
		
		MyDate myDate = new MyDate();
		myDate.setName("홍길동");
		myDate.setYear(2000);
		myDate.setMonth(10);
		myDate.setDay(5);
		
		System.out.println(myDate.getName());
		System.out.println(myDate.getYear());
		System.out.println(myDate.getMonth());
		System.out.println(myDate.getDay());
		

	}

}
