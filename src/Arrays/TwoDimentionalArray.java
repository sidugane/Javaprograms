package Arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
	
		//Finding the length of row and columns of array.
		int a[][]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		System.out.println("Number of rows :"+a.length);
		System.out.println("Number of columns :"+a[0].length);

	}

}
