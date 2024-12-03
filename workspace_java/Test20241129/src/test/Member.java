package test;

public class Member {
//	Member 클래스 정의
//	멤버변수 private id,pass,name
//	메서드 setter getter
	private String id;
	private String pass;
	private String name;
	
	public String getId() {
		return id;
	}
	public String getPass() {
		return pass;
	}
	public String getName() {
		return name;
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
	
}
