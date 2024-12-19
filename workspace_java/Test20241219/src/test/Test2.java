package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
//		String -> Date
		String dateStr = "2024년 12월 19일 16시 07분 05초";
		
		SimpleDateFormat dateFormat = 
	new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		Date date = null;
		try {
			date = dateFormat.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(date);
		
//		String -> LocalDateTime
		DateTimeFormatter formatter 
= DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		LocalDateTime localDateTime
		= LocalDateTime.parse(dateStr, formatter);
		
		System.out.println(localDateTime);
		
		
	}

}
