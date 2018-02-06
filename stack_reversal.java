import java.io.*;
import java.util.*;
class node
{
 int data;
 node next;
}

class stacks1
{  
 static node temp,top=null,top1=null;
 int i,j,t;
 public static void push(int k)
{ 
  node t=new node();
  t.data=k;
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
public static void push1(int k)
{ 
  node t=new node();
  t.data=k;
  if(top1==null)
  {
   top1=t;
  }
  else
  {
   temp=top1;
   t.next=temp;
   top1=t;
  }
}
public static int pop()
{ int k=-1;
 if(top==null)
 {
 System.out.print("stack underflow");
 }
 else
 {
  k=top.data;	 
  top=top.next;
 }
 return k;
}
 public static void peep()
{ 
 temp=top;
 while(temp!=null)
 { 
  System.out.println(+temp.data);
  temp=temp.next;
 }
 
}
public static void peep1()
{ 
 temp=top1;
 while(temp!=null)
 { 
  System.out.println(+temp.data);
  temp=temp.next;
 }
 
}
public static void empty()
{
 if(top==null)
 System.out.println("yes");
 else
 System.out.println("no");
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
}
class srev2
{    
 public static void main(String args[])
 {
    Scanner scan=new Scanner(System.in);
	int i,e,a;
	System.out.println("enter no. of elemnents");
  a = scan.nextInt();
  stacks1 s = new stacks1();
  stacks1 n=new stacks1();
  for(i=0;i<a;i++)
  {
   System.out.println("enter element");
   e = scan.nextInt();
   s.push(e); 
  }	 
  s.peep();
  System.out.println("enter no. of elements you want to pop");
  a=s.total();
  for(i=0;i<a;i++)
  {	  
   e=s.pop();
   System.out.println("deletion from s:"+e);
   n.push1(e);
  }
  System.out.println("now stack contains");
  n.peep1();
 } 
}
