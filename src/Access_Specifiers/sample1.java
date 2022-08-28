package Access_Specifiers;

public class sample1
{
private int a;
private sample1()
{
	a=10;
}

private void m1()
{
	System.out.println(a);
}
public static void main(String[] args) 
{
	sample1 s1=new sample1();
	System.out.println(s1.a);
	s1.m1();
}

}
// Private:- If you declare any member of class as private then scope of that
//member remains only within the class. It can not be access from other class.

// Lets check sample2 class---it gives an error while accessing the sample1 class
//due to its scope