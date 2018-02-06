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
    node l = new node();
	l=root;
      node p=new node();
      p=root;
	   while(flag==0)
	   {
		   
		   if(n.data<l.data)
           {   
	           System.out.println("hello");
			   p=l;
			   l=l.left;
			   if(l==null)
			   {
				  p.left=n;
                  flag=1;	
                
			   }	   
		   }			 
           else
           { 
	           System.out.println("hello");
			   p=l;
			   l=l.right;
			   if(l==null)
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
}

class tree 
{
	public static void main(String args[])
	{
    
     tree1 t=new tree1();
     t.insert();
     t.insert();
     t.insert();
	 t.inorder(t.root);
	 
	} 
}
