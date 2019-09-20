package com.iu.stringtokniger;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		//파싱
		String str = "momo, 24, sana, 24, mina, 24, nayeon, 25";
		
		StringTokenizer st = new StringTokenizer(str, ", ");
		
		while (st.hasMoreTokens()) {
			String s = st.nextToken(); //문자열 파싱
			String age = st.nextToken();
			System.out.println(s);
			System.out.println(age);
			
		}
		
		

	}

}
