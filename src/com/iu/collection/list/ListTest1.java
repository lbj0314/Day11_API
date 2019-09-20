package com.iu.collection.list;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		//1, 2, 3
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add('c');
		arr.add(3);
		arr.add("four");
		
		arr.add(1, "two");
		arr.set(1, 10000);
		
		arr.remove(1);
//		arr.clear();
		int num = 10;
		Integer n = num; //auto Boxing
		arr.add(num); //auto Boxing
		num = (int) arr.get(0);
		String name = (String) arr.get(3);
		
		for (int i = 0; i < arr.size() ; i++) {
			System.out.println(arr.get(i));
		}
		
		
		
	}

}
