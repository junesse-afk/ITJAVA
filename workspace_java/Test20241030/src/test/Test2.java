package test;

public class Test2 {

	public static void main(String[] args) {
//		부호연산자(단항연산자)
//		+ 양수, - 음수 => +3, -3
		int num = 10;
		System.out.println(+num);//10
		System.out.println(-num);//-10
		System.out.println(num);//10
		num = -num;
		System.out.println(num);//-10
		
//		-----------------------------
//		++ 1 증가, -- 1 감소 연산자(단항연산자)
//		앞, 뒤에 사용하여 값을 1만큼 증가, 1만큼 감소 연산자
//		결과는 1증가, 1감소 => 앞 : 작업순서 맨처음, 뒤 : 작업순서 맨뒤 수행
		int a = 10;
//		1증가 ++ => a = a + 1 , a += 1, ++
		System.out.println(++a); //11 => 1증가 후 출력
//		=> 1. 1증가 , 2. 출력
		System.out.println(a);//11
		System.out.println(a++);//11 먼저 출력 뒤에 1증가  12
//		=> 1. 출력 , 2. 1증가
		System.out.println(a);//12
		a = a + 1;
		System.out.println(a);//13
		a += 1;
		System.out.println(a);//14
		a++;
		System.out.println(a);//15
		
//		1감소
		int b = 10;
		b = b - 1;
		System.out.println(b);
		b -= 1;
		System.out.println(b);
		b--;
		System.out.println(b);
//		1. b변수 내용 출력, 2. b변수 1감소
		System.out.println(b--);
//		1. b변수 1감소, 2. b변수 내용 출력
		System.out.println(--b);
		
		
	}

}
