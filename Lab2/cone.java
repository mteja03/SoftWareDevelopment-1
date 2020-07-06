import java.util.Scanner;
public class cone
{
	
	public static void main(String args[])
	{
		double r,s,A;
		final float PI=3.1416f;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the radius of the cone");
		r=scan.nextDouble();
		System.out.println("Enter the slant height of the cone");
		s=scan.nextDouble();
		A=PI*r*r+PI*r*s;
		System.out.println("The surface area of a cone with radius "+r+" and slant height "+s+" is " +A);
	}
}
		
