import java.util.*;
public class Arminmax {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int nums[]=new  int[n];
	for(int i=0;i<n;i++)
	{
		nums[i]=sc.nextInt();
	}
	Arrays.sort(nums);
	System.out.println("maximum element is"+nums[n-1]);
	System.out.println("minimum element is"+nums[0]);
	
}
}
