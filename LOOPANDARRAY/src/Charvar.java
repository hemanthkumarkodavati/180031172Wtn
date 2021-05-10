import java.io.*;
import java.util.*;
public class Charvar {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	char ch= sc.next().charAt(0);
	if(ch>=48 && ch<=57)
{
	System.out.print("char is Digit");
}
	 else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
	    {
	        System.out.print("char is Alphabet");
	    }
	    else
	    {
	        System.out.print("char is special character");

	    }

}
}
