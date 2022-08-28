package Arrays;

public class sam13 
{

	public static void main(String[] args) 
	{
	
		int[] i= new int[5];
	
		String[] s=new String [7];
	
		
		
		
		i[0]=1;
		i[1]=2;
		i[2]=3;
		i[3]=4;
		i[4]=5;
		
		s[0]="Sidharth";
		s[1]="Tanuja";
		s[2]="Tanuja Sidharth Dugane";
		s[3]="Mahendra Sidharth Dugane";
		s[4]="Arohi Sidharth Dugane";
		s[5]="Manasvi Ajay Dugane";
		s[6]="Mahi";
		
		
		System.out.println("--PRINTING NUMBERS--");
		
		for(int j=0;j<=i.length-1;j++)
		{
			System.out.println(i[j]);
		}
		
		System.out.println("--PRINTING NAMES--");
		
		for(int k=0;k<=s.length-1;k++)
		{
			System.out.println(s[k]);
		}
}
}