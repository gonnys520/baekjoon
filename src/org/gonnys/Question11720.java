package org.gonnys;

import java.util.Scanner;

public class Question11720 {
	
	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);

	int num = sc.nextInt();
	String numCount = sc.next();
	int sum = 0;
	
	sc.close();
	
	for(int i=0; i < num; i++) {
		
		sum +=(int)numCount.charAt(i) - 48;
		
	}
	
	System.out.println(sum);

	

	
	}
}
