package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test3 {

	public static void main(String[] args) {
//		import java.io.FileInputStream;
//		p521 바이트 단위 입력
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream("input.txt");
			System.out.println((char)fileInputStream.read());
			System.out.println((char)fileInputStream.read());
			System.out.println((char)fileInputStream.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		바이트 단위 출력 => 프로젝트 안에 output.txt 생성
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = 
					new FileOutputStream("output.txt");
			fileOutputStream.write(68);
			fileOutputStream.write(69);
			fileOutputStream.write(70);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
