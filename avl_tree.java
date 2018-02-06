import java.util.*; 

class Node 
{
 
    int root, height;
    Node left, right;
 
    Node(int d)
	{
        root = d;
        height = 1;
    }
}

public class avla
{
	public static void main(String arg[])
  {
     AVLT obj=new AVLT();
	 
     int f=1;
	 while(f==1)
	 {
	    int ch;
		
		System.out.println("     MENU      \n1: INSERT \n2:  INORDER\n3:  PREORDER\n4:  POSTORDER\n5:  HEIGHT\n Enter your choice\n");
		Scanner scan=new Scanner(System.in);
		ch=scan.nextInt();
	    switch(ch)
		{
		  case 1: System.out.println("\nEnter elements");
		           int no=scan.nextInt();
				  obj.rt1=obj.insert(obj.rt1,no);
                 break;
          case 2: 
		         obj.inOrder(obj.rt1);
                 break;
          case 3: obj.preOrder(obj.rt1);
                 break;
          case 4: obj.postOrder(obj.rt1);
                  break;
          case 5:int h=obj.height(obj.rt1);
                 System.out.println("HEIGHT of TREE::  "+h);		 
		}
		System.out.println("\nWANT to CONT....press 1 if yes");
		f=scan.nextInt();
	 }
  }
}
 
class AVLT 
{
 
     Node rt1;
    
	int height(Node N)
	{
        if (N == null)
		{
            return 0;
        }
        return N.height;
    }
 
    
    int max(int a, int b)
	{    if (a > b) 
			return a; 
	    else 
			return b;
    }
 
    Node rightRotate(Node y) 
	{
        Node x = y.left;
        Node T2 = x.right;
 
        // Perform rotation
        x.right = y;
        y.left = T2;
 
        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
 
        // Return new rt1
        return x;
    }
 
   
   
    Node leftRotate(Node x) 
	{
        Node y = x.right;
        Node T2 = y.left;
 
        // Perform rotation
        y.left = x;
        x.right = T2;
 
        //  Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
 
        // Return new rt1
        return y;
    }
 
    // Get Balance factor of node N
    int BalFac(Node N) {
        if (N == null) {
            return 0;
        }
        return (height(N.left) - height(N.right));
    }
   Node insert(Node node, int root) 
	{
         
        /* 1.  Perform the normal BST rotation */
        if (node == null) 
		    return (new Node(root));
         
        if (root < node.root) 
		    node.left = insert(node.left, root);
         
		else
		    node.right = insert(node.right, root);
        
         /* 2. Update height of this ancestor node */
        node.height = max(height(node.left), height(node.right)) + 1;
 
        /* 3. Get the balance factor of this ancestor node to check whether
         this node became unbalanced */
        int balance = BalFac(node);
 
        // If this node becomes unbalanced, then there are 4 cases
        // Left Left Case
        if (balance > 1 && root < node.left.root) {
            return rightRotate(node);
        }
 
        // Right Right Case
        if (balance < -1 && root > node.right.root) {
            return leftRotate(node);
        }
 
        // Left Right Case
        if (balance > 1 && root > node.left.root) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
 
        // Right Left Case
        if (balance < -1 && root < node.right.root) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
 
        /* return the (unchanged) node pointer */
        return node;
    }
 
    
    void preOrder(Node node)
	{
        if (node != null) 
		{
            System.out.print(node.root + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
	}
		

	void postOrder(Node node)
	{
            if (node != null) 
			{
            
            preOrder(node.left);
            preOrder(node.right);
			System.out.print(node.root + " ");
            }
	}
		
  void inOrder(Node node)
 {
          if (node != null)
    		{
            preOrder(node.left);
			System.out.print(node.root + " ");
            preOrder(node.right);
            }
   }
}
 