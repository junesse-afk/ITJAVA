package test;

public class Test3 {

	public static void main(String[] args) {
//		Book 클래스 정의
//		멤버변수 private String bookName, author
//		기본생성자
//		모든 값을 받는 생성자
//		set, get메서드 정의
//		prn()메서드 책이름, 저자 출력
		
//		Book 3개의 배열에 저장
//		배열 출력
		
		Book book1 = new Book("토지", "박경리");
		Book book2 = new Book("어린왕자", "생택쥐페리");
		Book book3 = new Book("태백산맥", "조정래");
		
		Book bookArr[] = new Book[3];
		bookArr[0] = book1;
		bookArr[1] = book2;
		bookArr[2] = book3;
		
		for(int i = 0; i < bookArr.length; i++) {
			System.out.println(bookArr[i]);
			bookArr[i].prn();
		}
		
		for(Book b : bookArr) {
			System.out.println(b);
			b.prn();
		}
		

	}

}