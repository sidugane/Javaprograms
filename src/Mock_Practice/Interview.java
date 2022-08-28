package Mock_Practice;

import java.util.Scanner;

public class Interview
{
public static void main(String[] args) 
{
	
	System.out.println("Enter your Name");
	Scanner sc1=new Scanner(System.in);   
	String sa=sc1.nextLine();
	System.out.println("Hello! "+sa);
	
	System.out.println("Enter your option number:");
    Scanner sc2=new Scanner(System.in);
    int a=sc2.nextInt();
    
	switch(a)
	{
	    case 1: 
	    	
	    	System.out.println("Using Array Count Odd & Even Numbers");
	    	int []ai= {1,2,3,4,5,6,7,8,9};

	    	int even=0;
	    	int odd=0;

	    	for(int i=0;i<ai.length;i++)
	    	{
	    		if(ai[i]%2==0)
	    		{
	    			even++;
	    		}
	    		
	    		else
	    		{
	    			odd++;
	    		}
	    	}
	    	System.out.println("Even numbers are "+even);
	    	System.out.println("Odd numbers are "+odd);
	    	break;
	    case 2:
	    	
	    	System.out.println("Show the greateset value without using If statement");
	    	int aa=10;
	    	int bb=20;
	    	int cc=aa>bb? aa:bb;
	    	System.out.println("The largest number is :"+cc);
	    	
	    	break;	
	    	
	    	
	    case 3:
	    	System.out.println("Count the Capital Letters from the String !");
	    	System.out.println("Enter your String");
			
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			
			int as=0;
			int ab=0;
			
			for(int i=0;i<=s.length()-1;i++)
			{
			char ch=s.charAt(i);
			if(ch>=65&& ch<=90)
			{
				as++;
			}
			
			else
			{
				ab++;
			}
			}
			
			System.out.println("Capital letters in given string is :" +as);
			System.out.println("Small letters in given string is :" +ab);
			
		break;
	    	
	    }

}
	
	    
}
	
	


