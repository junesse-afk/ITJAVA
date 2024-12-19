package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Test1 {

	public static void main(String[] args) {
//		import java.time.LocalDate;
//		현 날짜 구하기
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);//2024-12-19
		
//		LocalDate localDate2 = 
//				LocalDate.now(ZoneId.of("Europe/Paris"));
//		System.out.println(localDate2);
		
//		import java.time.format.DateTimeFormatter;
		DateTimeFormatter formatter 
		= DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		String formatedNow = localDate.format(formatter);
		System.out.println(formatedNow); //2024/12/19
		
		int year = localDate.getYear();
		String month = localDate.getMonth().toString();
		int mon = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();
		String week = localDate.getDayOfWeek().toString();
		int wee = localDate.getDayOfWeek().getValue();
		System.out.println(year);
		System.out.println(month);
		System.out.println(mon);
		System.out.println(day);
		System.out.println(week);
		System.out.println(wee); // 월(1) ~ 일(7)
		
		System.out.println("===================");
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		DateTimeFormatter formatter2 
		= DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		
		String str = localTime.format(formatter2);
		System.out.println(str);
		
		int hour = localTime.getHour();
		int minute = localTime.getMinute();
		int second = localTime.getSecond();
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		System.out.println("===================");
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		DateTimeFormatter formatter3
		= DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		String str2 = dateTime.format(formatter3);
		System.out.println(str2);
		
		System.out.println("===================");
		
		
		
	}

}
