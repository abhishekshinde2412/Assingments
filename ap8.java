class ap8
{
public static void main(String arg[])
{int k=5,m=0;
    for(int i=1; i<=5; i++)
   {
   for (int l=4;l>=i;l--)
	   {
		  System.out.print(" ") ; 
	   }

      for (int j=1;j<=i; j++)
    {
        System.out.print(" "+k);
		k++;
    }
	m=i+1;
     k-=m;
        System.out.println();
   }

}


}