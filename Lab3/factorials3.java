import java.util.Scanner;
public class factorials3{
	public static void main (String[] args)
	{
		int num;
		boolean iden=false;
		long fact;
		Scanner scan =new Scanner(System.in);
		do{
		System.out.println("Please enter a number between 1 and 20:");
		num=scan.nextInt();
		if((num<1)||(num>20))
		{
			System.out.println("That number is out of range");
		}
		
		 else
		  {
			 iden=true; 
			for(int i=1;i<=num;i++)
			{
				fact=1;
				for(int j=1;j<=i;j++)
				{
					fact*=j;
				}
			System.out.println("The factorial of" + i + " is: " + fact);
			}
		}	
		}while (iden==false);
	}
	}
