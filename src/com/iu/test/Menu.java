package com.iu.test;

import java.util.Calendar;
import java.util.Scanner;

public class Menu {

	private Machine machine;
	private Scanner sc;
	public Menu(){
		machine = new Machine();
		sc = new Scanner(System.in);

	}



	public void select() {

		boolean check = true;
		Drink drink = null;
		while (check) {
			System.out.println("1. Cola");
			System.out.println("2. Cider");
			System.out.println("3. Water");
			System.out.println("4. End");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				drink = machine.makeCola();
				break;
			case 2:	
				drink = machine.makeCider("Sprite", 2000, Calendar.getInstance());
				break;
			case 3:
				drink = machine.makeWater();
				break;
			default:
				check =! check;
				break;
			}//switch
			
		}//while
		System.out.println(drink.getBrand());
	}


}
