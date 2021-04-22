package sdet_Training;

public class SumMultOfArrayElements {
	
	public static void main(String[] args){
		int[] a1=new int[]{1,2,1,2,3,1,2};
		int sum=0,mult=1;

		for(int i=0;i<a1.length;i++)
		{
			sum=sum+a1[i];
		    mult=mult*a1[i];
		}
		System.out.println("Sum of all numbers in array :" + sum);
		System.out.println("Multiplication all numbers in array :" + mult);
		}

}
