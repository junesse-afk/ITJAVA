package test;

public class Cal {
//	Cal 클래스 
//	plus(int x, int y)메서드 리턴 두수 합을 리턴
//	plus(double x, double y)메서드 리턴 두수 합을 리턴
//	divide(int x, int y) 메서드 리턴 두수 나눈값을 리턴
//	divide(double x, double y) 메서드 리턴 두수 나눈값을 리턴
	public int plus(int x, int y) {
		return x + y;
	}
	public double plus(double x, double y) {
		return x + y;
	}
	
	public int divide(int x, int y) {
		return x / y;
	}
	public double divide(double x, double y) {
		return x / y;
	}
	
//	원의 면적 구하기
	public double areaCircle(double r){
		System.out.println("Cal 객체의 areaCircle() 실행");
		return 3.14 * r * r;
	}
	
}
