import java.util.Scanner;
public class Upper {
public static void main(String[] args) {
char ch;
	        int temp;
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter a Character in Lowercase : ");
	        ch = scan.next().charAt(0);
			
	        temp = (int) ch;
	        temp = temp - 32;
	        ch = (char) temp;
			
	        System.out.print("Equivalent Character in Uppercase = " +ch);
	    }
	
}

