import java.io.*;
import java.util.*;
class array
{
 public static void main(String h[])
{
 int a[]=new int [10];
 int i;
 Scanner scan=new Scanner(System.in);
 
 System.out.println("enter 10 elements");
 for(i=0;i<10;i++)
 { 
  a[i]=scan.nextInt();
 }
 System.out.println("Enter element to search");
 int n=scan.nextInt();
 for(i=0;i<10;i++)
 {
  if(n==a[i])
  {
   System.out.println("Element is found at:"+(i+1));
   break;
  }
 }
}
}