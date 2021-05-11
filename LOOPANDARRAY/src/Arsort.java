import java.util.*;
public class Arsort {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]= new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
		
	}
	for(int i=0;i<n;i++)
	{
		System.out.println("un sorted array"+ar[i]);
	}
	Arrays.sort(ar);
	for(int i=0;i<n;i++)
	{
		System.out.println(" sorted array"+ar[i]);
	}
	
}
}
