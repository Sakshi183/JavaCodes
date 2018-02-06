import java.io.*;
import java.util.*;
class Main
{
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
int n=-1,k=-1,t,i,j,s;

while(scan.hasNext())
{
n= scan.nextInt();
k= scan.nextInt();

if(n==0&&k==0)
{System.out.println(n+" "+k);	
	break;
}
int a[] = new int[n];
int m[] = new int[n];
for(i=0;i<n;i++)
{
  a[i] = scan.nextInt();
  m[i] = a[i]%k;
  
}
for(i=0;i<n;i++)
   {
	   s = i;
    for(j=i+1;j<n;j++)
	{
		
	  
	  if(m[i]==m[j])
	 {
	 if(((a[i]%2)!=0)&&((a[j]%2)==0))
	    {
		 
		  t = a[i];
		  a[i] = a[j];
		  a[j] = t;
		 
		}
	}
	if(m[j]<m[s])
	s = j;}
	t = a[s];
	a[s]= a[i];
	a[i] = t;
   }

 /*for(i=0;i<n;i++)
   {
    for(j=1;j<n;j++)
	{
	 */
	 
/*	}
   }
   }*/
   for(i=0;i<n;i++)
{
  System.out.println(a[i]);
  
}
  
   for(i=0;i<n;i++)
   {
    for(j=0;j<n;j++)
	{
	 if(m[i]==m[j])
	 {
	   
	   if((a[i]%2)==0&&(a[j]%2)==0)
	    {
		 if(a[i]<a[j])
		 {
		  t = a[i];
		  a[i] = a[j];
		  a[j] = t;
		 }
		}
		
		 if((a[i]%2)!=0&&(a[j]%2)!=0)
	    {
		 if(a[i]>a[j])
		 {
		  t = a[i];
		  a[i] = a[j];
		  a[j] = t;
		 }
		}
	 }
		
	 }
	 }

System.out.println(n+" "+k);	 
	 
 for(i=0;i<n;i++)
{
  System.out.println(a[i]);
  
}

}
}
}