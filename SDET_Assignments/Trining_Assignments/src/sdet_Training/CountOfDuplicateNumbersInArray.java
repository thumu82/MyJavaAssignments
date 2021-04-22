package sdet_Training;

public class CountOfDuplicateNumbersInArray {
	public static void main(String[] args){
		int[] a1=new int[]{1,2,3,2,3,4};
		int count=0;

		for(int i=0;i<a1.length;i++)
		{
		  for(int j=i+1;j<a1.length;j++)
		   {
		     if(a1[i]==a1[j]){
		    	count=count+1;
		    	 continue;
		    		    	
		    	 }
		   	     
				    }
		  				}
		
			
		System.out.println("Count of duplicate numbers in given array :" + count);
		}

}
