package sdet_Training;

public class SunMultFirstTenNumbers {
	
	public static void main(String args[]) {
		int sum=0,mul=1;
		for(int i = 1;i<=10;i++) {
			sum=sum+i;
			mul=mul*i;
		}
		
		System.out.println("Sum of first 10 numbers :" + sum);
		System.out.println("Multiplication of first 10 numbers :" + mul);
	}

}
