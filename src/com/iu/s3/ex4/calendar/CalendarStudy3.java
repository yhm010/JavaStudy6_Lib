package com.iu.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy3 {

	public static void main(String[] args) {
		// 1초 = 1000밀리세컨드
		// 1분 =60초
		// 1시간 = 60분
		// 하루 = 24시간
		// 1년 = 365일
		System.out.println(1000*60*60*24*365);
		
		// 현재시간
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		// 2시간 뒤
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.HOUR_OF_DAY, 17);
		System.out.println(ca2.getTime());
		
		// 둘 간의 시간차를 구하려 함 (둘 다 밀리세컨즈로 만들기)
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		long result = l2-l1;
		System.out.println(result);
		
		// 시간 단위로 변경 (한시간이 몇밀리세컨즈인지 알면 됨)
		System.out.println(result/(1000*60*60));
		

	}

}
