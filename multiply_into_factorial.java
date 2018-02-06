import java.io.*;
import java.util.*;
class p7
{
 public static int factorial(int n) {
	int f;	
    int fact = 1 ;
    if (n==1)
	 return 1;
     else
	 {
	 fact =  factorial( (n-1) )*n;
     return fact;	
	 }
}

public static void main(String args[])
{
  int n,i=1,d,sum=0;
  Scanner scan = new Scanner(System.in);
  String s = scan.next();
  
	  
  while(i <= s.length()&&s.charAt(0)!='0')
  {   int m;
	  int l = s.length();
	  m = l - i ;
   d = s.charAt(m);
   d = d - 48;
   sum = sum + d*factorial(i);
   i++;
   
   if((i-1)==s.length())
   {
	 System.out.println(sum);	
     s = scan.next();
     i = 1;
     sum = 0;	 
    }
  }
  
}
}
