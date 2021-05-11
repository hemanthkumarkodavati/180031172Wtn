import java.io.*;
import java.util.*;
public class Prime {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt(),c=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			c=c+1;
			}
	}
	if(c>2)
		System.out.println(" The is not prime"+n);
	else 
		System.out.println(" The is prime"+n);
}
}
