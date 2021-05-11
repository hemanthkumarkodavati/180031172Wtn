import java.util.Scanner;

public class PrimeorCom {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		if(n==0 || n==1)
		{
			System.out.println(" is not composite or prime"+n);
		}
		else
		{
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
}
