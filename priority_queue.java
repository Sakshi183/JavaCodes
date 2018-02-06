import java.util.*;
import java.io.*;
class node
{
 int data;
 node next;
}

class queue
{

 Scanner scan=new Scanner(System.in);
 node t=new node();
 node front=new node();
 node rear=new node();
 
 node temp;
 queue()
 {
	 front=null;
	 rear=null;
 }
 public void insert()
 {
	  node n=new node();
	  System.out.println("enter data:");
      int a=scan.nextInt();
      n.data=a;
	  
  if(front==null&&rear==null)
  {
   front=n;
   rear=n;
   n.next=null;
  }
  else
  {
   System.out.println("node added");
   rear.next=n;
   n.next=null;
   rear=n;
  }
 }
 public void traverse()
 {  
	System.out.println("in traverse");
	t=front;
	if(front==null&&rear==null)
	System.out.println("no element");
   else
   {
	while(t!=null)
    {
     System.out.println("data is"+t.data);
     t=t.next;
    } 
   }
 }  
 public node deletion()
 { 
  temp=null;
  if(front==rear)
  System.out.println("no element in queue");
  else
  {
   temp=front;
   front=front.next;
  } 
  return temp;
  
 }
 public void priority()
 {
   node n=new node();
	  System.out.println("enter data:");
      int a=scan.nextInt();
      n.data=a;
	if(front==null&&rear==null)
   {
    front=n;
    rear=n;
    n.next=null;
   }
   else
   {
    temp=rear;
	while(temp.next.data>a)
	{
	 temp=temp.next;
	}
	
	n.next=temp;
	temp=temp.next;
	temp.next=n;
   }
	  
	  
 }
}

class qdriver
{
 public static void main(String args[])
 {
  int n,a,i,k,h=1;
  node t=new node();
  queue q=new queue();
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter no. of elements you want to add");
  n=scan.nextInt();
  for(i=0;i<n;i++)
  {
   
   q.insert();
  }
  q.traverse();
  
 while(h==1) 
 {
  System.out.println("Enter your choices:/n 1.add element/n 2. delete element/n 3.traverse ");
  k=scan.nextInt();
  switch(k)
  {
  case 1:
  System.out.println("enter data:");
  
   q.insert();
   break;
   case 2:
   t=q.deletion();
   break;
   case 3:
   q.traverse();
   }
   System.out.println("do you want to continue/(1/0/)");
   h=scan.nextInt();
  }
 }
}