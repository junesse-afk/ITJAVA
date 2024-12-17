package test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {
	
//	메서드 리턴할형없음 mapPrn(map받는 변수선언) => map 출력
	public void mapPrn(Map<String, Object> map) {
		System.out.println("MapTest mapPrn()");
		System.out.println(map);
		System.out.println(map.get("id"));
		System.out.println(map.get("name"));
		System.out.println(map.get("num"));
		System.out.println(map.get("subject"));
		System.out.println(map.get("content"));
		System.out.println(map.get("readcount"));
	}
	
	public void mapPrn2(List<Map<String, Object>> list) {
		System.out.println("MapTest mapPrn2()");
		for(Map<String, Object> map : list) {
			System.out.println(map.get("id"));
			System.out.println(map.get("name"));
			System.out.println(map.get("num"));
			System.out.println(map.get("subject"));
			System.out.println(map.get("content"));
			System.out.println(map.get("readcount"));
			System.out.println("---------------------");
		}
		
		for(Map<String, Object> map : list) {
			Set<String> keySet = map.keySet();
			Iterator<String> keyIterator = keySet.iterator();
			
			while(keyIterator.hasNext()) {
				String key = keyIterator.next();
				System.out.println(key + ":" + map.get(key));
			}
				System.out.println("---------------------");
		}
		
	}

}
