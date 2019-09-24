package com.iu.calendar;

import java.util.Calendar;

public class CalendarTest5 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();//현재
		//		int h = calendar.get(Calendar.HOUR_OF_DAY);
		long l1 = calendar.getTimeInMillis(); // 1 == 1000
		System.out.println(l1);
		Calendar calendar2 = Calendar.getInstance(); // 5시간 뒤
		calendar2.add(Calendar.HOUR_OF_DAY, 26);
		long l2 = calendar2.getTimeInMillis();
		//		int h2 = calendar2.get(Calendar.HOUR_OF_DAY);
		//시간당 1000원
		//		System.out.println(h2-h);
		System.out.println(l2);
		System.out.println(l2-l1);
		long l3 = l2-l1;
		System.out.println(l3/1000+"초");//초
		System.out.println(l3/60000+"분");//분
		System.out.println(l3/3600000+"시간");//시
		System.out.println(l3/86400000+"일");//일
//		long l4 = l3%1000*60*60*24;
//		System.out.println(l4);
		l3 = l3/3600000;
		if (l3 >= 24) {
			long l5 = l3-24;
			l3 = l3/24;
			System.out.println(l3+"일"+l5+"시간");
		}else {
			System.out.println(l3/3600000+"시간");
		}
	}
}
