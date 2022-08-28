package Arrays;

public class sam4
{
public static void main(String[] args)
{
	char [] s1=new char[4];
	
	s1[0]='B';
	s1[1]='A';
	s1[2]='C';
	s1[3]='M';
	
	
	System.out.println(s1[2]);
	System.out.println(s1.length);
	
	System.out.println("--print all data---");
	
	
//	for(int i=0; i<=3; i++)
//	{
//		System.out.println(s1[i]);
//	}
	
	for(int i=0; i<=s1.length-1; i++)
	{
		System.out.println(s1[i]);
	}
	
	
	
}

}

