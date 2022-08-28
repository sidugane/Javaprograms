package Casting;
//Practiced on 12/06/2022 Sunday
public class casting6 extends casting5
{

	public void Home()
	{
		System.out.println("Fathers Home: 3BHK");
	}

	public void Money()
	{
		System.out.println("Fathers Mone: 8L");
	}

	public void Balance()
	{
		System.out.println("Fathers Home: 3BHK+10L");
	}
	
	public void myown()
	{
		System.out.println("This is my own property!");
	}
	
	
	public static void main(String[] args)
	{
	//This is method over loading
		System.out.println("Example of Method Overriding");
		casting6 s6=new casting6();
		s6.Home();
		s6.Money();
		s6.Balance();
		s6.myown();
		System.out.println("");
	// To perform the up casting-->Create object of Sub class with reference of Super Class
		System.out.println("This is Up Casting");	
casting5 s5=new casting6();
s5.Home();
s5.Money();
s5.Balance();

		
	}
}
