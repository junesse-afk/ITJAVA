package test;
//1번
class Connection{
	private static Connection _inst = null;
	private int count = 0;
	static Connection get() {
		if(_inst == null) {
			_inst = new Connection();
			return _inst;
		}
		return _inst;
	}
	public void count() {
		count++;
	}
	public int getCount() {
		return count;
	}
}

//10번
class Parent10{
	int x, y;
	public Parent10(int x, int y) {
		System.out.println("1");
		this.x = x;
		this.y = y;
	}
	public int getT() {
		System.out.println("2");
		return x * y;
	}
}
class Child10 extends Parent10{
	int x;
	public Child10(int x) {
		super(x + 1, x);
		System.out.println("3");
		this.x = x;
	}
	public int getT(int n) {
		System.out.println("4");
		return super.getT() + n;
	}
}

// 11번
class BankAcc{
	int accNum;
	double bal;
	public BankAcc(int x, double y) {
		this.accNum = x;
		this.bal = y;
	}
}

//16번
class classOne{
	int a, b;
	public classOne(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void print() {
		System.out.println(a + b);
	}
}
//16번
class classTwo extends classOne{
	int po = 3;
	public classTwo(int i) {
		super(i, i + 1);
	}
	public void print() {
		// 부모의 메서드 호출 //결과 21
		super.print();
		System.out.println(po * po);
	}
}

public class Test5 {

	public static void main(String[] args) {
//		2024년 1회 정보처리기사 실기 기출
		//1번
		Connection conn1 = Connection.get();
		conn1.count();
		
		Connection conn2 = Connection.get();
		conn2.count();
			
		Connection conn3 = Connection.get();
		conn3.count();
		
		conn1.count();
		System.out.println(conn1.getCount());
//		결과 4
		
		//2번
		int v1 = 0, v2 =35, v3 = 29;
		//c언어  0 false , 0이 아닌수 true 
		if((v1 > v2 ? v2 : v1) != 0) {
			v2 = v2 << 2;
		}else {
			v3 = v3 << 2;
		}
		System.out.println("v2 =" + v2 );//35
		System.out.println("v3 =" + v3 );//29 * 2의2승 => 116
		System.out.println(v2 + v3);
		// 151
		
//		4번
		char[] str = "ABCDEFGH".toCharArray();
		
		reverse(str);
		
		for(int i = 1; i < str.length; i += 2) {
			System.out.print(str[i]);
		}
		System.out.println();
		// 결과 GECA
		
//		10번
		System.out.println("5");
		System.out.println("6");
		Parent10 parent10 = new Child10(3);
		System.out.println("7");
		System.out.println(parent10.getT());
//결과 12
//		순서 5 -> 6 -> 3 -> 1 -> 7 -> 2
		
		// 11번
		BankAcc myAcc = new BankAcc(9981, 2200.0);
		double amount = 100.0;
		xxx(myAcc, amount);
		yyy(myAcc);
		System.out.println(myAcc.accNum + "," + myAcc.bal);
		
		//결과  9981,2795.10
		
		//12 번
		String s[] = {"Seoul","Kyeonggi","Incheon","Daejun","Daegu","Pusan"};
		String str12 = "S";
		for(String i : s) {
			str12 = str12 + i.substring(1, 2);
		}
		System.out.println(str12);
		// 결과 Seynaau
		
		//16 번
		classOne one = new classTwo(10);
		one.print();
		// 결과 9
		
		// 19번 c언어  isupper() 대문자 1, true
		//            islower() 소문자 1, true
		//            isdigit() 숫자 1, true
//		(73 - 65 + 5) % 25 + 65 => 13 + 65 => 78 => N
//		I J K L M N
		String p = "It is 8";
		char result[] = new char[100];
		for(int i = 0; i < p.length(); i++) {
			char currentChar = p.charAt(i);
			if(Character.isUpperCase(currentChar)) {
				result[i] = (char)((currentChar - 'A' + 5) % 26 + 'A');
			}else if(Character.isLowerCase(currentChar)) {
				result[i] = (char)((currentChar - 'a' + 10) % 26 + 'a');
			}else if(Character.isDigit(currentChar)) {
				result[i] = (char)((currentChar - '0' + 3) % 10 + '0');
			}else {
				result[i] = currentChar;
			}
		}
		System.out.println(result);
		// 결과 Nd sc 1
		
		
	}
	//11번
	public static double sim_pow(double base, int year) {
		int i;
		double r = 1.0;
		for(i = 0; i < year; i++) {
			r = r * base;
		}
		return r;
	}
	public static void xxx(BankAcc acc, double en) {
		if(en > 0 && en < acc.bal) {
			acc.bal = acc.bal - en;
		}
	}
	public static void yyy(BankAcc acc) {
			acc.bal = acc.bal * sim_pow((1 + 0.1), 3);
	}
	
	
	//4번 reverse()메서드
	public static void reverse(char[] str) {
		int len = str.length;
		char temp;
		int p1 = 0;
		int p2 = len - 1;
		while(p1 < p2) {
			temp = str[p1];
			str[p1] = str[p2];
			str[p2] = temp;
			p1++;
			p2--;
		}
	}
	

	

}
