package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
//		p423
//		Collection 인터페이스 (배열)
//		=> 추상메서드() size(), add(), clear(),...
//		- List 인터페이스 - 클래스 ArrayList, Vector, linkedList
//		=> 순차적으로 자료를 관리
//		- Set 인터페이스 - 클래스 HashSet, TreeSet
//		=> 집합 (순서없음, 중복 허용 안함)
		
//		HashSet 클래스
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("홍길동");
		hashSet.add("이길동");
		hashSet.add("홍길동");
		hashSet.add("삼길동");
		
		System.out.println(hashSet);//[홍길동, 삼길동, 이길동]
		
		for(String s : hashSet) {
			System.out.println(s);
		}
		
		Iterator<String> it = hashSet.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
//		TreeSet 클래스 : 중복 없는 데이터, 순서 없는 데이터
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("이길동");
		treeSet.add("홍길동");
		treeSet.add("삼길동");
		
		System.out.println(treeSet);
		
		for(String s : treeSet) {
			System.out.println(s);
		}
		
		Iterator<String> it2 = treeSet.iterator();
		while(it2.hasNext()) {
			String s = it2.next();
			System.out.println(s);
		}
		
	}

}
