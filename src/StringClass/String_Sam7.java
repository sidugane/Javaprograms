package StringClass;
import java.util.Scanner;
public class String_Sam7
{            // Learning String Classes--practiced on 08/06/2022
public static void main(String[] args) 
{
System.out.println("Enter your string ");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

System.out.println("Hello ! your string is :"+s);
System.out.println("The length of "+s+" is :"+s.length());

System.out.println("Your string "+s+" Contains  :"+s.contains("Sidharth"));

System.out.println("Your string  "+s+ " converted into lower case : "+s.toLowerCase());
System.out.println("Your string  "+s+ " converted into upper case : "+s.toUpperCase());
System.out.println("Your string  "+s+ " starts with :"+s.startsWith(s));
System.out.println("Your string  "+s+ " IndexOf:"+s.indexOf('s'));
System.out.println("Your string  "+s+ " LastIndexOf:"+s.lastIndexOf(s));
System.out.println("Your string  "+s+ " Ends with :"+s.endsWith(s));

System.out.println(" ");
System.out.println("---Comparing Other Strings-----");
System.out.println(" ");

System.out.println("Enter your second string : ");
String b=sc.nextLine();

System.out.println("First string is "+s+" & "+" Second string is "+b+" :"+s.equalsIgnoreCase(b));
System.out.println("First string is "+s+" & "+" Second string is "+b+" :"+s.equals(b));
}
}
