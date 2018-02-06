import java.io.*;
import java.util.*;
class node
{
 int data;
 node next;
}

class stacks1
{  
 static node temp,top=null;
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
public static void empty()
{
 if(top==null)
 System.out.println("yes");
 else
 System.out.println("no");
}
}
class post
{    
 public static void main(String args[])
 {
    Scanner scan=new Scanner(System.in);
	int i,e,a,n,b,t=-1,l;
	String s;
	char c;
	stacks1 r = new stacks1();
	System.out.println("Enter a string /(unary+=@,unary -=#");
	s=scan.nextLine();
	l=s.length();
	for(i=0;i<l;i++)
	{
	 
	 c=s.charAt(i);
	 n=c;
	
	 
	 if(n>=48&&n<=57)
	 {
	  n=n-48;
	  r.push(n);
	 }
	 
	
	
	 if(c=='+'||c=='-'||c=='*'||c=='/')
	 {  
         a=r.pop();
	     b=r.pop();
		 switch(c)
	  {	 
	   case '+':
	    t=a+b;
	    break;
	   case '-':
		t=a-b;
	    break;
       case '*':
		t=a*b;
	    break;
       case '/':
		 t=a/b;
	     break;
	  }
	  r.push(t);
	 }
	 if(c=='@'||c=='#')
	 {
		 a=r.pop();
		 if(c=='@')
		 a++;
         else{a--;}			 
	     r.push(a);
	 }
	
	}
    r.peep();	
   }
  }
	
	
	
 
 
	
