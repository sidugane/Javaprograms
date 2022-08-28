package Abstract_Class;

//concrete class
public class sam8 extends sam7
{

	public void a2()
	{
		System.out.println("Incomplete Method from sam7-Completing method a2 from sam7 in sam8");
	}
	public void a3()
	{
		System.out.println("Incomplete Method from sam7--Completing method a3 from sam7 in sam8");
	}
	
	public static void main(String[] args) 
	{
		sam8 s8=new sam8();
		s8.a1();
		s8.a2();//definition completed in sam8
		s8.a3();//definition completed in sam8
	}
}
