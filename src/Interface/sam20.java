package Interface;

public class sam20 extends sam19
{

	public void patternx()
	{
		for(int i=1;i<=10;i++)//increment order
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("1 ");
			}
			System.out.println("");
		}
		System.out.println("---------------------");
		
		for(int j=1;j<=10;j++) //decrement order
		{
			for(int k=10;k>=j;k--)
			{
				System.out.print("2 ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
	sam20 s2=new sam20();
	s2.patternx();
	System.out.println("");
	s2.sum();
	System.out.println("");
	s2.odd();
	}
}
