package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		System.out.println();
		System.out.println("-------------------");
		//9번 
		List<Integer> TestList = Arrays.asList(1,2,3,4,5);
		
		List<Integer> resultList = new ArrayList<Integer>();
		
		TestList.forEach(num -> resultList.add(num + 100) );
		
		System.out.println(resultList);
		// [101, 102, 103, 104, 105]
		
		//13번 완전수  6 = 1 + 2 + 3 
//		            28 =  1 + 2 + 4 + 7 + 14
		int n;
		int k;
		int s;
		int el = 0;
		for(n = 6; n <= 30; n++) {
			s = 0;
			k = n / 2;
			for(int j = 1; j <= k; j++) {
				// 약수
				if(n % j == 0) {
					s = s + j;
				}
			}
//			완전수 => 원수 == 약수합 일치
			if(s == n) {
				System.out.println("n = " + n);
				System.out.println("s = " + s);
				el++;
			}
		}
		System.out.println(el);
//		결과 2
		
		//19번
		int[] intArr;
		intArr = MakeArray();
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
		}
		//결과 0123
		
		System.out.println();
		System.out.println("-------------------");
		//20번
		int a = 0;
		for(int i = 1; i < 999; i++) {
			if(i % 3 == 0 && i % 2 != 0) {
				a = i;
			}
		}
		System.out.println(a);
		// 결과 993
		
		
	}
	//19번
	public static int[] MakeArray() {
		int[] tempArr = new int[4];
		for(int i = 0; i < tempArr.length; i++) {
			tempArr[i] = i;
		}
		return tempArr;
	}
	
	
	//1번
	public static int calculate(int w,int h,int j,int i) {
		if(i >= 0 && i < h && j >= 0 && j < w) return 1;
		return 0;
	}
}
