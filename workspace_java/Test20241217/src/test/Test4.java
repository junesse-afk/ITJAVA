package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test4 {

	public static void main(String[] args) {
//		회원정보, 게시판 정보 => 조인 => 하나의 공간에 담아서 사용
		Map<String, Object> map1 =
				new HashMap<String, Object>();
		map1.put("id", "kim");
		map1.put("name", "김길동");
		map1.put("num", 5);
		map1.put("subject", "제목");
		map1.put("content", "내용");
		map1.put("readcount", 10);
		
		Map<String, Object> map2 =
				new HashMap<String, Object>();
		map2.put("id", "kim");
		map2.put("name", "김길동");
		map2.put("num", 10);
		map2.put("subject", "제목10");
		map2.put("content", "내용10");
		map2.put("readcount", 20);
		
		Map<String, Object> map3 =
				new HashMap<String, Object>();
		map3.put("id", "kim");
		map3.put("name", "김길동");
		map3.put("num", 15);
		map3.put("subject", "제목15");
		map3.put("content", "내용15");
		map3.put("readcount", 25);
		
		List<Map<String, Object>> list 
			= new ArrayList<Map<String, Object>>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
//		[
//		{readcount=10, subject=제목, num=5, name=김길동, 
//		  id=kim, content=내용}, 
//	    {readcount=20, subject=제목10, num=10, 
//		  name=김길동, id=kim, content=내용10}, 
//	    {readcount=25, subject=제목15, num=15, name=김길동, 
//	      id=kim, content=내용15}
//		]
		System.out.println(list);
		for(int i = 0; i < list.size(); i++) {
			Map<String, Object> map = list.get(i);
			System.out.println(map);
			System.out.println(map.get("num"));
			System.out.println(map.get("subject"));
			System.out.println(map.get("content"));
			System.out.println("-----------------");
		}
		for(Map<String, Object> map : list) {
			System.out.println(map);
			System.out.println(map.get("id"));
			System.out.println(map.get("name"));
			System.out.println(map.get("readcount"));
			System.out.println("-----------------");
		}
		System.out.println("========================");
//		MapTest 객체생성
		MapTest mapTest = new MapTest();
//		mapprn2(list) 메서드 호출 => 내용 출력
		mapTest.mapPrn2(list);
	}

}
