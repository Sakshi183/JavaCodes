import java.io.IOException;
import java.io.*;
import java.util.*;
class p3
{
 public static long factorial(int n) {
	long fact ;
	if( n == 0 )
     return 1;		
    else if (n==1)
	  return 1;
    else 
	{
	fact =1;
    fact =  factorial( (n-1) )*n;
	return fact;	
	}
	
  }
public static void main(String args[]) throws IOException
{
 int m,n;	
 long a,b,s;
  Scanner scan = new Scanner(System.in);
  while(scan.hasNext())
  {
  m = scan.nextInt();
  n = scan.nextInt();
  a = factorial(m);
  b = factorial(n);
  s = a+b;
  System.out.println(s);
}
}
}