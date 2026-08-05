package com.practicals.day2;

public class FibonacciSeries {

	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		
		int count=0;
		
		while(count<=10) {
			
			System.out.println(a);
			
			int c=a+b;
			
			a=b;
			
			b=c;
			
			count++;
			
		}
		
		
		
		
		
	}
}
