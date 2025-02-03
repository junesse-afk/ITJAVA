package test;

public class Test1 {

	public static void main(String[] args) {
//		2021년 3회 정보처리기사 실기 기출
		//1번 => 싱글톤 패턴 객체생성
		Connection conn1 = Connection.get();
		conn1.count();
		Connection conn2 = Connection.get();
		conn2.count();
		Connection conn3 = Connection.get();
		conn3.count();
		
		System.out.println(conn1.getCount());
		// 결과값 3
		System.out.println();
		System.out.println("----------------");
		// 11번 => 연산자 우선순위, ^ XOR, 연산자
		int a = 3, b = 4, c = 3, d = 5;
//		System.out.println(a == 2);// false
//		System.out.println(a == c);// true
		System.out.println(a == 2 | a == c); // true
		System.out.println(!(c > d));// true
//		System.out.println(1 == b);//false
//		System.out.println(c != d);// true
//		^ XOR 같은 값이면 0, 다른값이면 1 => true
		System.out.println(1 == b ^ c != d);//true
		System.out.println((a == 2 | a == c) & !(c > d) & (1 == b ^ c != d));//true
		if((a == 2 | a == c) & !(c > d) & (1 == b ^ c != d)) {
			a = b + c;
			if(7 == b ^ c != a) {
				System.out.println(a);
			}else {
				System.out.println(b);
			}
		}else {
			a = c + d;
			if(7 == c ^ d != a) {
				System.out.println(a);
			}else {
				System.out.println(d);
			}
		}
		//결과 7
		System.out.println();
		System.out.println("----------------");
		//12번 
		int arr[] = new int[3];
		a = 12; b = 24; c = 36;
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		System.out.printf("%d\n", arr[1] + arr[0] + 1);
		//결과 37
		System.out.println();
		System.out.println("----------------");
		//14번
		a = 100;
		b = 200;
		System.out.println(a == b);
		// 결과 false => 파이썬 False
		System.out.println();
		System.out.println("----------------");
		//17 번
		jsu [] st = {
				new jsu("데이터1", 95, 88),
				new jsu("데이터2", 84, 91),
				new jsu("데이터3", 86, 75)
		};
		st[1].hab = st[1].os + st[2].db; //84 + 75 = 159
		st[1].hhab = st[1].hab + st[0].os + st[0].db;//159 + 95 + 88 = 342 
		
		System.out.printf("%d\n",st[1].hab); //159
		System.out.printf("%d\n",st[1].hhab);//342
		System.out.printf("%d\n",st[1].hab + st[1].hhab);//501
//		결과값 501
		
	}

}
//17번 클래스
class jsu{
	String name;
	int os;
	int db;
	int hab;
	int hhab;
	public jsu(String name, int os, int db) {
		this.name = name;
		this.os = os;
		this.db = db;
	}
}


//1번클래스
class Connection{
	private static Connection _inst = null;
	private int count = 0;
	static public Connection get() {
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
