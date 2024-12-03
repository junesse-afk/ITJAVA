package test;

import java.util.ArrayList;

public class BoardDAO {
//	BoardDAO 클래스 정의
//	메서드() 리턴할형 없음 insertBoard
//	(Board기억장소 주소 전달 받은 값을 저장하는 변수)
//	전달받은 값을 글번호: 이름: 제목: 내용 :출력
	public void insertBoard(Board board) {
		System.out.println("글번호 : " + Board.getNum());
		System.out.println("이름 : " + board.getName());
		System.out.println("제목 : " + board.getSubject());
		System.out.println("내용 : " + board.getContent());
	}
	
//	리턴할형 없음 
//	insertBoard2(Board를 저장한 ArrayList 배열변수)
//	for 출력 메서드 정의 
	public void insertBoard2(ArrayList<Board> arr) {
		System.out.println("전달 받은 주소 : " + arr);
		for(int i = 0; i < arr.size(); i++ ) {
			arr.get(i).prn();
		}
		for(Board b : arr) {
			b.prn();
		}
	}
	
}