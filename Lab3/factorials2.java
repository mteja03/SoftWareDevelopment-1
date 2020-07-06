import java.util.Scanner;
public class factorials2 {
	public static void main (String[] args)
	{
		int num;
		boolean iden=false;
		long fact=1;
		Scanner scan =new Scanner(System.in);
		do{
		System.out.println("Please enter a number between 1 and 20:");
		num=scan.nextInt();
		if((num<1)||(num>20))
		{
		System.out.println("That number is out of range");
		}else{
			iden=true; 
			for(int i=1;i<=num;i++)
		{
		fact*=i;
		}
		System.out.println("The factorial of " + num + " is:" + fact);
		}
		}while (iden==false);
		}
		
		}
