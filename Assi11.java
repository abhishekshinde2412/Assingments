import java.util.Scanner;
class Assi11
{
	
public static void main (String args[])
{double radius,pi,perimeter,area;
pi=3.14;

Scanner input=new Scanner (System.in);
System.out.println("enter radius");
radius=input.nextDouble();

//radius=7.5;

perimeter=(2*pi*radius);
area=(pi*radius*radius);

System.out.println("perimiter = " +perimeter);
System.out.println("Area = " +area);



}
}
