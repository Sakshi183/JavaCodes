import java.lang.*;
import java.util.Formatter;
import java.io.IOException;	
import java.util.*;

public class Main {
	
	public static void main(String [] args)
	{
       Scanner sn=new Scanner(System.in);
	   while(sn.hasNext()){
       int n=sn.nextInt();
	   int a[]=new int[n];
	   int b[]=new int[n];
	   int st[]=new int[n];
	   int qt[]=new int[n];
	   int pqt[]=new int[n];
	   
	   for(int i=0;i<n;i++)
	   {
		   a[i]=sn.nextInt();
		   b[i]=sn.nextInt();
	   }
	   Stack s=new Stack();
	   PriorityQueue pq=new PriorityQueue();
	   Queue<Integer> q = new ArrayDeque<Integer>();
	   
	   for(int j=0;j<n;j++)
	   {
		   if(a[j]==1)
		   {
			   s.push(b[j]);
			   st[j]=b[j];
		   }
		   else if(a[j]==2)
		   {
			   st[j]=(int)s.peek();
			   s.pop();
		   }
	   }
	   int sf=1;
	   for(int k=0;k<n;k++)
	   {
		   if(b[k]!=st[k])
		   {
			   sf=0;
			   break;
		   }
			   
	   }
	   
	   
	   
	   for(int j=0;j<n;j++)
	   {
		   if(a[j]==1)
		   {
			   q.add(b[j]);
			   qt[j]=b[j];
		   }
		   else if(a[j]==2)
		   {
			   qt[j]=(int)q.poll();
			   
		   }
	   }
	   int qf=1;
	   for(int k=0;k<n;k++)
	   {
		   if(b[k]!=qt[k])
		   {
			   qf=0;
			   break;
		   }
			   
	   }
	   
	   
	   
	   for(int j=0;j<n;j++)
	   {
		   if(a[j]==1)
		   {
			   pq.add(-b[j]);
			   pqt[j]=-b[j];
		   }
		   else if(a[j]==2)
		   {
			   pqt[j]=(int)pq.poll();
			   
			   
		   }
	   }
	   int pqf=1;
	   for(int m=0;m<n;m++)
	   
	   for(int k=0;k<n;k++)
	   {
		   if(b[k]!=-pqt[k])
		   {
			   pqf=0;
			   break;
		   }
			   
	   }
	   
	   
	   
	   int sum=sf+qf+pqf;
	   if(sum==0)
		   System.out.printf("impossible\n");
	   else if(sum==1)
	   {
		   
		   if(sf==1)
			   System.out.printf("stack\n");
		   else if(qf==1)
			   System.out.printf("queue\n");
		   else
			   System.out.printf("priority queue\n");
	   }
	   else 
		   System.out.printf("not sure\n");
	   }
	}
}
	   
	   
	   