package Interface;

public class sam15 implements sam14
{

	public void pattern1()
	{
		for(int i=1;i<=10;i++)//Increment Order
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("I LOVE INDIA   ");
			}
			System.out.println("");
		}
	}
	public void pattern2()
	{
		for(int i=1; i<=10;i++)//decrement order
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print("MY HEART IS BEATING   ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) 
	{
	sam15 s15=new sam15();
	s15.pattern1();
	System.out.println("");
	
	s15.pattern2();
	}
}
