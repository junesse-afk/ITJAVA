package test;

public class Student {
	
	public int num;
	public String name;
	public int java;
	public int db;
	public int jsp;
	public int html;
	
//	기본생성자
	public Student() {
		
	}
	
//	초기값을 받는 생성자 => 멤버변수 저장
	public Student(int num, String name, int java, int db, int jsp, int html) {
//		멤버변수 = 전달 받은 지역변수(매개변수)
		this.num = num;
		this.name = name;
		this.java = java;
		this.db = db;
		this.jsp = jsp;
		this.html = html;
	}
	
	
	public int sum() {
		return java + db + jsp + html;
	}
	
	public void intro() {
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);
	}
	
}
