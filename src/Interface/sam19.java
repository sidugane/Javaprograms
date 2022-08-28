package Interface;

public class sam19 implements sam18
{
public void sum()
{
	int i=2;
	 while(i<=10)
	  {
		System.out.println(i);
		i=i+2;
	  }
}

public void odd()
{
	int j=1;
			while(j<=10)
			{
				System.out.println(j);
				j=j+2;
			}
}

public static void main(String[] args)
{
	sam19 s19=new sam19();
	s19.sum();
	System.out.println("____");
	s19.odd();
}
}
