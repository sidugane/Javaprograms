package Access_Specifiers;
import java.util.Scanner;
public class sample15 

{
	private String s; //pirvate integer declaration
	
	void s1()  //default method declaration
	{
		System.out.println("Enter your string :");
		
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		
		System.out.println("Your last string was :"+s);
		
	}
	
	public static void main(String[] args) 
	{
		sample15 s15=new sample15();
		s15.s1();
	}
}
