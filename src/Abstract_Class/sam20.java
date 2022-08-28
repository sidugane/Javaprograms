package Abstract_Class;
//Concrete Class
public class sam20 extends sam19
{

	
	public void Panjab_Kings()
	{
	System.out.println("Punjab Kings_Runner up in IPL");	
	}
	
	public void Delhi_Capitals()//definition completed 
	{
		System.out.println("Delhi Capitals_Outstanding Cricket played in IPL");	//definition completed 
	}
	
	public static void main(String[] args)
	{
		sam20 s20=new sam20();
		s20.RCB();
		s20.Panjab_Kings();
		s20.Delhi_Capitals();
	}
}
