package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test5 {

	public static void main(String[] args) {
//		MemberDTO 클래스 정의
//		멤버변수 id,pass,name,int age,gender,email,
//		       Timestamp date
//		생성자 멤버변수 모든 값을 받는 생성자 
//		메서드 set get , toString()
		
//		MemberDTO 객체생성  
		MemberDTO memberDTO = 
new MemberDTO("kim", "p123", "김길동", 10, "남", "kim@n.com", new Date());
//		import java.sql.Timestamp;
//		new Timestamp(System.currentTimeMillis())
		
//		MemberDAO 클래스 정의
//		메서드 정의 insertMember(MemberDTO memberDTO) => 출력
		
//		MemberDAO 객체생성
		MemberDAO memberDAO = new MemberDAO();
//		insertMember(memberDTO) 메서드 호출
		memberDAO.insertMember(memberDTO);
		
//		List배열에 MemberDTO 3명을 담기
		MemberDTO memberDTO1 = 
				new MemberDTO("kim", "p123", "김길동", 10, "남", "kim@n.com", new Date());
		MemberDTO memberDTO2 = 
				new MemberDTO("lee", "p123", "이길동", 10, "남", "kim@n.com", new Date());
		MemberDTO memberDTO3 = 
				new MemberDTO("park", "p123", "박길동", 10, "남", "kim@n.com", new Date());
		
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		list.add(memberDTO1);
		list.add(memberDTO2);
		list.add(memberDTO3);
		
//		MemberDAO에 memberList(List배열) 메서드 호출
		memberDAO.memberList(list);
		
		//map "id:kim", "num:1", "name:applephone","img:1.jpg"
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "kim");
		map.put("num", 1);
		map.put("name", "applephone");
		map.put("img", "1.jpg");
		
//		MemberDAO 파일 insertMap(map) 메서드 호출 => 출력
		memberDAO.insertMap(map);
		
		
//		List배열에 map 3개 담기
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("id", "lee");
		map2.put("num", 2);
		map2.put("name", "samsungphone");
		map2.put("img", "2.jpg");
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("id", "park");
		map3.put("num", 3);
		map3.put("name", "applephone");
		map3.put("img", "3.jpg");
		
		List<Map<String, Object>> maplist 
		= new ArrayList<Map<String,Object>>();
		maplist.add(map);
		maplist.add(map2);
		maplist.add(map3);
		
//		MemberDAO에 mapList(List배열) 메서드 호출
		memberDAO.mapList(maplist);

	}

}
