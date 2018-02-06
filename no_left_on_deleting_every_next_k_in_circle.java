import java.io.*;
import java.util.*;
class node
{
  int data;
  node next;
  node(int d,node n)
{
  data = d;
  next = n;
}
  
}
class s1
{  
static node head = new node(-1,null);
  // head = null;
static node ptr = new node(-1,null);
static node tptr = new node(-1,null);


public static void main(String args[])
   {
   
    
   Scanner scan = new Scanner(System.in);
   int n,k,i,j;
   System.out.println("Enter n");
   n = scan.nextInt();
   System.out.println("Enter k");
   k = scan.nextInt();
   for( i = 1; i <= n;i++)
   {
     insertion();
   }
     display();
    j=0;
   node t = new node(-1,null);
    t = head;
   while(count()!=1)
   {
      for(i=1;i<k;i++)
       t= t.next;
     
      deletion(t,k);
      
      display();
   }
    System.out.print("no. left");
     display();
   }

   public static void insertion()
   {
    Scanner scan = new Scanner(System.in);
    int d;
    System.out.println("Enter no.");
    d = scan.nextInt();
    
     node t = new node(d,null);
   
    if(head==null)
    {
    head =t;
    }
  
   
   else if(head.next==null)
    {
     
      head.next = t;
      t.next = head;
    }
    else 
    {
     ptr = head;
     while(ptr.next!=head)
     {
       ptr=ptr.next;
      }
      ptr.next = t;
      t.next = head;
     }
 
  }
 
  public static void deletion(node y,int s)
  { System.out.print("HELLO:");
   ptr = y;
   tptr = ptr.next;
   for(int i=1;i<s-1;i++)
   tptr= ptr.next;
   if(tptr.next==head)
    {head = tptr.next.next;
    tptr.next = head;
    }
    else{
    ptr.next = tptr.next;}
    System.out.print("HELLO:");
  }

  public static void display()
  {
    ptr = head;
   if(head == null)
   System.out.println("no node");
   else if (ptr.next==null)
   System.out.println(ptr.data);
   else
   {
     while(ptr.next!=head)
     {
       ptr = ptr.next;
       System.out.println(ptr.data);
     }
   }
  }
public static int count()
 { int l = 0;
   ptr = head;
   if(ptr==null)
   return 0;
   else if (ptr.next==null)
    return 1;
  else
  {
   ptr = head;
   while(ptr.next!=head)
   {
    l++;
    ptr = ptr.next;
   }
    return l;
   }
 }
   
} 

