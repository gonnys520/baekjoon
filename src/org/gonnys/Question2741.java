package org.gonnys;

import java.util.Scanner;

public class Question2741 {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=n; ++i) {
			System.out.printf("%d\n", i);
		}
		
	}

}
