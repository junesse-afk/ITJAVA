
public class Test11 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(arr);
		
		Person2 p = new Person2("홍길동", 20);
		System.out.println(p);
		System.out.println(p.toString());
	}
}

class Person2 {
	String name;
	int age;
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}
}
