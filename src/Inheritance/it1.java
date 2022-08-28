package Inheritance;

public class it1 
{
int marks;

it1(int a)
{
	marks=a;
}
public void calcmarks()
{

if(marks>=35 & marks<=65)
{
	System.out.println("Your are pass :"+marks+"__DIV-C__");
}
else if (marks>65 & marks<=75)
{
	System.out.println("Your are pass :"+marks+"__DIV-B+__");
}
else if (marks>75 & marks<=85)
{
	System.out.println("Your are pass :"+marks+"__DIV-A+__");
}
else if (marks>85 & marks<=100)
{
	System.out.println("Your are pass :"+marks+"__DIV-A++__");
}
else
{
	System.out.println("Your result is : FAIL "+marks);
}
}
}


