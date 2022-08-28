package ControlStatements;
import java.util.Scanner;
public class TakingInputFromKeyboard 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{

        Scanner scr=new Scanner(System.in);
        System.out.println("Enter Your Name");
  
          String str=scr.nextLine();
		  System.out.println("Hello! "+str);
		  System.out.println(".....................................");
		  System.out.println("Enter Your Value 1 :"); 
		  int a= scr.nextInt();
		  
		  System.out.println("Enter Your Value 2 :");
		  
		  int b= scr.nextInt();
		  
		  int sum=a+b;
		  
		  System.out.println(".....................................");
		  System.out.println("The sume of a+b: "+sum);
		  
		  if(a>b) { System.out.println("a > b :"+a);
		  } 
		  else 
		  {
		  System.out.println("b>a :"+b);
		  }
		 
		 
	}


}
