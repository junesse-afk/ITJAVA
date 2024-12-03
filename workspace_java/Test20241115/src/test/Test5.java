package test;

public class Test5 {

	public static void main(String[] args) {
		
//		sum(여러명의 점수를 전달받아서 저장하는 배열 변수) 함수 정의
//		for 배열 변수 안에 저장된 점수의 합 구하기 
//		점수의 합 리턴값 (리턴할형 정수형 )
		
//		배열변수 선언 = 5개 점수 초기값 저장
//		sum(배열변수 전달) 함수 호출 => 리턴받은 배열 점수의 합 출력
//		int jum[] = new int[5];
//		int jum[] = {80, 90, 100, 85, 95};
		int jum[] = new int[]{80, 90, 100, 85, 95};
		System.out.println("배열값이 저장된 주소 : " + jum);
		System.out.println("점수의 합 : " + sum(jum));
		
//		sum2(여러명의 몸무게를 전달받아서 저장하는 float 배열 변수) 함수 정의
//		for 배열 변수 안에 저장된 몸무게의 평균 구하기 
//		몸무게의 평균 리턴값 (리턴할형 float형 )
		
//		배열변수 선언 = 7개 몸무게float 초기값 저장
//		sum2(배열변수 전달) 함수 호출 => 리턴받은 배열 몸무게 평균 출력
		float jum2[] = {57.5f,70.5f,80.3f,77.4f,60.5f,55.2f,88.7f};
		System.out.println("배열값이 저장된 주소 : " + jum2);
		System.out.println("몸무게 평균 : " + sum2(jum2));
	}
	
	public static float sum2(float arr[]) {
		System.out.println("몸무게의 개수 : " + arr.length);
		float s = 0f;
		for(int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		return s/arr.length;
	}
	
	
	public static int sum(int arr[]) {
		System.out.println("과목의 개수 : " + arr.length);
//		for 배열 변수 안에 저장된 점수의 합 구하기 
		int s = 0;
//		for(int i = 0; i < arr.length; i++) {
//			s += arr[i];
//		}
		for(int j : arr) {
			s += j;
		}
		return s;
	}

}
