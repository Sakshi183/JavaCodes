import java.util.*;
import java.io.*;
class node
{
  int data;
  node left;
  node right;
  node(int d)
  {
   data =d;
   left=null;
   right=null;
  }
}
class n1
{public static int x =0;
 public static int n=1;

 public static int check =0;
 public static int m=0;
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);

int c = 1;
int r,l;
n = scan.nextInt();
m = scan.nextInt();
while(m!=0&&n!=0)
{

if(m>=100||m==1)
{
	System.out.println("Let me try!");
}
else
{
node root = new node(1);
root.data = 1;
func(root,3);
if(check==1)
{
	System.out.println("Let me try!");
}
else
{
	System.out.println("Don't make fun of me!");
}

}

n = scan.nextInt();
m = scan.nextInt();
check=0;
}
}
public static void func(node temp,int t)
{ 
  
 
  if(temp!=null)
  {
	  int r = temp.data + t;
      int l = temp.data  - t;

   
  System.out.println("RIGHT DATA IS:"+r+"LEFT DATA IS:"+l);
   if(r==m||l==m)
   { check=1;
     System.out.println("YES>>>>>>>>>>>>>");
    }
  if(r<=n)
 {
  node y = new node(r);
  temp.right = y;
  }
  if(l>=1)
  {
   node z = new node(l);
   temp.left  = z;
  
  }
  if(check==1)
	  return;
  
  func(temp.left,t+2);
  func(temp.right,t+2);
}
  
 
}


}