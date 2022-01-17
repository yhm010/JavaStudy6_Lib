package com.iu.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		// 현재 시간
		Calendar ca = Calendar.getInstance();
		
		// 태어난 날 (960630)
		Calendar ca2 = Calendar.getInstance();
		ca2.set(1996, 7, 30); // 월은 0부터 시작
		System.out.println(ca2.getTime());
		
		long l1 = ca.getTimeInMillis();
		
		long l2= ca2.getTimeInMillis();
		
		long result = l1-l2;
		
		System.out.println(result);
		
		// 태어나서 며칠 째 살고 있는지? 365*20
		System.out.println(result/(1000*60*60*24));

		// 나이
		System.out.println(result/(1000*60*60*24*365.2425)); // 만나이 느낌 (초,분,시간,년)

	}

}
