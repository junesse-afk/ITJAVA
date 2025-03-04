package test;

public class Test9 {

	public static void main(String[] args) {
//		Object클래스 hashCode()
//		hash 해시 : 정보를 저장, 검색 사용하는 자료구조
//		         : 정보를 저장, 정보를 가져올때 사용
//		hash() 함수 : 정보가 저장된 위치를 반환
//		해시코드 값( 메모리 위치 값, 기억장소 주소 값)
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Student student1 = new Student("홍길동", 1);
		Student student2 = new Student("홍길동", 1);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student1);//test.Student@6b143ee9
		System.out.println(student2);//test.Student@1936f0f5
		System.out.println(student1.getClass().getName());//test.Student
		// hashCode() 16진수 변경 
		System.out.println(Integer.toHexString(student1.hashCode()));//6b143ee9
		System.out.println(Integer.toHexString(student2.hashCode()));//1936f0f5
		
//		clone() 복제
		try {
//			public class Student implements Cloneable 선언
			
			Student copystudent = (Student)student1.clone();
			
			System.out.println(student1);
			System.out.println(copystudent);
			
			System.out.println(Integer.toHexString(student1.hashCode()));//6b143ee9
			System.out.println(Integer.toHexString(copystudent.hashCode()));//737996a0
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		

	}

}
