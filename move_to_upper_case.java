import java.util.*;
import java.io.*;
class s4
{
	public static void main (String args[])
{
 int n,a,i,j;
 Scanner scan= new Scanner(System.in);
 int l = scan.nextInt();
 String s ;
 for (j=1;j<=l;j++)
  { //scan.next();
    s = scan.next();
	a = scan.nextInt();
  int d;
  n = s.length();
  for( i = 0;i<n;i++)
  {
	  d = s.charAt(i);
	  
	  d = d-a;
	  if(d<65)	 
	  d = d+26;
  
      System.out.print((char)d);	  
  }
  System.out.println();
}
}
}
  
