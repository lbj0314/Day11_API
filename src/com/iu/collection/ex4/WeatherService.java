package com.iu.collection.ex4;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	private Scanner sc;
	private Weather wt;
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-Cloudy-");
		sb.append("Daejon-20.3-58-Sunny-");
		sb.append("Jeju-23.3-70-Rainy-");
		sb.append("Incheon-16.3-60-Rainy");
		sc = new Scanner(System.in);
		wt = new Weather();
		
		//tokenizer
	}
	HashMap<String, Weather> map = new HashMap <String, Weather>();
	//메서드명 init
	
	public HashMap<String, Weather> init() {
		//날씨 정보를 파싱해서 저장
		StringTokenizer st = new StringTokenizer(sb.toString(),"-");
		while (st.hasMoreTokens()) {
			wt = new Weather();
			wt.setCity(st.nextToken());
			wt.setTemperature(Double.parseDouble((st.nextToken())));
			wt.setHumidity(Integer.parseInt(st.nextToken()));
			wt.setStatus(st.nextToken());
			map.put(wt.getCity(), wt);
			
		}
		///HashMap에 추가
		//key는 도시명
		//밸류는 웨더 타입
		// 리턴은 HashMap
		
		
		return map;	
	}
	//메서드명 addWeather
	public void addWeather(HashMap<String, Weather> map) {
		//날씨 정보를 입력해서 추가
		//지역, 기온, 습도, 상태
		System.out.println("날씨 정보를 추가합니다.");
		System.out.println("도시 이름을 입력하세요.");
		String city = sc.next();
		System.out.println("기온을 입력하세요.");
		double temperature = sc.nextDouble();
		System.out.println("습도를 입력하세요.");
		int humidity  = sc.nextInt();
		System.out.println("상태를 입력하세요.");
		String status  = sc.next();
		
		wt.setCity(city);
		wt.setTemperature(temperature);
		wt.setHumidity(humidity);
		wt.setStatus(status);
		
	}
	
	public Weather findWeather(HashMap<String, Weather> map) {
		//도시명 입력 받아서 해당 날씨 출력
		//weather 리턴
		System.out.println("날씨 정보를 검색합니다.");
		System.out.println("-----------------------");
		System.out.println("도시의 이름을 입력하세요.");
		
		String city = sc.next();
		
		wt = map.get(city);
		
		
		return wt;
	}
	
	public Weather deleteWeather(HashMap<String, Weather> map) {
		System.out.println("삭제할 날씨의 도시 이름을 입력하세요.");
		String city = sc.next();
		Weather wt = map.remove(city);
		if (wt != null) {
			System.out.println("Delete Success");
		}else {
			System.out.println("Delete Fail");
		}
		return wt;
	}
	
	
}
