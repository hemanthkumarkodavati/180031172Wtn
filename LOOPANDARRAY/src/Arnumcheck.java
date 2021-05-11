import java.util.*;
public class Arnumcheck {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt(),k=0,j=0;
	int num[]= {10,5,6,78,9};
	for(int i=0;i<5;i++)
	{
	
		if(num[i]==n)
		{	
			k=k+1;
			j=i;
		}
	
    }
	if(k==1)
		System.out.println("at index"+j);
	else
	{
		System.out.println("-1");
	}
}
}
