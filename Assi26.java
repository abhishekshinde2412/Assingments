import java.util.Scanner;
class Assi26
{
public static void main(String args[])
{
int num1,num2,add,sub,div,multi,mod;
Scanner input = new Scanner (System.in);

System.out.println("enter num1");
num1 =input.nextInt();

System.out.println("enter num2");
num2 =input.nextInt();

add = num1+num2;
System.out.println("addition of two no is = " +add);

sub = num1-num2;
System.out.println("sub of two no is = " +sub);

div = num1/num2;
System.out.println("division of two no is = " +div);

multi = num1*num2;
System.out.println("multiplication of two no is = " +multi);

mod = num1%num2;
System.out.println("mod(reminder) of two no is = " +mod);


}
}
