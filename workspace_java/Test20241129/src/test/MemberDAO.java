package test;

public class MemberDAO {
//	MemberDAO 클래스 정의
//	메서드 정의 
//	리턴할형 없음 insertMember
//	(Member기억장소 주소 전달 받은 값을 저장하는 변수)
//	전달받은 값을 아이디 :  비밀번호:  이름: 출력 
	
	public void insertMember(Member m) {
		System.out.println("전달받은 Member기억장소의 주소 : " + m);
		System.out.println(m.getId());
		System.out.println(m.getPass());
		System.out.println(m.getName());
	}
	

}