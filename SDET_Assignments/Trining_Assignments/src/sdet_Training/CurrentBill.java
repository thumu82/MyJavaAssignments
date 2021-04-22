package sdet_Training;

import java.util.Scanner;

public class CurrentBill {

	public static void main(String[] args) {
				
		int units;
		String type;
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter units details");
		units = input.nextInt();
				
		System.out.println("Enter property details");
		Scanner input1 = new Scanner(System.in);

		
		
		type=input1.next();
		
		switch (type) {
		case "House":
			System.out.println("House Electricity Bill ");
			if (1<=units & units<=100)
			{
				System.out.println("Amount : "+ units*3);
				
				break;
				
			}else if ((units<=200))
			{
				System.out.println("Amount : "+ units*4);
				
				break;
			
		}
		
	case "Commercial":
		
		System.out.println("Commercial Electricity Bill");
		if (1<=units & units<=100)
		{
			System.out.println("Amount : "+ units*10);
			
		}else if ((units<=200)){
			System.out.println(" Amount : "+ units*20);
		
			}	
		
		}
	}
	
}
