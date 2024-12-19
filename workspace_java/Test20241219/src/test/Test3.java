package test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {

	public static void main(String[] args) {
//		SQL Timestamp 타입 대응
		Timestamp a = new Timestamp(System.currentTimeMillis()) ;
		System.out.println(a);
		
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String str = dateFormat.format(a);
		System.out.println(str);//2024/12/19 16:24:40
		
//		String => Date => Timestamp 변환
		try {
			Date date = dateFormat.parse(str);
			Timestamp timestamp = new Timestamp(date.getTime());
			System.out.println(timestamp);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
