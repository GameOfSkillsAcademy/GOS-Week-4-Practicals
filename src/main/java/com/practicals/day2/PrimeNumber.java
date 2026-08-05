package com.practicals.day2;

import java.util.Scanner;

public class PrimeNumber {
	
	
	public static boolean isPrime(int number) {
		
        int count=1;
		
		if(number<2) {
			
			return false;
		}
		
		for(int i=1;i<=number/2;i++) {
			
			if(number%i==0) {
				
				count++;
				
			}
			
		}
		
		System.out.println(count);
		
		if(count==2)return true;
		
		return false;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter one number to check it is prime or not");
		
		int number=sc.nextInt();
		  
		if(PrimeNumber.isPrime(number)) {
		
			System.out.println(number+ " is a prime number");
		}
		else {
			System.out.println(number+" not a prime number");
		}
		

		
	}

}
