import java.util.Scanner;
class Assi12
{
public static void main(String args[])
{
double num1,num2,num3,average;
Scanner input = new Scanner (System.in);

System.out.println("enter num1");
num1 =input.nextDouble();

System.out.println("enter num2");
num2 =input.nextDouble();

System.out.println("enter num3");
num3 =input.nextDouble();

average = ((num1+num2+num3)/2);
System.out.println("Average of three no is = " +average);

}
}
