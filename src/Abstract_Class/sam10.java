package Abstract_Class;

public class sam10 extends sam9
{

	
	public void j2()
	{
		System.out.println("Incomplete j2 from sam9-completed its definition in sam10");
	}
	
	public void j3()
	{
		System.out.println("Incomplete j3 from sam9-completed its definition in sam10");
	}
	
	public static void main(String[] args) 
	{
		sam10 s10=new sam10();
		s10.j1();
		s10.j2();
		s10.j3();
	}
}
