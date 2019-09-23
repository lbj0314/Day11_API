package com.iu.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest4 {

	public static void main(String[] args) {
		//닭다리 쿠션(40), 무선 청소기(10), 은갈치 넥타이(50)
		ArrayList<String> arr = new ArrayList<String>();
		
//		arr.add("닭다리 쿠션");
//		arr.add("닭다리 쿠션");
//		arr.add("닭다리 쿠션");
//		arr.add("닭다리 쿠션");//4
//		arr.add("무선 청소기"); //1
//		arr.add("은갈치 넥타이");
//		arr.add("은갈치 넥타이");
//		arr.add("은갈치 넥타이");
//		arr.add("은갈치 넥타이");
//		arr.add("은갈치 넥타이");//5
		
		for (int i = 0; i < 11; i++) {
			if (i >=0 && i < 5) {
				arr.add("닭다리 쿠션");
			}else if(i == 6) {
				arr.add("무선 청소기");
			}else if(i >= 7 && i <= 10) {
				arr.add("은갈치 넥타이");
			}
		}
		System.out.println(arr);
		Random random = new Random();
		
		int num = random.nextInt(arr.size());
		System.out.println(arr.get(num));

	}

}
