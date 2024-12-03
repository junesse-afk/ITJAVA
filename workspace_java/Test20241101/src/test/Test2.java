package test;

public class Test2 {

	public static void main(String[] args) {
//		if else if else 다중 if (else if) 구문
		int num = 5;
//		num 0 보다 작으면 "음수", 아니면 num 0 보다 크면 "양수", 
//		                                      나머지 "영"
		if(num < 0) {
			System.out.println("음수");
		}else if(num > 0){
			System.out.println("양수");
		}else {
			System.out.println("영");
		}
		
//		놀이공원 입장료 계산
//		취학 전 아동 (8세 미만)  1000원
//		초등학생(14세 미만)  2000원
//		중고등학생(20세 미만) 2500원
//		그 이상은 3000원
//		60세 이상인 경우 경로우대 입장료 0원
		int age = 50;
		if(age < 8) {
			System.out.println("취학 전 아동 (8세 미만)  1000원");
		}else if(age < 14){
//		 else age >= 8 && age < 14
			System.out.println("초등학생(14세 미만)  2000원");
		}else if(age < 20){
			System.out.println("중고등학생(20세 미만) 2500원");
		}else if(age < 60){
			System.out.println("성인 3000원");
		}else {
			System.out.println("60세 이상인 경우 경로우대 입장료 0원");
		}
		
//		p100 정수형 변수 score 선언 초기값 점수 저장 (0 ~ 100)
//		=> 학점 100 ~ 90 A, 89~80 B, 79~70 C, 69~60 D, 나머지 F 출력
		int score = 75;
		char grade = 'F';
		if(score <= 100 && score >= 90) {
			grade = 'A';
		}else if(score >= 80){
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println(grade);
		
		
	}//main시작메서드

}//class
