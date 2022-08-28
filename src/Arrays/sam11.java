package Arrays;

public class sam11 
{
public static void main(String[] args) 
{
	
	int[]marks= new int[5];
	
	
	marks[0]=10;
	marks[1]=50;
	marks[2]=60;
	marks[3]=70;
	marks[4]=80;
	
	String []name=new String[5];
	name[0]="Sidharth";
	name[1]="Tanuja";
	name[2]="Mahendra";
	name[3]="Arohi";
	name[4]="Manasvi";
	
	System.out.println("__Printin all data___");
	
	for(int i=0;i<=marks.length-1;i++)
	{
		System.out.println(marks[i]);
	}
	
	
	System.out.println("__Printing Names__");
	
	for(int j=0; j<=name.length-1;j++)
	{
		System.out.println(name[j]);
	}
}
}
