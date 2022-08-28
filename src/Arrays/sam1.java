package Arrays;

public class sam1
{
public static void main(String[] args) 
{
	int[]marks= new int[5];
	marks[0]=10;
	marks[1]=20;
	marks[2]=30;
	marks[3]=40;
	marks[4]=50;
	
	System.out.println(marks[4]);
	System.out.println(marks.length);
	
	System.out.println("---Print all data---");
	
for(int i=0;i<5;i++)
{
	System.out.println(marks[i]);
}

System.out.println("---Print all data 2---");
for(int i=0;i<=marks.length-1;i++)
{
	System.out.println(marks[i]);
}

}
}
/*Array is a data structure use to store the collection of information 
--> It is Homogeneous in nature
--> Array declaration need to be done with capacity 
--> Not growable in nature(Fix size)
--> Array is nothing but an object
--> Inside object array index will be present
--> Array index start form zero

            *** Types of Array ***
 1) Single Dimentional Array
 2) Multi Dimentional Array

 */