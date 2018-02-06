import java.util.*;
import java.io.*;
class node
{
 char c ;
 node left;
 node right;
 node(char d)
 {
	 c=d;
 }
}

class Main
{Scanner scan = new Scanner(System.in);
 static int preindex=0;
  int index,i;
   public int getindex(char[] in, int initial1 ,int final1,char c1)
   { index =0;
     for(i = initial1;i<=final1;i++)
	 {
	    if(in[i]==c1)
		index =i;
	 }
	 return index;
   }
  
  public node tree(char[] pre,char[] in, int initial ,int finall )
  {   
     int u;
	 if(initial>finall)
		return null;
    node r = new node(pre[preindex++]);
	r.left = null;
	r.right = null;
	if(initial == finall)
	  return r;
	
	u = getindex(in ,initial,finall,r.c);
	r.left = tree(pre,in ,initial,u-1);
	r.right = tree(pre , in, u+1,finall);
	 return r;
	
  }
   
   public void postorder(node r)
   {
	   if(r!=null)
      {    
       
	   postorder(r.left);
       postorder(r.right);
	   System.out.print(r.c);
      }
   }
  


  public static void main(String args[])
  {
     node root ;
	 int l,i;
	 Scanner scan = new Scanner(System.in);
	 Main t = new Main();
	  while(scan.hasNext())
	  {
		String ini,prei;
		prei=scan.next();
		ini=scan.next();
		l = prei.length();
		
		//System.out.println(n);
		char in1[] = new char[l];
        char pre1[] = new char[l];
		
		for( i=0;i<l;i++)
		{
			in1[i]=ini.charAt(i);
		}
	
        for( i=0;i<l;i++)
		{	
	     
		 pre1[i]=prei.charAt(i);
		
		}
	 root = t.tree( pre1, in1 , 0 ,l-1);
	 t.postorder(root);
	 System.out.println();
     preindex=0;
   }
  }
}
  