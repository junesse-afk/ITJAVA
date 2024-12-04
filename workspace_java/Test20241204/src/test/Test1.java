package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
//		자바에서 제공하는 예외클래스
//		Throwable -> Error (java.lang.Error) 에러
//		          -> Exception (java.lang.Exception) 예외
//		Exception -> IOException -> FileNotFoundException
//		          -> RuntimeException -> ArithmeticException
//		                           IndexOutofBoundsException
		
		int arr[] = new int[5];
		try {
			//예외가 발생할 가능성이 높은 명령
			for(int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// 예외 발생 했을때 잡아서 처리  IOException 파일 
			System.out.println("예외처리");
//			java.lang.ArrayIndexOutOfBoundsException: 
//				Index 5 out of bounds for length 5
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 예외 발생 상관없이 마무리 작업하는 명령
			System.out.println("마무리 작업");
		}
		
		System.out.println("시작");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("try이 안");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
//			java.io.FileNotFoundException: 
//				a.txt (지정된 파일을 찾을 수 없습니다)
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			finally 생략가능
			System.out.println("마무리 작업2");
//			기억장소 해제
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		

	}

}
