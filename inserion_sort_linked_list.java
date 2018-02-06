import java.util.*;
class node
{
int data;
node next;
}
class linkedList1
{ 
  static node head=null;
  static node ptr,adv,newptr,temp,prev,curr,ad,nptr,tptr,mptr;
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
public static void Addpos(int n,node z)
{ 
 if(n==1)
 {
  temp=head;
  z.next=temp;
  head=z;
  
 }
 else
 {
  prev=head;
  curr=head.next;
  for(int i=1;i<n-1;i++)
  {
    prev=prev.next;
	curr=prev.next;
  }
  prev.next=z;
  z.next=curr;
 }
}
 public static void insertionSort()
 { int p,q,i,j,h,m=1;
  prev=head;
  curr=head.next;
  adv=head;
  while(prev!=null)
  {
   h=m;
   while(curr!=null)
  {
   p=prev.data;
   q=curr.data;
   if(q<p)
   {
    adv=curr;
   }
   curr=curr.next;
   h++;
  }
  deletion(h);
  Addpos(m,adv);
  prev=prev.next;
  m++;
  }
}	
}
class sort
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
	h.insertionSort();
	h.display();
 }
}
