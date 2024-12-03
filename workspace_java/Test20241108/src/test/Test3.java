package test;

public class Test3 {

	public static void main(String[] args) {
//		***** 1행 1열 ~ 5열
//		***** 2행 1열 ~ 5열
//		***** 3행 1열 ~ 5열
//		***** 4행 1열 ~ 5열
//		***** 5행 1열 ~ 5열
		for(int j = 1; j <= 5; j++) {
			for(int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*     1행 1열 ~ 1열
//		**    2행 1열 ~ 2열
//		***   3행 1열 ~ 3열
//		****  4행 1열 ~ 4열
//		***** 5행 1열 ~ 5열
		
		for(int j = 1; j <= 5; j++) {
			System.out.print("j = " + j);
			for(int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		    *     1행 공백 1열 ~ 4열(5-1) *     5열(1개)
//		   **     2행 공백 1열 ~ 3열(5-2) * 4 ~ 5열(2개)
//		  ***     3행 공백 1열 ~ 2열(5-3) * 3 ~ 5열(3개)
//		 ****     4행 공백 1열 ~ 1열(5-4) * 2 ~ 5열(4개)
//		*****     5행                   * 1 ~ 5열(5개)
		for(int j = 1; j <= 5; j++) {
//			공백
			for(int i = 1; i <= 5 - j; i++) {
				System.out.print(" ");
			}
//			*
			for(int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//       *        1행 공백 1열 ~ 4열 * 1개
//      ***       2행 공백 1열 ~ 3열 * 3개
//     *****      3행 공백 1열 ~ 2열 * 5개
//    *******     4행 공백 1열 ~ 1열 * 7개
//   *********    5행              * 9개
		for(int j = 1; j <= 5; j++) {
//			공백
			for(int i = 1; i <= 5 - j; i++) {
				System.out.print(" ");
			}
//			*
			for(int i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
//		*****	1행(5) * 1열 5열
//		****	2행(4) * 1열 4열
//		***		3행(3) * 1열 3열
//		**		4행(2) * 1열 2열
//		*		5행(1) * 1열 1열
		for(int j = 1; j <= 5; j++) {
			// j= 1 , i = 5 4 3 2 1
			// j= 2 , i = 5 4 3 2 
			// j= 3 , i = 5 4 3 
			// j= 4 , i = 5 4 
			// j= 5 , i = 5 
			for(int i = 5; i >= j; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int j = 5; j >= 1; j--) {
			// j= 5 , i = 1 2 3 4 5
			// j= 4 , i = 1 2 3 4
			// j= 3 , i = 1 2 3 
			// j= 2 , i = 1 2 
			// j= 1 , i = 1 
			for(int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		***** 1행 공백 0 ~0열  * 1열 ~ 5열
//		 **** 2행 공백 1 ~1열  * 1열 ~ 4열 
//		  *** 3행 공백 1 ~2열  * 1열 ~ 3열 
//		   ** 4행 공백 1 ~3열  * 1열 ~ 2열 
//		    * 5행 공백 1 ~4열  * 1열 ~ 1열 
		for(int j = 1; j <= 5; j++ ) {
			for(int i = 1; i <= j - 1; i++) {
				System.out.print(" ");
			}
			for(int i = 5; i >= j; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//2*1=2	3*1=3	4*1=4	5*1=5 ..	9*1=9		
//.
//.
//2*9=18 3*9=27	4*9=36	5*9=45 ..	9*9=81		
	
for(int j = 1; j <= 9; j++) {
	for(int dan = 2; dan <= 9; dan++) {
		System.out.print(dan + "*" + j + "=" + dan * j + "\t");
	}
	System.out.println();
}
		
		
	}

}
