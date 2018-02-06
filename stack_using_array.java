import java.io.*;
import java.util.*;
class stack
{
 public static void main(String args[])
 {
   int a[]= new int[10];
   int k=1,l,m=1;
   Scanner scan =new Scanner(System.in);
   int top=-1;
   while(m==1)
   {System.out.print("Enter your choice 1.push  2.reaad   3.pop");
    l=scan.nextInt();
   
   switch(l)
   {
	case 1:
    System.out.print("enter elements");
    if(top>10)
    System.out.print("stack overflow");
    else
    {
     while(k==1)
     {
	  a[++top]=scan.nextInt();
	  System.out.print("do you want to continue");
	  k=scan.nextInt();
	 }
    }
	break;
	
    case 2:
    if(top==-1)
    System.out.print("no elements");
    else
    {
     for(int i=top;i>=0;i--)
	 {
	  System.out.println(a[i]);
	 }
    }
	break;
	
    case 3:
    if(top==-1)
    System.out.print("stack underflow");
    else
    {
      top--;
    }
   }
   
    System.out.print("do you want to continue");
    m=scan.nextInt();
   }
 }
}
   
	
   
	
	
    