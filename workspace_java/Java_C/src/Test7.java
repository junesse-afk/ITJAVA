import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {
		
		String[] arr = {"asd", "zxc", "qwe"};
		System.out.println(arr);
		
		String msg = Arrays.toString(arr);
		System.out.println(msg);
		
		System.out.println(Arrays.toString(arr));
//		System.out.println("[asd, zxc, qwe]");
		
	}
	
}

class Person {
	// <%! %>
	String str1 = "멤버변수입니다.";
	String str2 = "asdasd";
	
	
	public void method1() {
		System.out.println(str4);
	}
	
	String str4 = "asdasd";
	
}
