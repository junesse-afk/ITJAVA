package collection;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList();
		list.add("abc");
		list.add("def");
		
		for (String str : list) {
			System.out.println(str);
		}
		
		
		
		ArrayList<StudentDTO> stdList = new ArrayList();
		StudentDTO s1 = new StudentDTO(1, "홍길동");
		StudentDTO s2 = new StudentDTO(2, "이순신");
		StudentDTO s3 = new StudentDTO(3, "강감찬");
		
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		
		for (StudentDTO s : stdList) {
			System.out.println(s.idx);
			System.out.println(s.name);
			
		}
		
		
		
//		StudentDTO s4 = new StudentDTO(rs.getInt("IDX"), rs.getString("NAME"));
	}
}

class StudentDTO {
	int idx;
	String name;
	public StudentDTO(int idx, String name) {
		this.idx = idx;
		this.name = name;
	}
}




