import java.io.*;
import java.util.*;
class fi
{
	public static void main(String args[])
	{
 int a,b,c,n,i;
 Scanner scan = new Scanner(System.in);
 n = scan.nextInt();
 a = 0;
 b = 1;
 c = 1;
 if(n>0)
 System.out.print(a);
 if (n>=2)
 System.out.print(" "+c);	 
 for(i = 3;i<=n;i++)
 {
  c = a+b;
  a = b;
  b = c;
 
  System.out.print(" "+c);
 }
 System.out.println();
	}

}