package test;

import java.util.Date;

public class MemberDTO {
//	MemberDTO 클래스 정의
//	멤버변수 id,pass,name,int age,gender,email,
//	       Timestamp date
//	생성자 멤버변수 모든 값을 받는 생성자 
//	메서드 set get , toString()
	private String id;
	private String pass;
	private String name;
	private int age;
	private String gender;
	private String email;
	private Date date;
	
	public MemberDTO(String id, String pass, String name, int age, String gender, String email, Date date) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pass=" + pass + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", email=" + email + ", date=" + date + "]";
	}
	
	
	
}
