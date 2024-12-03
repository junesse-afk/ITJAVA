package test;

public class Test4 {

	public static void main(String[] args) {
//		초기값;
//		while(조건) {
//			실행문;
//			증가값;
//		}
		
//		do ~ while(조건) => 무조건 실행문 한 번은 동작
		
//		초기값;
//		do{
//			실행문;
//			증가값;
//		} while(조건);
		
		int i = 12;
		while(i <= 10) {
			System.out.println("실행문");
			i--;
		}
		System.out.println("반복문 끝남");
		
		i = 12;
		do{
			System.out.println("실행문2");
			i--;
		} while(i <= 10);
		System.out.println("반복문 끝남2");		
		
//		do ~ while 이용 1 ~ 10 카운트 => 출력
//		1 ~ 10 합을 구해서 => 마지막 출력
		int s = 0;
		i = 1;
		do{
			System.out.println(i);
			s += i;
			i++;
		} while(i <= 10); 
		System.out.println("1 ~ 10 합 " + s);

	}

}
