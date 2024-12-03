package test;

public class Test3 {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.setId("kim");
		member.setPass("123");
		member.setName("김길동");
		member.setAge(10);
		
		System.out.println(member.getId());
		System.out.println(member.getPass());
		System.out.println(member.getName());
		System.out.println(member.getAge());
		

	}

}
