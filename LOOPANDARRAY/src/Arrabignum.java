import java.util.Scanner;

public class Arrabignum {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int ar[][]=new int[n][n];
	if(n<9)
	{
		System.out.println("please take the input as four numbers!");
	}
	else
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			ar[i][j]=sc.nextInt();
		}
		}
		
		System.out.println("The given array is:");
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	        System.out.print(ar[i][j]+" ");
	        }
	        System.out.println();
	        
	    }
	    int max=Integer.MIN_VALUE;
	      System.out.println("The given array is:");
	        for(int i=0;i<3;i++)
	        {
	            for(int j=0;j<3;j++)
	            {
	                if(ar[i][j]>max)
	                    max=ar[i][j];
	            System.out.print(ar[i][j]+" ");
	            }
	            System.out.println();

	        }
	        System.out.println(" the maximum value is "+max);
	  
}
}
}
