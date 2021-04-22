package sdet_Training;

public class EvenOddNuminArray {

	public static void main(String[] args) {
		int[] a2=new int[]{11,42,21,52,23,71,92};
		int res;
		for(int i=0;i<a2.length;i++)
		{
			res=a2[i]%2;
			if(res==0) {
				System.out.println(a2[i] + " is even number");
				} else
				{
					System.out.println(a2[i] + " is odd number");
				}
					
		}

	}

}

