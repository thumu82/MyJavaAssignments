package sdet_Training;

import java.util.Scanner;

public class MonthsAndSeasons {
	
	public void seasons(int month) {
		if(month>0 && month<=12){
								if(month>=1 && month<=4) {
									System.out.println("Summer Season");
									
								}else if(month >4 && month<=7) {
									System.out.println("Winter Season");
								} else {
									System.out.println("Rainy Season");
								}
			
		}else {	
							
		System.out.println("Given Month is invalid please enter month between 1 & 12");
		}	
	}

	public static void main(String[] args) {
		int month;
		
		 Scanner input = new Scanner(System.in);
	    	
	        System.out.println("Enter month");

	        month = input.nextInt();
	
		MonthsAndSeasons s=new MonthsAndSeasons (); 
		
		s.seasons(month);

	}


}

