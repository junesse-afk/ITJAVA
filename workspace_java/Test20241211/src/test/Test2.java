package test;

public class Test2 {

	public static void main(String[] args) {
//		String => 문자열 변경, 연결 => 기억장소에 새롭게 할당
//		=> 문자열 변경 작업이 많아지면 기억장소(메모리) 낭비
		
//		StringBuffer, StringBuilder
//		=> 문제점을 해결 final 없음 => 값 변경 바로 적용
		String javaStr = new String("java");
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));
		System.out.println("--------------------------");
		
		StringBuffer buffer = new StringBuffer(javaStr);
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer);
		buffer.append(" and");
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer);
		buffer.append(" Programming");
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer);//java and Programming
		
//		중간 삽입 insert
		buffer.insert(9, "jsp ");
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer);//java and jsp Programming
		
//		중간 삭제 delete
		buffer.delete(9, 13);
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer);//java and Programming
		
		System.out.println("--------------------------");
//		Stringbuffer => String
		javaStr = buffer.toString();
		System.out.println(System.identityHashCode(javaStr));
		System.out.println(javaStr);
		
	}

}
