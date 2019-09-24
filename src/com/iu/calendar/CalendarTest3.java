package com.iu.calendar;

import java.util.Calendar;

public class CalendarTest3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//택배
		//현재의 년월일
		int y = calendar.get(Calendar.YEAR);
		System.out.println(y+"년");
		int m = calendar.get(Calendar.MONTH)+1;
		System.out.println(m+"월");
		int d = calendar.get(Calendar.DATE);
		System.out.println(d+"일");
		System.out.println("-------");
		//이틀 뒤의 년월일
//		calendar.set(Calendar.DATE, d+10);
		calendar.add(Calendar.DATE, 10);
		d = calendar.get(Calendar.YEAR);
		System.out.println(d+"년");
		m = calendar.get(Calendar.MONTH)+1;
		System.out.println(m+"월");
		y = calendar.get(Calendar.DATE);
		System.out.println(y+"일");
		
	}
}
