import java.util.*;
class node
{
int data;
node next;
}
class linkedList1
{ private static node head=null;
  static node ptr,newptr,temp,prev,curr,ad;
  static node prev1,curr1,adv1,prev2,curr2,adv2,lptr;
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
 
 {int t=0;
   ptr=head;
	while(ptr!=null)
	{
  	  t++;
	  System.out.println(+ptr.data);
	  ptr=ptr.next;
	}
	
 
}
static void swapElement()
{
 int g,h,i,j,t=1;
 Scanner scan =new Scanner(System.in);
 System.out.println("enter position1 to swap nodes");
 g=scan.nextInt();
 System.out.println("enter position2 to swap nodes");
 h=scan.nextInt();
 ptr=head;
 System.out.println("g="+g);
 System.out.println("h="+h);
  ptr=head;
	while(ptr.next!=null)
	{ 
      prev=ptr;
	  t++;
	  ptr=ptr.next;
	}
	System.out.println("total is"+t);
	System.out.print(+prev.data);
	System.out.println(+ptr.data);
	lptr=ptr;
  if((h-g)==1)
  {
	  
  }	  
 else
 {
	 if(g==1||h==t)
 {
	 if(g==1&&h==t)
	 {   
		 temp=head;
		 head=lptr;
		 head.next=temp.next;
		 prev.next=temp;
		 temp.next=null;
		 
	 }	 
	 if(g==1&&h!=t)
	 { 
       ptr=head;
       for(i=1;i<h;i++)
	  {
		prev2=ptr;
		curr2=prev2.next;
		adv2=curr2.next;
		ptr=ptr.next;
	  }
	 temp=head;
	 head=curr2;
	 head.next=temp.next;
	 prev2.next=temp;
	 temp.next=adv2;
	}
	if(g!=1&&h==t)
	{
	 ptr=head;
	 for(i=1;i<g;i++)
	 {   
        prev1=ptr;
        curr1=prev1.next;
		adv1=curr1.next;
		ptr=ptr.next;
	 }
	 prev.next=curr1;
	 curr1.next=null;
	 prev1.next=lptr;
	 lptr.next=adv1;
	}	
 }	 
else
{
	ptr=head;
	for(i=1;i<g;i++)
	{   prev1=ptr;
        curr1=prev1.next;
		adv1=curr1.next;
		ptr=ptr.next;
	}
	System.out.println(+curr1.data);
	ptr=head;
	for(i=1;i<h;i++)
	{
		prev2=ptr;
		curr2=prev2.next;
		adv2=curr2.next;
		ptr=ptr.next;
	}
	System.out.println(+curr2.data);
	prev1.next=curr2;
	curr2.next=adv1;
	prev2.next=curr1;
	curr1.next=adv2;
}
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
class Swap
{
public static void main(String b[])
{
	System.out.println("hello world");
	Scanner scan=new Scanner(System.in);
	int i,e,a;
	System.out.println("enter 8 elemnents");
	for(i=1;i<=8;i++)
	{	
	 System.out.println("enter element");
	 e=scan.nextInt();
	 linkedList1 d=new linkedList1();
	 node z=d.createNode(e);
	 d.addFirst(z);
	}
	linkedList1 h=new linkedList1();
	h.display();
	h.swapElement();
	h.display();
	
	
	
}
}
