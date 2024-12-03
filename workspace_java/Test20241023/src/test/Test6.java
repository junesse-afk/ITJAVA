package test;

public class Test6 {

	public static void main(String[] args) {
//		4. 논리형 : 참(true)/거짓(false)
//		   => boolean(1byte)
//		남여, 여부, .... 
		
		boolean b = true;
		System.out.println(b);
		
		boolean c = false;
		System.out.println(c);
		
//		=====================
//		기억장소(변수) => 기억장소 크기 ,자료형 지정
//		=> 자바버전 10버전 부터 초기값으로 형을 지정 => 중간에 변경 되지 않음
		var num = 10;  //int
		// 컴파일러가 자료형 추측
		System.out.println(num);
//		num = "문자"; => 형틀림 , 에러발생
		
		var dNum = 10.0; //double
		System.out.println(dNum);
//		dNum = "문자";=> 형틀림 , 에러발생
		
		var str = "hello"; //String 
		System.out.println(str);
//		str = 3;=> 형틀림 , 에러발생
		
		var fNum = 3.4f;
		System.out.println(fNum);
//		fNum = "문자";=> 형틀림 , 에러발생
		

	}

}
