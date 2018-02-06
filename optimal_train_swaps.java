import java.io.*;
import java.util.*;
class s6
{
 public static void main(String h[])
 {
   
   int i,j,temp,l=0,m,k;
   Scanner scan=new Scanner(System.in);
   m = scan.nextInt();
   for(k=0;k<m;k++)
   {
   int n = scan.nextInt();
   int a[]= new int[n];
   for(i=0;i<n;i++)
   {
    a[i]=scan.nextInt();
   }
   for(i=0;i<n;i++)
   {
    for(j=0;j<n;j++)
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
  
  /*System.out.println("sorted array is:")
   for(i=0;i<10;i++)
   {
	 System.out.println(a[i]);
   }*/
   System.out.println("Optimal train swapping takes "+l+" swaps.");   
 }
} 
}