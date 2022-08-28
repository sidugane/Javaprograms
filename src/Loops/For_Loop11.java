package Loops;

public class For_Loop11 
{
public static void main(String[] args)
{

	for(int i=1;i<=10;i++)
	{
        for(int j=1;j<i;j++)
        {
        	System.out.print("* ");
        }
      System.out.println();
     }
	System.out.println("<<==============>>");
    reverse();

}


public static void reverse()
{
	for (int i=10;i>=1;i--)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
