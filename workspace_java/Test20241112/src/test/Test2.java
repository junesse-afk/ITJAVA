package test;

public class Test2 {

	public static void main(String[] args) {
//		p219 다차원 배열 => 2차원 배열(행,열 구성/평면)
		
//		정수형 배열 kor 크기 3, 점수 초기화 100, 80, 95
		int kor[] = new int[3];
		kor[0] = 100;
		kor[1] = 80;
		kor[2] = 95;
		
//		정수형 배열 math 크기 3, 점수 초기화 75, 70, 65
		int math[] = new int[3];
		math[0] = 75;
		math[1] = 70;
		math[2] = 65;
		
//		2차원 배열 [행][열]
		int arr[][] = new int[2][3];
		arr[0][0] = 100;
		arr[0][1] = 80;
		arr[0][2] = 95;	
		
		arr[1][0] = 75;
		arr[1][1] = 70;
		arr[1][2] = 65;
		
		int[][] arr2 = { {100,85,95} ,
				          {75,70,65} };
		
		System.out.println("과목개수(행) : " + arr.length);
		System.out.println("과목개수(행) : " + arr2.length);
		
		System.out.println("과목별 점수개수(열) : " + arr[0].length);
		System.out.println("과목별 점수개수(열) : " + arr2[0].length);
		
		for(int j = 0; j < arr.length; j++) {
			for(int i = 0; i <  arr[0].length; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		
//		java과목 85 88 82 89 87
//		web과목 95 92 96 99 91
//		db과목 77 75 73 72 79
//		2차원 배열 3행 5열
		int[][] arr3 = new int[3][5] ;
		arr3[0][0] = 85;
		arr3[0][1] = 88;
		arr3[0][2] = 82;
		arr3[0][3] = 89;
		arr3[0][4] = 87;
		
		arr3[1][0] = 95;
		arr3[1][1] = 92;
		arr3[1][2] = 96;
		arr3[1][3] = 99;
		arr3[1][4] = 91;
		
		arr3[2][0] = 77;
		arr3[2][1] = 75;
		arr3[2][2] = 73;
		arr3[2][3] = 72;
		arr3[2][4] = 79;
		
		int[][] arr4 = new int[][] {
			{85,88,82,89,87},
			{95,92,96,99,91},
			{77,75,73,72,79}
								};
		
//		과목개수 : 출력
//		과목별 점수개수 : 출력
        System.out.println("과목개수 : " + arr4.length);
        System.out.println("과목별 점수개수 : " + arr4[0].length);	
		
//		점수출력
//      java과목 85 88 82 89 87  총합 평균
//		web과목 95 92 96 99 91
//		db과목 77 75 73 72 79	
        
		for(int r = 0; r < arr4.length; r++) {
			if(r == 0) {System.out.print("java과목 : ");}
			if(r == 1) {System.out.print("web과목 : ");}
			if(r == 2) {System.out.print("db과목 : ");}
//			과목별 합을 구하는 변수
			int s = 0;
			for(int c = 0; c < arr4[0].length; c++) {
				System.out.print(arr4[r][c] + " ");
				s += arr4[r][c];
			}
			System.out.print("총합 : " + s);
			System.out.print("평균 : " + s / (float)arr4[0].length);
			System.out.println();
		}
		
//		p221 알파벳 소문자 2글자씩 출력 => 2차원 배열 (13행 2열)
//		a b
//		c d
//		..
//		y z
		char alpha[][] = new char[13][2] ;
		char ch = 'a';
		for(int r = 0; r < alpha.length; r++) {
			for(int c = 0; c < alpha[0].length; c++) {
				alpha[r][c] = ch;
				ch++;
			}
		}
		
		for(int r = 0; r < alpha.length; r++) {
			for(int c = 0; c < alpha[0].length; c++) {
				System.out.print(alpha[r][c] + " ");
			}
			System.out.println();
		}
		
		

		
	}

}
