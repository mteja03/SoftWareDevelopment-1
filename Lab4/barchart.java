
import java.util.Scanner;
public class barchart {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("How many bars would you like to display");
		int rows=scan.nextInt();
		int sizes[]=new int[rows];
		System.out.println("Specify the size of the bars");
		for(int i=0;i<rows;i++)
		{
			sizes[i]=scan.nextInt();
		}
		for(int i=0;i<rows;i++)
		{
			System.out.print((i+1)+" ");
			for(int j=0;j<sizes[i];j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		}

}
