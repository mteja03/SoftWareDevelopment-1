import java.util.Scanner;
public class surfaceareaswitch
{
	public static void main (String args[])
	{
		double r,s,l,A=0;
		final float PI=3.1416f;
		String shape;
		Scanner scan =new Scanner(System.in);
		System.out.println("which shape would you like to calculate the surface area?");
		System.out.println("choose:cone,sphere,cylinder");
		shape=scan.next();
		switch(shape)
		{
		case"cone":
		System.out.println("enter the radius of the cone");
		r=scan.nextDouble();
		System.out.println("enter the slant height of the cone");
		s=scan.nextDouble();
		A=PI*r*r+PI*r*s;
		break;
		
		case"sphere":
		System.out.println("enter the radius of the sphere");
		r=scan.nextDouble();
		A=4*PI*r*r;
		break;
		
		case"cylinder":
		System.out.println("enter the radius of the cylinder");
		r=scan.nextDouble();
		System.out.println("enter the lenth of the cylinder");
		l=scan.nextDouble();
		A=2*PI*(r+l);
		};
				System.out.println("the surface area of the " +shape+ " is " +A);
				}
				}
		
		
		
		
		
		
		
		
		
		
		
