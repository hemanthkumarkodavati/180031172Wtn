import java.io.*;
import java.util.Scanner;
public class NumCheck {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if(num==0)
		{
			System.out.println("Zero");
		}
		else if(num<0)
		{
			System.out.println("negative");
		}
		else if (num>0)
		{
			System.out.println("positive");
		}
	}

}
