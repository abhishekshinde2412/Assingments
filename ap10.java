class ap10
{
public static void main(String arg[])
{int m=0;
char ch='E';
    for(int i=1; i<=5; i++)
   {
   for (int l=4;l>=i;l--)
	   {
		  System.out.print(" ") ; 
	   }

      for (int j=1;j<=i; j++)
    {
        System.out.print(" "+ch);
		ch++;
    }
	m=i+1;
     ch-=m;
        System.out.println();
   }

}


}