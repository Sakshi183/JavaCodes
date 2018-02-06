import java.io.*;
import java.util.*;
class sel
{
 public static void main(String h[])
 {
   int a[]= new int[10];
   int i,j,min,m,temp;
   Scanner scan=new Scanner(System.in);
   System.out.println("enter 10 elements");
   for(i=0;i<10;i++)
   {
    a[i]=scan.nextInt();
   }
   for(i=0;i<10;i++)
   {
    
	 m=i;
	 for(j=i;j<10;j++)
	 {
	  if(a[j]<=a[i])
	   m=j;
	 }
	 temp=a[i];
	 a[i]=a[m];
	 a[m]=temp;
	}
   for(i=0;i<10;i++)
   {
     System.out.println("sorted array is:");
	 System.out.println(a[i]);
   }  
 }
}