package test;

public class Member {
	
	private String id;
	private String pass;
	private String name;
	private int age;
	
	//getter setter 
	
	public String getId() {
		return id;
	}

	public String getPass() {
		return pass;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void prn() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pass);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
