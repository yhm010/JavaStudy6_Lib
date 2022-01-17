package com.iu.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy2 {

	public static void main(String[] args) {
		// 현재 시간
		Calendar ca = Calendar.getInstance(); // new 못함
		System.out.println(ca.getTime());
		
		// 시간 변경 (미래)
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.YEAR, 2023); // 년도 변경
		ca2.set(Calendar.MONDAY,1); // 2월, 월 변경
		ca2.set(Calendar.DATE, 15); // 일 변경
		System.out.println(ca2.getTime());

	}

}
