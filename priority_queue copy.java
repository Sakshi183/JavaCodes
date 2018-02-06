import java.util.Scanner;

class queue
{
 class node
 {
  int info;
  node link;
 }
 node First=null;
 
 public void addQue(int t)
 {
  node extra=new node();
  extra.info=t;
  extra.link=null;
  if(First==null)
  {
   First=extra;
  }
  else if(First.link==null)
  {
   if(First.info<t)
   {
	First.link=extra;
   }
	else
	{
	 extra.link=First;
	 First=extra;
	}
   }
   else
   {
    node prev=First;
	node curr=First.link;
	int s=0;
	if(t<prev.info)
	{
	 extra.link=First;
	 First=extra;
	 s++;
	}
	else
	{
	 while(curr!=null)
	 {
	  if(prev.info<t && t<curr.info)
	  {
	   prev.link=extra;
	   extra.link=curr;
	   s++;
	   break;
	  }
	  prev=prev.link;
	  curr=curr.link;
     }
	 if(s==0)
	 {
	  if(prev.info<t)
	  {
	   prev.link=extra;
	  }
	 }
    }
   }
  }
	
	public int delQue()
	{
	 int t=-1;
	 if(First!=null)
	 {
	  t=First.info;
	  First=First.link;
	 }
     else if(First==null)
	 {
	  System.out.println("The queue is empty");
	 }
	 return t;
	}
	
	public void Isempty()
	{
	 if(First==null)
	 {
	  System.out.println("The queue is empty");
	 }
	 else
	 {
	  System.out.println("The Queue is not empty ");
	 }
	}
	
	public void disQue()
	{
	 node x=First;
	 while(x!=null)
	 {
	  System.out.print("<--"+x.info);
	  x=x.link;
	 }
	 System.out.println();
	}
}


class queue1
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	queue que=new queue();
	int ch=0;
	do
	{
	 System.out.println("Enter 1 to adding to queue");
	 System.out.println("Enter 2 to deleting in queue");
	 System.out.println("Enter 3 to display priority queue");
	 System.out.println("Enter 4 to know whether the queue is empty");
	 System.out.println("Enter 5 to exit");
	 ch=scan.nextInt();
	 switch(ch)
	 {
	  case 1:System.out.println("Enter the number");
			 int num=scan.nextInt();
			 que.addQue(num);
			 break;
				
	  case 2:que.delQue();
			 break;
						
	  case 3:que.disQue();
			 break;
						
	  case 4:que.Isempty();
			 break;
						
     }
    }while(ch<5);
   }
}