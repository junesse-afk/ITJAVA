
public class Test9 {

	public static void main(String[] args) {
		User u = new User();
//		u.age = 50737473;
//		u.setAge(40);
//		System.out.println(u.getAge());
	}

}

class User {
	private String name;
	private int age;
	private boolean isVip;
	
	public boolean isVip() {
		return isVip;
	}
	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}
	
}
