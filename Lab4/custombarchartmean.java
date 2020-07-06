
import java.util.Scanner;
public class custombarchartmean {
	public static int clacAvg(int x[])
	{
	int sum=0,avg=0;
	for(int i=0;i<x.length;i++)
	{
	sum+=x[i];
	}
	avg=sum/x.length;
	return avg;
	}
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("How many bars would you like to display");
	int rows=scan.nextInt();
	int sizes[]=new int[rows];
	char Symbol[]=new char[rows];
	System.out.println("specify the size of the bars");
	for(int i=0;i<rows;i++)
	{
	sizes[i]=scan.nextInt();
	}
	System.out.println("Specify the symbols to be used for the bars");
	for(int i=0;i<rows;i++)
	{
	Symbol[i]=scan.next().charAt(0);
	}
	for(int i=0;i<rows;i++)
	{
	System.out.print((i+1)+" ");
	for(int j=0;j<sizes[i];j++)
	{
	System.out.print(Symbol[i]+" ");
	}
	System.out.println();
	}
	System.out.print("A");
	for(int i=0;i<clacAvg(sizes);i++)
	{
	System.out.print("*");
	}
	}
}
