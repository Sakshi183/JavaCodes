import java.io.*;
import java.util.*;
class node
{
 int data;
 node left;
 node right;
}

class tree1
{
 Scanner scan=new Scanner(System.in);

 node root = new node();

 int t;
  
  tree1()
 {
	 root=null;
 }
 
 public void insert()
 { 
 
  int flag=0;	 
  node n =new node();
  node curr = new node();
  node p=new node();

  System.out.print("Enter data");
  t=scan.nextInt();
  n.data=t;
  n.left=null;
  n.right=null;
  if(root==null)
  {
	  root=n;
	   n.left=null;
       n.right=null;
	  
  }
   else
	  
   {  
    
	curr=root;
      
      p=root;
	   while(flag==0)
	   {
		   
		   if(n.data<curr.data)
           {   
	           
			   p=curr;
			   curr=curr.left;
			   if(curr==null)
			   {
				  p.left=n;
                  flag=1;	
                
			   }	   
		   }			 
           else
           { 
	           
			   p=curr;
			   curr=curr.right;
			   if(curr==null)
			   {
				   p.right=n;
				   flag=1;
				   
			   }
		   }			   
	   }
    }	
 }

 public void inorder(node r)
 { 
  
  if(r!=null)
  {   System.out.println("in inorder");
      inorder(r.left);
      System.out.println(r.data);
      inorder(r.right);
  }
 }
 public void preorder(node r)
 { 
  
  if(r!=null)
  {    
       System.out.println(r.data);
	   preorder(r.left);
       preorder(r.right);
  }
 }
  public void postorder(node r)
 { 
  
  if(r!=null)
  {    
       
	   postorder(r.left);
       postorder(r.right);
	   System.out.println(r.data);
  }
 }
 public void deletion(int d)
 {  int g=-1;
    node curr=new node();
	node p=new node();
    curr=root;
	int flag=0;
      System.out.println("in delete function");
      p=root;
	   while(flag==0)
	   {
		   
		   if(d<curr.data)
           {   
	           
			   p=curr;
			   curr=curr.left;
			   g=0;   
		   }			 
           else if(d>curr.data)
           { 
	           
			   p=curr;
			   curr=curr.right;
			   g=1;
		    } 
           else if(d==curr.data)	
          	{
			  flag=1;
			}	  
       }
	   System.out.println("data is:"+curr.data);
	
        if(curr.left==null&&curr.right==null)
		{
			if(g==-1)
			root=null;
      		else if(g==0)
			{
				p.left=null;
			}
			else if(g==1)
			{
				p.right=null;
			}
			
		}
		else if(curr.left==null)
		{
			if(g==0)
			 p.left=curr.right;
		     
			if(g==1)
				p.right=curr.right;
			
		}
		else if(curr.right==null) 
		{
			if(g==0)
			p.left=curr.left;
		    if(g==1)
			p.right=curr.left;
		}
           
        else if(curr.left!=null&&curr.right!=null)
           {  
			  node parent =new node();
			  node lc=new node();
			  node rc=new node();
			  parent=p;
			  lc=curr.left;
			  rc=curr.right; 
              p=curr;

			  curr=curr.left;
			 
			  while(curr.right!=null)
			  { 
		        p=curr;
				curr=curr.right;
			  }
			 if(g==0)
			 { parent.left=null;
		     p.right=null;
			 parent.left=curr;
			 curr.left=lc;
			 curr.right=rc;
			 }
		     else
			 {parent.right=null;
		       p.right=null;
			 parent.right=curr;
			 curr.left=lc;
			 curr.right=rc;
			 } 
           		 

	   }
}
}

class t2 
{
	public static void main(String args[])
	{
     Scanner scan=new Scanner(System.in);
	 int i;
     tree1 t=new tree1();
     System.out.println("Enter no. of nodes you want to enter");
	 int k=scan.nextInt();
	 for(i=0;i<k;i++)
	 {
		 t.insert();
	 }
	 t.inorder(t.root);
	 System.out.println("Enter data to delete node ");
	 int n=scan.nextInt();
	 t.deletion(n);
	 t.inorder(t.root);
	 
	} 
}
