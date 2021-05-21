import java.io.*;
import java.util.*;
public class Arrs {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int ar[][]=new int[n][n];
	if(n<4)
	{
		System.out.println("please take the input as four numbers!");
	}
	else
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
			ar[i][j]=sc.nextInt();
		}
		}
		
		System.out.println("The given array is:");
	    for(int i=0;i<2;i++)
	    {
	        for(int j=0;j<2;j++)
	        {
	        System.out.print(ar[i][j]+" ");
	        }
	        System.out.println();
	        
	    }
	    System.out.println("The reverse of array is:");
	    for(int i=1;i>=0;i--)
	    {
	        for(int j=1;j>=0;j--)
	        {
	        System.out.print(ar[i][j]+" ");
	        }
	        System.out.println();
	        
	    }
		
	}
	
}
}
