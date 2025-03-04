package test;

public class Student implements Cloneable{
//	멤버변수 name, num
	String name;
	int num;
//	생성자 멤버변수 2개의 값을 받는 생성자
	public Student(String name, int num) {
		this.name = name;
		this.num = num;
	}
//	toString() 자동완성
//	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + "]";
	}
	
//	equals() 메서드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.num == student.num) {
				return true;
			}else {
				return false;
			}
		}
		return false;
//		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
