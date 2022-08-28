package Arrays;

import java.util.Arrays;

public class sam6 
{
	public static void main(String[] args) {
		

	int [] ar=new int[5];
	
	ar[0]=40;     //10
	ar[1]=50;     //20  
	ar[2]=10;     //30
	ar[3]=20;     //40
	ar[4]=30;     //50
	
	System.out.println("---print original data--");
	
	for (int i = 0; i <= ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	
				
	Arrays.sort(ar);    //sort
	
	System.out.println("-----print array in ascending order-------");
	
	for (int i = 0; i <= ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	
	
	System.out.println("-----print array in descending order-------");
	for (int i = ar.length-1; i>=0; i--)
	{
		System.out.println(ar[i]);
	}
}
}



