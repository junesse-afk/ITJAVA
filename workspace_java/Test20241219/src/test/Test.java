package test;

public class Test {

	public static void main(String[] args) {
//		나이
		int age = 17;
//		입장료
		int pee = 50000;
		if(age < 5 || age >= 65) {
			pee *= 0.5; //50% 할인
		}else if(age >= 5 && age <= 19) {
			pee *= 0.7; // 30% 할인
		}else {
			pee = 50000;
		}
		System.out.println("나이가 " +  age + "세 이므로 입장료는 " +  pee + "원 입니다.");
		
		System.out.println("------------------------");
		
		char ch = '@';
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " : 대문자");
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " : 소문자");
		}else if(ch >= '=' && ch <= '9') {
			System.out.println(ch + " : 숫자");
		}else {
			System.out.println(ch + " : 기타 문자");
		}
		
		System.out.println("------------------------");
		
		Account account 
		= new Account("123-45-6789", "홍길동", 10000);
		
		account.deposit(5000);
		
		System.out.println("출금 후 금액 : " + account.withdraw(10000));
				
		System.out.println("출금 후 금액 : " + account.withdraw(7000));
		
	}

}
