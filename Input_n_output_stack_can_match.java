import java.io.*;
import java.util.*;
class q1
{ 
      public static void main(String args[])
      {int i =0,t=0;
        Scanner scan = new Scanner(System.in);
        Stack<Character> s = new Stack<Character>();
        String a = new String();
        String b = new String();
        char c;
        a = scan.nextLine();
        b = scan.nextLine();
        int j=0,k=0,f=0;
        int l =  a.length();
        System.out.print("charAt(0)"+a.charAt(0));
        System.out.print("charAt(0)"+b.charAt(0));
        while(j<l)
        { 
        while(i<=a.length()-1)
        { 
          
		  //System.out.println("\n a="+i);
		 // System.out.println("b="+j);
          while( b.charAt(j)!=a.charAt(i)&&j<l&&t==0)
		  {
		  
			  
			 //System.out.println("j=in"+j);
            System.out.println("in:"+a.charAt(i));
            s.push(a.charAt(i));
            i++; 
			
           //System.out.println("j=out"+j); 
		   //System.out.println("i out ="+i);
		   
          if(j==l-1||i==l)
			  
			  {t =1;break;}
		  
		  } 
          k=i;		  
		  
			 
		  j++;
		  /*if(i<l)
		  {s.push(a.charAt(k));
		  System.out.print("in:"+a.charAt(k));}*/
		  // i++;
		  //System.out.println("a="+i);
		  //System.out.println("b="+j);
		  k=j;
          //System.out.print("out needed"+s.peek());
           c = s.peek();

         while((c==b.charAt(f))&&(s.empty()==false)&&f<l)
         {
			 
			 //System.out.print("out needed"+s.peek());
          f++;
          System.out.print("\n out");
		  System.out.print(s.peek());
          s.pop(); 
		  System.out.print("wtf:"+f);
		  if(s.empty()==false)
		  c=s.peek();
	      if(f==l)
			  break;
         }
         
        
		 // System.out.println("i out finally: ="+i);
		  
		 }
		 if(i==l)
			 break;
		}
		
		
		
         
         if(s.empty()==true)
         System.out.println("yes");
         else
         System.out.println("no");
      }
}
