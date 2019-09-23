package com.iu.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// 현재 시간의 정보
		Calendar cal = Calendar.getInstance(); // new GregorianCalendar()
		//get 
		int hour = cal.get(Calendar.HOUR); //12hour
		int hour2 = cal.get(Calendar.HOUR_OF_DAY); //24hour
		int min = cal.get(Calendar.MINUTE);
		//연도
		int year = cal.get(Calendar.YEAR);
		int mon	 = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		
		int d = cal.get(Calendar.DAY_OF_WEEK); //그 주의 2
		
		System.out.println(min);
		System.out.println(hour);
		System.out.println(day);
		System.out.println(mon+1);
		System.out.println(year);
		
		System.out.println(d);
		
	}

}
