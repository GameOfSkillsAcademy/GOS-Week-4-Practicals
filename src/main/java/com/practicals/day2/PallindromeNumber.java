package com.practicals.day2;

import java.util.Scanner;

public class PallindromeNumber {
	
	
	public static boolean isPallindrome(int number) {
		
		int m=number;
		int result=0;
		
		while(number>0) {
			
			
			int temp=number%10;
			
			result=(result*10)+temp;
			
			
			number=number/10;
			
		}
		
		if(m==result)return true;
		
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		
          Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter one number to check it is pallindrome or not");
		
		int number=sc.nextInt();
		
//		System.out.println(PallindromeNumber.isPallindrome(number));
		
		
		for(int i=1;i<=number;i++) {
		
		if(PallindromeNumber.isPallindrome(i)) {
			
			System.out.println(i+" is a palindrome number");
		
		}
		
	}

	}
}
