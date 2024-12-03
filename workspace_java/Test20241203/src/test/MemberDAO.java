package test;

import java.util.ArrayList;

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
	
//	리턴할형 없음 
//	insertMember2(Member를 저장한 ArrayList 배열변수)
//	for 출력 메서드 정의 
	public void insertMember2(ArrayList<Member> arrayList) {
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getId());
			System.out.println(arrayList.get(i).getPass());
			System.out.println(arrayList.get(i).getName());
		}
		System.out.println("======================");
		for(Member member : arrayList) {
			System.out.println(member.getId());
			System.out.println(member.getPass());
			System.out.println(member.getName());
		}
	}
	

}
