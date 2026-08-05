package com.practicals.day3;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
	
	int number=153;
	
	int temp=number;
	
	int count=0;
	
	// find the digit count of number
	
	while(temp!=0) {
		
		int c=temp%10;
		
		count++;
		
		temp=temp/10;
	}

	temp=number;
	
	int sum=0;
	
	
	while(temp!=0) {
		
		int c=temp%10;
		
		int product=1;
		
		for(int i=1;i<=count;i++) {
			
			product=product*c;
			
		}
		
		sum=sum+product;
		
		
		temp=temp/10;
		
	}
	
	if(sum==number) {
		System.out.println("Armstrong number");
	}else {
		System.out.println("Not a armstrong number");
	}
	
}
}