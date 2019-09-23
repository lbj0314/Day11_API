package com.iu.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest3 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("햄버거");
		arr.add("라멘");
		arr.add("피자");
		arr.add("돈까스");
		arr.add("굶기");
		arr.add("떡볶이");
		Random random = new Random();
		
		int num = random.nextInt(arr.size());
		
		System.out.println(arr.get(num));
		System.out.println(arr.get(random.nextInt(arr.size())));
		
		
		
		
		
		
	}

}
