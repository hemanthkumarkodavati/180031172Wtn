import java.io.*;
import java.util.*;
public class Arsum {
public static void main(String[] args) {
	int nums[]=new  int[100];
	Scanner sc= new Scanner(System.in);
	int sum=0;
	float avg;
	for(int i=0;i<3;i++)
	{
		nums[i]=sc.nextInt();
	}
	for(int i=0;i<3;i++)
	{
		sum=sum+nums[i];
		
	}
	avg =sum/3;
	System.out.println("sum is"+sum);
	System.out.println("and average is "+avg);

}
}
