package com.iu.test;

import java.util.Calendar;

public class Machine {

	//콜라 선택
	public Cola makeCola() {
		Cola cola = new Cola();
		cola.setBrand("CocaCola");
		cola.setPrice(2000);
		cola.setCalendar(Calendar.getInstance());
		return cola;
	}
	//사이다
	public Cider makeCider(String brand, int price, Calendar calendar) {
		Cider cider = new Cider(); //뭘 담으려고 할때
		cider.setBrand(brand);
		cider.setPrice(price);
		cider.setCalendar(calendar);
		return cider;
	}
	//물
	public Water makeWater() {
		//주기만 하려고 할때
		return  new Water();	
	}


}
