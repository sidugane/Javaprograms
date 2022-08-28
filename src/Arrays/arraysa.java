package Arrays;

public class arraysa
{
public static void main(String[] args)
{
	int a[]= {1,2,3,4,5};
	int sum=0;
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
		
	}

	
	//calculating sum of the array
	System.out.println("--------SUM OF ARRAY------");
	
	for(int y:a)
	{
		sum=sum+y;
	}
	System.out.println("Sum of Array is :"+sum);
}
}
