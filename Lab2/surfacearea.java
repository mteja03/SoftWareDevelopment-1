import java.util.Scanner;
public class surfacearea
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
		if(shape.equals("cone"))
		{
		System.out.println("enter the radius of the cone");
		r=scan.nextDouble();
		System.out.println("enter the slant hieght of the cone");
		s=scan.nextDouble();
		A=PI*r*r+PI*r*s;
		}
		else if(shape.equals("sphere"))
		{
		System.out.println("enter the radius of the sphere");
		r=scan.nextDouble();
		A=4*PI*r*r;
		}
		else if (shape.equals("cylinder"))
		{
		System.out.println("enter the slant hieght of the cylinder");
		r=scan.nextDouble();
		System.out.println("enter the length of the cylinder");
		l=scan.nextDouble();
		A=2*PI*(r+l);
		}
		System.out.println("the surface area of the " +shape+ " is "+A);
		}
		}
