import java.util.*;
import java.io.*;
class node
{
 char c ;
 node left;
 node right;
}
static preindex=0;
class q9
{
 
  int index;
   static int getindex(char [] in, int initial1 ,int final1,char c1)
   { index =0;
     for(i = initial1;i<=final1;i++)
	 {
	    if(pre[i]==c1)
		index =i;
	 }
	 return index;
   }
  
  static node tree(char [] pre,char [] in , int initial,int final )
  {
     int u;
    node r = new node();
	r.left = null;
	r.right = null;
	r.c = pre[preindex++];
	
	if(intial == final)
	{ //preindex++;
	return r;
	}
	else
	{
	u = getindex(in ,initial,final);
	r.left = tree(pre,in ,initial,index-1);
	r.right = tree(pre , in, index+1,final);
	}
  }
   
   void postorder(node r)
   {
	   if(r!=null)
      {    
       
	   postorder(r.left);
       postorder(r.right);
	   System.out.println(r.c);
      }
   }
  
}
  public static void main(String args[])
  {
     node root = new node();
	 p9 t = new p9();
	 char pre [] = {'D','B','A','C','E','G','F'};
	 char in [] = {'A','B','C','D','E','F','G'};
	 root = t.tree(pre[],in[],0,7);
	 t.postorder(root);
  
   }