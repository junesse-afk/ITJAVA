package generic;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<String> list2 = new ArrayList<String>();
		
		Person<Integer> p = new Person<Integer>();
		Person<String> p2 = new Person<String>();
	}
}

class Person <T> {
	T name;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
}

