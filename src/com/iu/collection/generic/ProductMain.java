package com.iu.collection.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductMain {

	public static void main(String[] args) {

		Tv t = new Tv();
		Computer computer = new Computer();
		NoteBook noteBook = new NoteBook();
		
		ArrayList<? extends Computer> arr = new ArrayList<Computer>();
		//Computer와 Computer를 상속 받은 타입.
//		arr.add(t);
		
		
		//<Generic>
//		ArrayList<Product> arr = new ArrayList<Product>();
//		arr.add(t);
//		arr.add(computer);
//
//		ArrayList<Product> arr2 = new ArrayList<Product>();
//
//		//		ArrayList<ArrayList<Product>> arr3 = new ArrayList<ArrayList<Product>>();
//
//		HashMap<String, ArrayList<Product>> map 
//		= new HashMap<String, ArrayList<Product>>();
		
		
		
		
		
	}

}
