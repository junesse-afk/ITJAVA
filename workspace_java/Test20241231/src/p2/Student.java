package p2;

import p1.Person;

public class Student extends Person{
	//패키지 p2  Student 클래스 정의 Person 클래스 상속 
//	멤버변수 privateVar2, packageVar2, 
//	protectedVar2, publicVar2
	private String privateVar2;
    String packageVar2;
    protected String protectedVar2;
    public String publicVar2;
    
//	메서드 studentPrn()
	public void studentPrn() {
//		System.out.println("privateVar = " + privateVar);//같은 클래스
//		System.out.println("packageVar = " + packageVar);//같은 폴더
		System.out.println("protectedVar = " + protectedVar);//다른폴더 상속관계
		System.out.println("publicVar = " + publicVar);//모든
		
		System.out.println("privateVar2 = " + privateVar2);//같은 클래스
		System.out.println("packageVar2 = " + packageVar2);//같은 클래스
		System.out.println("protectedVar2 = " + protectedVar2);//같은 클래스
		System.out.println("publicVar2 = " + publicVar2);//같은 클래스
	}   
}
