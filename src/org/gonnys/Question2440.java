package org.gonnys;

import java.util.Scanner;

public class Question2440 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num =  scan.nextInt();
		scan.close();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i+1; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
