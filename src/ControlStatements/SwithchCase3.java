package ControlStatements;
import java.util.Scanner;
public class SwithchCase3 
{
public static void main(String[] args)
{
	
System.out.println("Please Enter Your Name");
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();

System.out.println("Hello!: "+name+" Please select options from below");
System.out.println("c1");
System.out.println("c2");
System.out.println("c3");
Scanner sc2=new Scanner(System.in);
String a1=sc2.nextLine();
switch(a1)
{
case "c1":
System.out.println("Hello! "+name+" ");
System.out.println("Your are in c1");	
System.out.println("This is Case 1");
break;
case "c2":
System.out.println("Hello! "+name+" ");
System.out.println("Your are in c2");	
System.out.println("This is Case 2");
break;
case "c3":
System.out.println("Hello! "+name+" ");
System.out.println("Your are in c3");	
System.out.println("This is Case 3");
break;	
default:
	System.out.println(name+"!,This is Wrong input");
}
}

}
