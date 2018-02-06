import java.util.*;
class node
{
int data;
node next;
}
class linkedList1
{ 
  static node head=null;
  static node ptr,newptr,temp,prev,curr,ad,nptr,tptr,mptr;
 public static node createNode(int v)
 {
  ptr=new node();
  ptr.data=v;
  ptr.next=null;
  System.out.println("node created");
  return ptr;
 }
 public static void addFirst(node x)
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
 
 public static void addNode(node x)
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
 
 public static void display()
 
 {
   ptr=head;
	while(ptr!=null)
	{
  	  
	  System.out.println(+ptr.data);
	  ptr=ptr.next;
	}
	
 
}

public static void removeDuplicate()
{
  System.out.println("hello");
  int p=1,k,j,h,m=1;
  nptr=head;
 while(nptr!=null)
 {
  j=nptr.data;
  tptr=nptr.next;
  h=m+1;
  while(tptr!=null)
  {
	k=tptr.data;
    if(j==k) 
	{
		deletion(h);
	}
	tptr=tptr.next;
	h++;
  }	
  nptr=nptr.next;
  m++;
 }
}

public static void deletion(int n)
{
	
	int j=0,i;  
    if(head==null)
	System.out.println("no node is there");	
    else
	{	
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
class removeduplicate
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
	h.removeDuplicate();
	h.display();	
 }
}
