package com.iu.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {


		//로또 번호 출력
		//1 ~ 45 6개 출력
		Random random = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>();


		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(45)+1;
			arr.add(num);

			for (int j = 0; j < i; j++) {
				if (arr.get(j) == num) {
					i--;
					arr.remove(j);
					break;
				}
			}

			//			if (num == 0) {
			//				i--;
			//				continue;
			//			}

		}
		for (int j = 0; j < arr.size(); j++) {
			System.out.println(arr.get(j));
		}


		//		System.out.println(num);




	}

}
