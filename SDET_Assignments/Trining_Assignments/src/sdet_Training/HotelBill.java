package sdet_Training;

import java.util.Scanner;

public class HotelBill {

	public static void main(String[] args) {
	
int index,nplates;

double amount;

Scanner input = new Scanner(System.in);

System.out.println("Enter Index");

index = input.nextInt();

Scanner input1 = new Scanner(System.in);


if (index>0 & index < 4)
{
	System.out.println("Enter Number of Plates");

	nplates = input1.nextInt();

	System.out.println("Item     No.of Plates");

switch(index) {

case 1:
	System.out.println("Dosa     " + nplates);
	amount=nplates*20;
	
System.out.println("Total Amount  " + amount);
break;

case 2:
	System.out.println("Idli     " + nplates);
	amount=nplates*10;
System.out.println("Total Amount  " + amount);
break;

case 3:
	System.out.println("Pongal     " + nplates);
amount=nplates*30;
System.out.println("Total Amount " + amount);
	}
} else
{
	System.out.println("No item exist please enter Index between 1 and 3");
}
}
}

