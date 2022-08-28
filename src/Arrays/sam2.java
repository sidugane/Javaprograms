package Arrays;

public class sam2
{
	
	public static void main(String[] args) 
	{
		
	//step1: array declaration
			int [] ar=new int[5];
			
			//step2: array initialization
			ar[0]=40;
			ar[1]=50;
			ar[2]=10;
			ar[3]=20;
			ar[4]=30;
			
					
			//step3: array usage
			
			System.out.println(ar[4]);    //30
			System.out.println(ar.length);   //5
			
			
			System.out.println("-----print all data--------");
		
			//           5<=4
//			for(int i=0; i<=4; i++)
//			{						//4
//				System.out.println(ar[i]);        //40  50  10 20 30
//			}
			
			
			for(int i=0; i<=ar.length-1; i++)
			{						//4
				System.out.println(ar[i]);        //40  50  10 20 30
			}
					
		}
}

