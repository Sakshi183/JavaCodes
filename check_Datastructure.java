import java.io.*;
import java.util.*;
class p8
{
public static int great( int a[],int n)
{  int g = -1,j=0;
  for(int i = 0; i < n ;i++)
  {
   if(g<a[i])
   {g=a[i]; j=i;}
  }
  a[j]= Integer.MIN_VALUE;
  return g;
}
public static void main(String args[])
{
int i,j,t;
int k=0,l=0;

int n;
int s=0,p=0,q=0,m=1;  
Scanner scan = new Scanner(System.in);
 n = scan.nextInt();
 int a[] = new int[1000];
  int b[] = new int[1000];
 while(scan.hasNext())
 {
  
   for(t = 1;t<=n;t++) //i/p
    {
     
	 j = scan.nextInt();
      if(j==1)
       { a[k]=scan.nextInt(); k++;}
      if(j==2)
       {b[l]=scan.nextInt(); l++;}
   
   
            //q check
     for(i=0,j=0;i<k&&j<l;i++,j++)
    {
    
	 if(a[i]==b[j])
	  q=1;
	 else
     q=0;
    
	
	  if(a[k-1-i]==b[j])
      s=1;
      else 
      s=0;
     }
    for(i = 0;i<k;i++)
    {
	  for(j =0;j<l;j++)
	  {
		  if(b[j]==a[i])
		   m = 0;	  
	  }
	  
    } 
  
   for(i=0,j=0;i<k&&j<l;i++,j++)
   {
    if(b[i]==great(a,k))

    p=1;
	else 
	p=0;
     } 
    }
                   //
  
  for (i=0;i<k;i++)
  {
	  System.out.print(a[i]+" ");
  }
  for( j = 0;j<l;j++)
  {
	  System.out.print("    "+b[j]+" ");
  }

                             
  
  if(q==1)                 
  System.out.println("queue");
  if(s==1&&p==1)
  System.out.println("not sure");
   if(s==1)
  System.out.println("stack");
   if(p==1)
  System.out.println("priority queue");
  if(m==1)
  System.out.println("1.impossible"); 
   if(k==0&&l!=0)
  System.out.println("2.impossible");
   if(l==0)
  System.out.println("not sure");
  
  System.out.println("stack");
  	  
  
  if(t==n+1)
  {  if(scan.hasNext()==false)
	  break;
     else
	 {
	  n = scan.nextInt();
	  t = 1;
	  k = 0;
	  l = 0;
     }
  }
  
}
}
}