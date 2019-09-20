package com.iu.collection.ex3;

public class WeatherService {
	
	private StringBuffer sb;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-Cloudy-");
		sb.append("Daejon-20.3-58-Sunny-");
		sb.append("Jeju-23.3-70-Rainy-");
		sb.append("Incheon-16.3-60-Rainy");
		
		//tokeniger
	}
	//메서드명 init
	public void init() {
		//날씨 정보를 파싱해서 저장
		
	}
	//메서드명 addWeather
	public void addWeather() {
		//날씨 정보를 입력해서 추가
		//지역, 기온, 습도, 상태
	}
	
	public void findWeather() {
		//도시명 입력 받아서 해당 날씨 출력
	}
	
}
