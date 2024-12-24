package test;

import java.io.FileReader;
import java.io.FileWriter;

public class Test4 {

	public static void main(String[] args) {
//		=> 문자 단위  스트림 입력 Reader, FileReader, read()
		try {
			FileReader fileReader 
			= new FileReader("reader.txt");
			int i;
			while((i = fileReader.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		=> 문자 단위  스트림 출력 Writer, FileWriter, write()
		try {
			FileWriter fileWriter = new FileWriter("writer.txt");
			fileWriter.write('A');
			char buf[] = {'B', 'C', 'D', 'E'};
			fileWriter.write(buf);
			fileWriter.write("안녕하세요");
			fileWriter.write("65");
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
