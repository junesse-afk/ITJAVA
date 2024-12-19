package test;

public class Account {
	
//	멤버변수
	String accountNo ;
	String ownerName ;
	int balance;
//	생성자
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
//	메서드()
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount + ", 현재잔고 :" + balance + "원");
	}
	
	public int withdraw(int amount) {
		if(balance >= amount) {
			System.out.println("현재잔고 :" + balance + "원," + "출금금액 : " + amount + "원" );
			balance -= amount;
			System.out.println(amount + "원이 출금 되었습니다.(현재잔고 : " + balance + "원)");
			return amount;
		}else {
			System.out.println("현재잔고 :" + balance + "원," + "출금금액 : " + amount + "원" );
			System.out.println("잔고가 부족하여 출금 할수 없습니다.");
			return 0;
		}
	}
	
}
