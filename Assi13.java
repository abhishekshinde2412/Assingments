import java.util.Scanner;
class Assi13
{
public static void main (String arg[])
{
double width,height,area,perimeter;

Scanner sc = new Scanner (System.in);

System.out.println("enter the width");
width = sc.nextDouble();

System.out.println("enter the height");
height = sc.nextDouble();


area=width*height;
perimeter=(2*(width+height));

System.out.println("area of rectangle is"+area);
System.out.println("perimeter of rectangle is"+perimeter);
}
}