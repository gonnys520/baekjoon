package org.gonnys;

import java.util.Arrays;
import java.util.Scanner;

public class Question10817 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[3];
		
		for (int i = 0; i < nums.length; ++i) {
			nums[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(nums);
		System.out.println(nums[1]);
		
		
	}
}
