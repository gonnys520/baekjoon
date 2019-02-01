package org.gonnys;

import java.util.Scanner;

public class Question2839 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();	
		scan.close();
		
		int result = 0;
		
		if(n>=3 & n<=5000) {
	
			while(true) {
				if(n%5==0) {
					result += (n/5);
					break;
				}
				n -= 3;
				++result;
				if(n<0) break;
			}
			System.out.println(n<0?-1:result);
			
		}
		
	}
}
