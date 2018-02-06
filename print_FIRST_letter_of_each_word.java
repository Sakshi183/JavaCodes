import java.io.*;
import java.util.*;
class k1
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
    int i , l , n ,j,d;
	n = scan.nextInt();
	
	String s;
	 scan.nextLine();
	for(i = 0; i<n;i++)
	{
      s = scan.nextLine();
	  
	
	 l = s.length();
	 d = s.charAt(0);
	 //System.out.println("char:"+d);
	 // System.out.print(s.charAt(1));
	 if((97<=d)&&(d<=122))
	 System.out.print(s.charAt(0));
   	 for(j=1;j<l;j++)
	 { 
       d = s.charAt(j);
	   if(s.charAt(j-1)==' ')
	   {
		  if((97<=d)&&(d<=122))
	   {
	    System.out.print(s.charAt(j));
	   }
	  }
	 }
	 System.out.println();
	j=1;
	}
}
}