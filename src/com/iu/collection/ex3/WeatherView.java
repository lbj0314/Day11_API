package com.iu.collection.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class WeatherView {
	
	public void view(ArrayList<Weather> wts) {
		//날씨 전체 정보 출력
		System.out.println("전체 날씨의 정보를 조회합니다.");
		
//		Iterator<String> it = map.keySet().iterator();
//		
//		while(it.hasNext()) {
//			String key = it.next();
//			System.out.println(map.get(key));
//		}
//		
//		
		
		for (int i = 0; i < wts.size(); i++) {
			System.out.println("도시 이름 : "+wts.get(i).getCity());
			System.out.println("온도 : "+wts.get(i).getTemperature()+"셀시우스");
			System.out.println("습도 : "+wts.get(i).getHumidity()+"%");
			System.out.println("상태 : "+wts.get(i).getStatus());
			System.out.println("-----------------------");
		}//for

	}
	public void view(Weather wt) {
		//날씨 정보 하나 출력
		if (wt != null) {
			System.out.println("도시 이름 : "+wt.getCity());
			System.out.println("온도 : "+wt.getTemperature()+"셀시우스");
			System.out.println("습도 : "+wt.getHumidity()+"%");
			System.out.println("상태 : "+wt.getStatus());
			System.out.println("-----------------------");
		}else {
			System.out.println("날씨의 정보가 일치하지않거나 존재하지 않습니다.");
		}
	}
	
}
