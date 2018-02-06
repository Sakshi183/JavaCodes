import java.util.*;
import java.io.*;
class q3
{
  public static void main(String args[])
  {
     Scanner scan = new Scanner(System.in);
     int m = scan.nextInt();
     int n = scan.nextInt();
	 int i,j,k,small=0;
	 int ca [] = new int [m];
	 int t [] = new int [m];
	 int cl [] = new int [n];
     for(i=0;i<m;i++)
	 {
		// System.out.print()
		ca[i]=scan.nextInt();
		
	 }
	 for(i=0;i<n;i++)
	 {
	    cl[i]=scan.nextInt();
	 }
	 // sort(t);
	 
	     
		j=0;
		
		  for(k=0;k<n;k++)
		  { 
	        small = 0;
		   for(i=0;i<m;i++)
		   { 
			 
				 if(t[i]<t[small])
					 small = i; 
		   }
		  
		   int add = cl[k]*ca[small];
		   //System.out.println("added:"+add);
		   t[small] = t[small] + add;
		   
		  }
		  
		Arrays.sort(t);
		
	 System.out.println(t[m-1]);
	 
  }
}