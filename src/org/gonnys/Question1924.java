package org.gonnys;

import java.util.Scanner;

public class Question1924 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int month = scan.nextInt();
		int day = scan.nextInt();
		scan.close();
		int sum = 0;
		

		for(int i=1; i<month; i++) {
			if(i==1 || i==3 || i==5 || i==7|| i==8 || i==10 || i==12) {
				sum+=31;
			}
			if(i==2) {
				sum+=28;
			}
			if(i==4 || i==6 || i==9 || i==11) {
				sum+=30;
			}
		}
		
		sum+=day;
		int week = sum%7;
		
		switch(week) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		}
	}
}
