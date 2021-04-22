package sdet_Training;

import java.util.Scanner;

public class PrimeNumber {
	

	public static void main(String[] args) {
		int n,res=0;
		
		 Scanner input = new Scanner(System.in);
	    	
	        System.out.println("Enter Number");

	        n = input.nextInt();

		if (n==2)
		{
		System.out.println("Given Number " + n + " is a prime number");
		}else {
			for(int i=2; i<n;i++)
			{
			res=n%i;
			if(res==0)
			{
			System.out.println("Given Number " + n + " is not a prime number");
			break;
			}
			}
		     }
		if(res==1)
		{
		System.out.println("Given Number " + n + " is a prime number");
		}
		}
		
	}


