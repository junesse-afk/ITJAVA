package test;

public class Board {
//	Board 클래스 정의
//	멤버변수 int num,name,subject,content,int readcount 정의
	public int num;
	public String name;
	public String subject;
	public String content;
	public int readcount;
	
//	메서드() prn() 번호 : , 글쓴이 : , 제목 : , 내용 : , 조회수 : 출력
	public void prn() {
		System.out.println("번호 : " + num);
		System.out.println("글쓴이 : " + name);
		System.out.println("제목 : " + subject);
		System.out.println("내용 : " + content);
		System.out.println("조회수 : " + readcount);
	}
	
//	생성자=> 기억장소 할당, 초기값 할당
//	기본생성자 => 0, null 기본 초기값 할당
//	자기자신 생성자 호출
	public Board(){
//		자기자신 생성자 호출
		this(1, "작성자", "제목", "내용", 0);
	}
	
//	num,name,subject,content,readcount 값을 받아서 
//	멤버변수에 초기값 할당하는 생성자
	public Board(int num, String name, String subject, String content, int readcount){
		this.num = num;
		this.name = name;
		this.subject = subject;
		this.content = content;
		this.readcount = readcount;
	}
}