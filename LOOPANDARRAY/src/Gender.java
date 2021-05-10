import java.io.*;
import java.util.*;

import javax.swing.SortingFocusTraversalPolicy;
public class Gender {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int age=sc.nextInt();
	String gen=sc.next();
	if(gen=="female")
	{
		if(age>1 || age<58)
		System.out.print(" the \r\n percentage of interest is 8.2%");
		else
			System.out.print("percentage of interest is 9.2%.\r\n");
	}
	else if(gen=="male")
	{
		System.out.print("percentage of interest is 8.4%");
	}
}
}
