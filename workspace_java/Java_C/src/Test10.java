
public class Test10 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "배추";
		dog.age = 2;
		dog.cry();
		
		Cat cat = new Cat();
		cat.cry();
	}
}

// 상위 개념 (추상화)
class Animal {
	String name;
	int age;
	
	public void cry() {
		System.out.println("울겟지??");
	}
}
class Dog extends Animal {

	@Override
	public void cry() {
		System.out.println("멍멍!!");
	}
	
}

class Cat extends Animal {

	@Override
	public void cry() {
		System.out.println("야옹!!");
	}
	
}









