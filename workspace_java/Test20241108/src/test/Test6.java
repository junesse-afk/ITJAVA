package test;

public class Test6 {

	public static void main(String[] args) {
//		int 형 jum 배열변수 선언
//		초기값 85,95,100,80,75
		int jum[] = {85,95,100,80,75};
		int s = 0;
//		배열변수 안에 있는 점수의 합 구해서 마지막 출력
		for(int i = 0; i < jum.length; i++) {
//			System.out.println(i);
			System.out.println(jum[i]);
			s += jum[i];
		}
		
		System.out.println("학생 점수의 합 : " + s);
		System.out.println("학생 점수의 평균 : " + s / (float)jum.length  );
		//향상된 for문
		s = 0;
		for(int j : jum) {
			System.out.println(j);
			s += j;
		}
		System.out.println("학생 점수의 합 : " + s);
		System.out.println("학생 점수의 평균 : " + s / (float)jum.length  );
	}

}
