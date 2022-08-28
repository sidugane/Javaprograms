package Arrays;

public class sam5 
{
public static void main(String[] args)
{
	int [] ar=new int[5];
	
	ar[0]=40;
	ar[1]=50;
	ar[2]=10;
	ar[3]=20;
	ar[4]=30;
	
	System.out.println("---print original data--");
	for (int i = 0; i <= ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	
	
	
	System.out.println("-------print array in reverse order---------");
	
	//         4          0>=0
	for(int i=ar.length-1; i>=0; i--) 
	{                     //  0  
		System.out.println(ar[i]);          //30 20 10 50 40
	}
	
	
}

}

