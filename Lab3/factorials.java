

import java.util.Scanner;
public class factorials {
	public static void main (String[] args)
	{
		int num;
		long fact=1;
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 20:");
		num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("The factorial of " + num + " is: " + fact);
	}
}
