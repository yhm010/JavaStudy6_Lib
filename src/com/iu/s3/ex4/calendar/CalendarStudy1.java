package com.iu.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		
		//Calender는 추상 클래스
		//GregorianCalendar 가 Calendar 클래스 상속
		//Calendar의 메서드는 그대로 GregorianCalendar에 있다.
		
		// 현재 날짜와 시간정보를 가지는 객체를 생성
		GregorianCalendar gc = new GregorianCalendar(); // 객체만드는것 1

		Calendar calendar = new GregorianCalendar();// 객체만드는것 2 = 3 같음
		
		Calendar ca = Calendar.getInstance();// 객체만드는것 3 실제로 GregorianCalendar임. 이걸로 사용
		
		System.out.println(gc); // 참조변수(gc) 찍으면 tostirng 자동으로 나옴
		System.out.println(calendar);
		System.out.println(ca);
		
		int y = ca.get(calendar.YEAR); // 년도
		int m = ca.get(calendar.MONTH); //월
		int d = ca.get(calendar.DATE); // 일
		int h = ca.get(ca.HOUR); // 12시간 시
		int hh = ca.get(calendar.HOUR_OF_DAY); // 24시간 시
		int min = ca.get(calendar.MINUTE); // 분
		int s = ca.get(calendar.SECOND); // 초
		int ms = ca.get(calendar.MILLISECOND);// 1000분의 1초
		long millis = ca.getTimeInMillis(); // 현재 시간을 MILLISECOND로 바꾸는 것
		
		Date date = ca.getTime();
		
		System.out.println("Y :" + y);
		System.out.println("M :" + (m+1)); // 문자 숫자 소괄호로 묶기
		System.out.println("D :" + d);
		System.out.println("H :" + h);
		System.out.println("HH : " + hh);
		System.out.println("min :" + min);
		System.out.println("s :" + s);
		System.out.println("ms : " + ms);
		System.out.println("millis :" + millis);
		System.out.println("date :" + date);
	}

}
