import java.util.*;
class node
{
int data;
node next;
}
class linkedList1
{ private static node head=null;
  static node ptr,newptr,temp,prev,curr,ad;
 static node createNode(int v)
 {
  ptr=new node();
  ptr.data=v;
  ptr.next=null;
  System.out.println("node created");
  return ptr;
 }
 static void addFirst(node x)
 {
  if(head==null)
  {
    head=x;
  }
  else
  {
    newptr=head;
	head=x;
	x.next=newptr;
  }
  System.out.println("node added");
  
 }
 static void addNode(node x)
 {
   if(head==null)
   {
     head=x;
   }
   else
   {
    ptr=head;
	while(ptr.next!=null)
	{
  	  ptr=ptr.next;
	}
	temp=ptr;
	temp.next=x;
   }
 }
 static void display()
 
 {
   ptr=head;
	while(ptr!=null)
	{
  	  
	  System.out.println(+ptr.data);
	  ptr=ptr.next;
	}
	
 
}
static void printreverse()
{
 int t=0;
 ptr=head;
 while(ptr!=null)
 { 
  t++;
  ptr=ptr.next;
 }
 for(int j=t;j>=1;j--)
  { 
   ptr=head;
   for(int i=1;i<j;i++)
   {
    ptr=ptr.next; 
   }
   System.out.println(+ptr.data);
  }
}
static void deletion()
{   int j=0,n,i;  
    if(head==null)
	System.out.println("no node is there");	
    else
	{	
	  System.out.println("Enter index to delete");
	  Scanner s=new Scanner(System.in);
	  n= s.nextInt();
	  ptr=head;
	  while(ptr!=null)
	  {
	   ptr=ptr.next;
	   j++;
	  }	 
	  if(j<n)
      System.out.println("no such node exist");	
      if(n==1)
	  head=head.next;	 
      else
 	  {	 
        if(j==n)
	    { ptr=head;
		  for(i=1;i<n-1;i++)
		  {
  			ptr=ptr.next;
		  }
           ptr.next=null;
	    }
	   
	    else
	    { 
        ptr=head;
		prev=ptr;	
	    curr=ptr.next;
	    ad=curr.next;
		
	    for(i=1;i<n-1;i++)
	    {
	     prev=ptr;	
	     curr=ptr.next;
	     ad=curr.next;
	    }
	    prev.next=ad;
	   }
      }
	}
}
}	
class printrev
{
public static void main(String b[])
{
	System.out.println("hello world");
	Scanner scan=new Scanner(System.in);
	int i,e,a;
	System.out.println("enter 5 elemnents");
	for(i=1;i<=5;i++)
	{	
	 System.out.println("enter element");
	 e=scan.nextInt();
	 linkedList1 d=new linkedList1();
	 node z=d.createNode(e);
	 d.addFirst(z);
	}
	linkedList1 h=new linkedList1();
	h.display();
	System.out.println("reverse print");
	h.printreverse();
	
	
	
	
	
}
}

