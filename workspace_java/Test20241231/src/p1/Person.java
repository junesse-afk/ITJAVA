package p1;

public class Person {
	//패키지 p1  Person 클래스 정의 
//	멤버변수 privateVar, packageVar, 
//	protectedVar, publicVar
//	메서드 personPrn() 출력
	private String privateVar;
		    String packageVar;
	protected String protectedVar;
	public String publicVar;
	
	public void personPrn() {
		System.out.println("privateVar = " + privateVar);//같은 클래스
		System.out.println("packageVar = " + packageVar);//같은 클래스
		System.out.println("protectedVar = " + protectedVar);//같은 클래스
		System.out.println("publicVar = " + publicVar);//같은 클래스
	}
	
}
