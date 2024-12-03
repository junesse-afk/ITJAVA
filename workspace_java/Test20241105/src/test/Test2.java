package test;

public class Test2 {

	public static void main(String[] args) {
//		조건문 switch ~ case 문
//		1) if 유사, if(조건) => switch 구문에 조건 포함
//		2) if 달리 조건식 정수값, 문자열 결과값 비교

//		순위 1 이면 "java"
//		순위 2 이면 "C"
//		순위 3 이면 "html"
//		나머지 "순위없음"
		int rank = 5;
		if (rank == 1) {
			System.out.println("java");
		} else if (rank == 2) {
			System.out.println("C");
		} else if (rank == 3) {
			System.out.println("html");
		} else {
			System.out.println("순위없음");
		}

//		switch(변수 또는 계산식) {
//			case 값 : 실행문; break;
//			case 값 : 실행문; break;
//			case 값 : 실행문; break;
//			default: 실행문;
//		}

		switch (rank) {
//			조건 rank == 1  생략
		case 1:
			System.out.println("java");
			break;
//			조건 rank == 2  생략
		case 2:
			System.out.println("C");
			break;
//			조건 rank == 3  생략
		case 3:
			System.out.println("html");
			break;
		default:
			System.out.println("순위없음");
		}

//		1 "월요일", 2 "화요일", 3 "수요일", ... 7 "일요일"
//		"요일아님"
		int num = 5;
		switch (num) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
		default:
			System.out.println("요일아님");
		}

//		ch 'K' "KOREA" 출력, 'U' "USA" 출력, 'C' "CANADA"출력
//		default 생략가능
		char ch = 'C';
		switch (ch) {
		case 'K':
			System.out.println("KOREA");
			break;
		case 'U':
			System.out.println("USA");
			break;
		case 'C':
			System.out.println("CANADA");
			break;
		}

//		medal "Gold" "금메달" 출력, "Silver" "은메달" 출력
//		"Bronze" "동메달" 출력 , 나머지 "메달없음" 출력
		String medal = "Bronze";
		switch (medal) {
		case "Gold":
			System.out.println("금메달");
			break;
		case "Silver":
			System.out.println("은메달");
			break;
		case "Bronze":
			System.out.println("동메달");
			break;
		default:
			System.out.println("메달없음");
		}
		
//		ctrl shfit f => 정렬
		
		int jumsu = 100;
//		100, 99 ~ 90 'A'출력 , 89 ~ 80 'B' 출력, 79 ~ 70 'C' 출력
//		69 ~ 60 'D' 출력 나머지 'F' 출력
		switch(jumsu / 10) {
		case 10 : System.out.println('A'); break;
		case 9 : System.out.println('A'); break;
		case 8 : System.out.println('B'); break;
		case 7 : System.out.println('C'); break;
		case 6 : System.out.println('D'); break;
		default : System.out.println('F');
		}
		

	}

}
