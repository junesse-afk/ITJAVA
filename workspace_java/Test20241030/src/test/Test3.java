package test;

public class Test3 {

	public static void main(String[] args) {
//		조건연산자(삼항연산자) 
//		항의 개수가 3개 필요
//		조건 ? true결과값1 : false결과값2
//		조건 : 관계연산자 논리연산자 관계연산자 => true/false
//		결과값1 : 조건의 결과 true이면 선택할 값
//		결과값2 : 조건의 결과 false이면 선택할 값
//		조건에 따라 둘 중에 하나의 결과를 선택
		
		int age = 15;
//		나이가 20보다 크거나 같으면 true, 아니면(20보다  작으면) false
		System.out.println(age >= 20);
		boolean b = age >= 20 ? true : false;
		System.out.println(age >= 20 ? true : false);
		System.out.println(b);
		
//		나이가 20보다 크거나 같으면 "성인", 아니면(20보다  작으면) "미성년"
		String s = age >= 20 ? "성인" : "미성년";
		System.out.println(s);
		
		int num = 5;
//		조건 : num이 0보다 크거나 같으면 => true => "양수"
//		    : 아니면(num이 0보다 작으면) => false => "음수"
		String s2 = num >= 0 ? "양수" : "음수";
		System.out.println(s2);
		
		int num2 = 105;
//		점수는 0 ~ 100 정수로 사용
//		조건 : num2 0보다 크거나 같으면   num2 100보다 작거나 같으면 
//		=> 두 개 모두 만족하면 => true => "0~100 입력 함"
//		    :아니면 () => false => "0 ~ 100 범위 넘어감"
		String s3 = num2 >= 0 && num2 <= 100 ? "0~100 입력 함" : "0 ~ 100 범위 넘어감";
		System.out.println(s3);
		
//		성별 구분 1,3 남 / 2,4 여
		int gender = 4;
		String s4 = gender == 1 || gender == 3 ? "남" : "여";
		System.out.println(s4);
		
//		연산자 우선순위
//		1. () 괄호 우선 순위 가장 높음
//		2. 단항, 이항(산술,관계,논리), 삼항 연산자 순
//		3. 대입연산자 우선순위 가장 낮음
		
//		우선순위가 동일하면 왼쪽 -> 오른쪽 계산됨
//		1. () 괄호, [] 배열, .참조연산자
//		2. 단항연산자 +, -, ++, --, ! 왼쪽 <- 오른쪽
//		3. 산술 %, /, *
//		4. 산술 +, -
//		5. 비트 <<, >>
//		6. 관계 <, <=, >, >=
//		7. 관계 ==, !=
//		8. 비트곱 &
//		9. 비트차 ^
//		10. 비트합 |
//		11. 논리곱 &&
//		12. 논리합 ||
//		13. 조건(삼항)연산자 조건 ? 참 : 거짓
//		14. 대입  왼쪽 <- 오른쪽
		
	}

}
