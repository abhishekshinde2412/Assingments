import java.util.Scanner;
class Assi15
{public static void main (String arg[])
	{
		int num1,num2,swap;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first no " );
		num1=sc.nextInt();
		
		System.out.println("enter secound no " );
		num2=sc.nextInt();
		
		swap=num1;
		num1=num2;
		num2=swap;
		System.out.println("num1 = "+num1+"\nnum2 = " +num2);
	}
	
	
}