import java.io.*;
import java.util.*;
class j1
{
String s,a,b,y,f;
System.out.print("enter string");
int i,l,k=0,p=0,v,g;
int d;
s=scan.nextLine();
char c;
int o =0,m;

char t[] = new char[l];
char u[] = new char[l];


for(i=0;i<l;i++)
{  k=0;
   c= s.charAt(i);
   if((c!='{')&&(o==0))
  { while(charAt(i)!='}')
   {
      t[k++]=s.charAt(i);  
   }
   o=1;
  }
  
  if((c!='{')&&(o==1))
  { 
   p=0;
  while(charAt(i)!='}')
   {
      u[p++]=s.charAt(i);  
   }
   o=0;
  }
   if(c=='+')
   {
     a = a.copyValueOf(t);
	 b = b.copyValueOf(u);
	 y = a.concat(b);
	 f=f.concat(y);
   }
   
   if(c=='-')
  {
    a = a.copyValueOf(t); //v ,m
	b = b.copyValueOf(u);  //j ,g
	m = a.length();
	g = b.length();
	k=0;
	int e=0,count=0;
	for(int j= 0;j<g;j++)
	{ e=0;
	  for( v=0 ; v<m ; v++)
	  {
	   if(b.charAt(j)==a.charAt(v))
	   {e=1;count++;
	    m = m - count;
		for(x=v;x<m-1;x++)
		{
		  
            a.charAt(x) = a.charAt(x+1); 
		
	    }
	   
	   }
	  }
	  }
	  
	  for(x = 0; x < m; x++)
	  {
	    t[k++] = a.charAt(x);
	  }
	  y = y.copyValueOf(t);
	  f = f.concat(y);
	 }
	 
	 if(c=='*')
	   {
    a = a.copyValueOf(t); //v ,m
	b = b.copyValueOf(u);  //j ,g
	m = a.length();
	g = b.length();
	k=0;
	int e=0,count=0;
	for(int j= 0;j<g;j++)
	{ e=0;
	  for( v=0 ; v<m ; v++)
	  {
	   if(b.charAt(j)==a.charAt(v))
	   t[k++] = a.charAt(v);
	  }
	  }
	 
	 y = y.copyValueOf(t);
	 f = f.concat(y);
  }
   
}
}