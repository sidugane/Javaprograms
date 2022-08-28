package Interface;


public class sam13 implements sam12
{

	public void pattern()
	{
		for(int i=1; i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print("*");
			}
		System.out.println("");
		}
	}
	public void pattern2()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args)
	{
	sam13 s13=new sam13();
	s13.pattern();
	System.out.println("_________");
	s13.pattern2();
	}
	}
