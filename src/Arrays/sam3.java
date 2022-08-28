package Arrays;

public class sam3
{
public static void main(String[] args) 
{
	
	String [] s1=new String[4];
		
		s1[0]="ramesh";
		s1[1]="mahesh";
		s1[2]="ganesh";
		s1[3]="suresh";
		
		
		System.out.println(s1[2]);
		System.out.println(s1.length);
		
		System.out.println("--print all data---");
		
		
//		for(int i=0; i<=3; i++)
//		{
//			System.out.println(s1[i]);
//		}
		
		for(int i=0; i<=s1.length-1; i++)
		{
			System.out.println(s1[i]);
		}
		
		
		
	}	
}

