package test;

public class Test1 {

	public static void main(String[] args) {
//		Board 클래스 정의
//		static 멤버변수 int num
//		멤버변수 private name, subject, content
//		기본 생성자 num 1씩 증가 
//		메서드 setter getter
		
//		BoardDAO 클래스 정의
//		메서드() 리턴할형 없음 insertBoard
//		(Board기억장소 주소 전달 받은 값을 저장하는 변수)
//		전달받은 값을 글번호: 이름: 제목: 내용 :출력 
		
		Board board = new Board();
		board.setName("김길동");
		board.setSubject("제목");
		board.setContent("내용");
		
		System.out.println("게시판1 주소 : " + board);
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.insertBoard(board);
		
		Board board2 = new Board();
		board2.setName("이길동");
		board2.setSubject("제목2");
		board2.setContent("내용2");
		
		System.out.println("게시판2 주소 : " + board2);
		
		boardDAO.insertBoard(board2);
		
		
		
		

	}

}