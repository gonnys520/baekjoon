package org.gonnys;

import java.util.Scanner;

public class Question8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int result = 0;
		
		for(int i=0; i<=n; i++) {
			result +=i;
		}
		
		System.out.println(result);
	}
}
