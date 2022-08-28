package Constuctors;

public class Sample24
{
	//Constructors using parameters
int a;

Sample24(int x)
{
	a=x;
}

public void cases()
{
	switch(a)
	{
	case 1:
		System.out.println("Your are at Good position-->"+"Your Ranking is :"+a);
	break;
	case 2:
		System.out.println("Your are at Better position-->"+"Your Ranking is :"+a);
	break;
	case 3:
		System.out.println("Your are at Best position-->"+"Your Ranking is :"+a);
	break;
	case 4:
		System.out.println("Your are at Awosome position-->"+"Your Ranking is :"+a);
	break;
	
	default:
		System.out.println("Keep working hard...!"+"Your Ranking is :"+a);
	}
}

public static void main(String[] args) 
{
	System.out.println("-----CARRER RANKING--------");
	Sample24 s24=new Sample24(1);
	s24.cases();
}
}
