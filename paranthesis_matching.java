import java.io.*;
import java.util.*;
class node
{
 int data;
 char ch;
 node next;
}

class stacks1
{  
 static node temp,top=null;
 int i,j,t,t1;
 public static void push(int k,char c)
{ 
  node t=new node();
  t.data=k;
  t.ch=c;
  if(top==null)
  {
   top=t;
  }
  else
  {
   temp=top;
   t.next=temp;
   top=t;
  }
}
public static void pop()
{ temp=null;
char d='1';
 if(top==null)
 {
 System.out.print("stack underflow");
 }
 else
 {
  temp=top; 
  top=top.next;
  System.out.println(+temp.data);
   
  d=temp.ch;
  System.out.println(d); 
 }

}
public static char rt()
{
	char d='1';
 if(top==null)
 {
 System.out.print("stack underflow");
 }
 else
 {
	d=top.ch; 
 }
 return d;
}

 public static void peep()
{ 
 temp=top;
 while(temp!=null)
 {
  System.out.println(+temp.data);
  System.out.println(temp.ch);
  temp=temp.next;
 }
 
}
public static int total()
{ int t1=0;
	temp=top;
	while(temp!=null)
	{
		t1++;
		temp=temp.next;
	}
	return t1;
}
public static void empty()
{
 if(top==null)
 System.out.println("yes");
 else
 System.out.println("no");
}
}
class para
{    
 public static void main(String args[])
 {
    Scanner scan=new Scanner(System.in);
	String s ;
	stacks1 r=new stacks1();
	char c,f;
	int i,j,in=0,out=0,n1;
	node n=new node();
	
	System.out.println("enter a string");
    s=scan.nextLine();
	n1=s.length();
	System.out.println("length of string is:"+n1);
   for(i=0;i<n1;i++)
   {
     c=s.charAt(i);
	 
	 if(c=='('||c=='{'||c=='[')
	 {
	  r.push(i,c);
	  System.out.println("in");
	  in++;
	 }
	
	 if(c==']'&&r.rt()=='['||c==')'&&r.rt()=='('||c=='}'&&r.rt()=='{')
	 {	  	  

	  out++;
	  System.out.println("out");
	  r.pop();
	  
	 }
   }
   j=r.total();
   if(j==0)
   System.out.println("yes they do match");
   else
   {
	System.out.println("no they do not match");   
   }	   
   
 } 
}
