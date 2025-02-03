package test;

public class Test1 {
	public static void main(String[] args) {
//		2022년 3회 정보처리기사 실기 기출
		//1번 2차원배열
		int [][]field = {
				{0,1,0,1},
				{0,0,0,1},
				{1,1,1,0},
				{0,1,1,1},
		};
		int [][]mines = {
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
		};
		
		int w = 4;
		int h = 4;
		for(int y = 0; y < h; y++) { //행
			for(int x = 0; x < w; x++) { //열
				if(field[y][x] == 0) continue;
				for(int i = y - 1; i <= y + 1; i++) {
					for(int j = x - 1; j <= x + 1; j++) {
						if(calculate(w, h, j, i) == 1) {
							mines[i][j] += 1;
						}
					}
				}
			}
		}
		//출력
		for(int y = 0; y < h; y++ ) {
			for(int x = 0; x < w; x++) {
				System.out.printf("%d", mines[y][x]);
			}
			System.out.println();
		}
		//결과
//		1132
//		3453
//		3564
//		3553
		
		//4번
		int [] result = new int[5];
		int [] arr = {77, 32, 10, 99, 50};
		
		for(int i = 0; i < 5; i++) {
			result[i] = 1;
			for(int j = 0; j < 5; j++) {
				if(arr[i]  < arr[j]) result[i]++;
			}
		}
		
		for(int k = 0; k < 5; k++) {
			System.out.print(result[k]);
		}
		
		// 출력 24513

	}
	public static int calculate(int w,int h,int j,int i) {
		if(i >= 0 && i < h && j >= 0 && j < w) return 1;
		return 0;
	}
}
