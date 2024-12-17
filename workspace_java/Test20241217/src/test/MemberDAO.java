package test;

import java.util.List;
import java.util.Map;

public class MemberDAO {
//	MemberDAO 클래스 정의
//	메서드 정의 insertMember(MemberDTO memberDTO) => 출력
	
	public void insertMember(MemberDTO memberDTO) {
		System.out.println("MemberDAO insertMember()");
		System.out.println(memberDTO);
		System.out.println(memberDTO.getId());
	}

	public void memberList(List<MemberDTO> list) {
		System.out.println("MemberDAO memberList()");
		for(MemberDTO memberDTO : list) {
			System.out.println(memberDTO);
			System.out.println(memberDTO.getId());
		}
	}

	public void insertMap(Map<String, Object> map) {
		System.out.println("MemberDAO insertMap()");
		System.out.println(map.get("id"));
		System.out.println(map.get("num"));
		System.out.println(map.get("name"));
		System.out.println(map.get("img"));
	}

	public void mapList(List<Map<String, Object>> maplist) {
		System.out.println("MemberDAO mapList()");
		for(Map<String, Object> map : maplist) {
			System.out.println(map.get("id"));
			System.out.println(map.get("num"));
			System.out.println(map.get("name"));
			System.out.println(map.get("img"));
		}
	}
	
}
