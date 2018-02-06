import java.io.*;
import java.util.*;
class bubble
{
 public static void main(String h[])
 {
   
   int i,j,min,m,temp,l=0;
   Scanner scan=new Scanner(System.in);
   int n = scan.nextInt();
   int a[]= new int[n];
   //System.out.println("enter 10 elements");
   for(i=0;i<n;i++)
   {
    a[i]=scan.nextInt();
   }
   for(i=0;i<n;i++)
   {
    for(j=1;j<n;j++)
	{
	  if(a[i]<a[j])
	  {
		  l++;
	  temp=a[i];
	  a[i]=a[j];
	  a[j]=temp;
	  
	  }
	}
   }
  
 /* System.out.println("sorted array is:");
   for(i=0;i<10;i++)
   {
	 System.out.println(a[i]);
   }*/
System.out.println("SWAPS:"+l);   
 }
} 