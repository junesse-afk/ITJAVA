package test;

public class Test5 {

	public static void main(String[] args) {
//		int 형  num 배열변수 선언
//		원하는 초기값 1,2,3,4,5,6,7,8,9,10 
//		for 출력
//		int num[] = new int[10]; 
//		num[0] = 1;
//		int num[] = {1,2,3,4,5,6,7,8,9,10}; 
		int num[] = new int[]{1,2,3,4,5,6,7,8,9,10}; 
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
//		향상된 for문 배열
//		for( 변수 선언 : 배열 ) {
//			실행문;
//		}
		
		System.out.println("-----------------");
		for(int n : num) {
			System.out.println(n);
		}
		
		System.out.println("-----------------");
//		double 형 data 배열변수 5개 기억장소 선언 
//		변수 0번째 10.0 1번째 20.0 2번째 30.0 저장
//		for 출력
		double data[] = new double[5];
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println("-----------------");
		
//		향상된 for문 배열
		for( double d : data) {
			System.out.println(d);
		}
		
		System.out.println("-----------------");
//		char 형 ch 배열변수 5개 기억장소 선언
//		초기값 'A' 'B' 'C' 'D' 'E'
//		for 출력
		char[] ch = new char[] {'A' ,'B' ,'C', 'D' ,'E'};
		for(int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("-----------------");
//		향상된 for문 배열
		for(char c : ch) {
			System.out.println(c);
		}
		System.out.println("-----------------");
//		String 형 str 배열변수 3개 기억장소 선언
//		초기값 "java" "html" "db"
		String str[] = {"java" ,"html", "db"};
//		for 출력
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("-----------------");
//		향상된 for문 배열
		for(String s : str) {
			System.out.println(s);
		}
	}

}
