package test;

public class Book {
//	Book 클래스 정의
//	멤버변수 private String bookName, author
//	기본생성자
//	모든 값을 받는 생성자
//	set, get메서드 정의
//	prn()메서드 책이름, 저자 출력
	
	private String bookName;
	private String author;
	
	public Book() {
		
	}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void prn() {
		System.out.println("책이름 : " + bookName);
		System.out.println("저자 : " + author);
	}
	
	
}