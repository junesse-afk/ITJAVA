package test;

public class Test1 {

	public static void main(String[] args) {
		//2021년 2회 정보처리기사 실기
		//7번 비트 연산
		int a = 100;
		int result = 0;
		for(int i = 1; i < 3; i++) {
			result = a >> i;
			System.out.println(result);
			result = result + 1;
			System.out.println(result);
		}
		System.out.println(result);
//		결과 26
		System.out.println();
		System.out.println("----------------");
		// 16번
		
		
	}

}
