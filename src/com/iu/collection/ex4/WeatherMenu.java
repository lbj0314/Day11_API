package com.iu.collection.ex4;

import java.util.HashMap;
import java.util.Scanner;

public class WeatherMenu {

	private HashMap<String, Weather> wt;
	private WeatherService ws;
	private WeatherView wv;
	private Scanner sc;

	public WeatherMenu() {
		wt = new HashMap<String, Weather>();
		ws = new WeatherService();
		wv = new WeatherView();
		sc = new Scanner(System.in);
	}


	public void start() {
		//		1. 날씨정보 초기화 - init
		//		2. 날씨정보 추가 - addWeather
		//		3. 전체 날씨 정보 출력 - view
		//		4. 날씨 검색 - findWeather
		//		5. 날씨 정보 삭제
		//		6. 프로그램 종료
		
		
		
		
		HashMap<String, Weather> map = ws.init();
		
		int select = 0;
		boolean check = true;
		while (check) {
			System.out.println("원하는 메뉴의 숫자를 입력해주세요.");
			System.out.println("1. 날씨정보 초기화");
			System.out.println("2. 날씨정보 추가");
			System.out.println("3. 전체 날씨 정보 출력");
			System.out.println("4. 날씨 검색");
			System.out.println("5. 날씨 정보 삭제");
			System.out.println("6. 프로그램 종료");
			select = sc.nextInt();
			switch (select) {
			case 1:
				
				break;
			case 2:
				ws.addWeather(wt);
				break;				
			case 3:
				wv.view(map);
				break;
			case 4:
				Weather wt = ws.findWeather(map);
				wv.view(wt);
				break;
			case 5:
				wt = ws.deleteWeather(map);
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				check = !check;
			}
		}






	}


}
