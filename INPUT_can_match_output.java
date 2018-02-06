import java.io.*;
import java.util.*;
class q2
{ 
      public static void main(String args[])throws IOException 
      {  Scanner scan = new Scanner(System.in);
	     int l= scan.nextInt();
		 DataInputStream in =new DataInputStream(System.in);
		  while(l!=0)
		  {int i =0,t=0,flag =0;
	   
	  
        
		//l = scan.nextInt();
		scan.nextLine();
        Stack<Character> s = new Stack<Character>();
        char a[] = new char[l];
        char b[]= new char[l];
        char c=' ';
		for(i=0;i<l;i++)
		{
			
        a[i] = scan.next().charAt(0);
		}
		
        for(i=0;i<l;i++)
		{
        b[i] = scan.next().charAt(0);
		}
        int j=0,k=0,f=0;
		i=0;
        
        //System.out.print("charAt(0)"+a.charAt(0));
       // System.out.print("charAt(0)"+b.charAt(0));
        while(j<l&&l!=0)
        { 
        while(i<=l-1)
        { 
          t=0;
		  //System.out.println("\n i="+i);
			//System.out.println("j  ="+j);
			while( b[j]!=a[i]&&j<l&&t==0)
			{
		        //System.out.println("in:"+a[i]);
				System.out.print("I");
				s.push(a[i]);
                t=1;
                			 
				i++; 
				//flag = 1;
		        //System.out.println("j=out"+j); 
				//System.out.println("i out ="+i);
	   
				if(j==l-1||i==l)
			  
				{t =1;break;}
		  
			}
			//if(t==1)
				//j++;
            if(j<l&&i<l)
			{				
			 if(b[j]==a[i])

			 { //System.out.println("in:"+a[i]);
				System.out.print("I");
				s.push(a[i]);
		        i++;
				j++;
				
			}}
			
           if(s.empty()==false)
           {c = s.peek();}
          // System.out.println("HI TO OUTPUT="+c);}
          while((c==b[f])&&(s.empty()==false)&&f<l)
          {  
			f++;
			System.out.print("R");
			s.pop(); 
		
			if(s.empty()==false)
			c=s.peek();
            j=f;
			if(f==l)
			  break;
			}
			
         //System.out.println("F"+f);
        
		 // System.out.println("i out finally: ="+i);
		  if(j==l)
				break;
		 }
		 if(i==l)
		break;
		}

         //System.out.println("F"+f);
		/* while((c==b[f])&&(s.empty()==false)&&f<l)
          {
			f++;
			System.out.print("R");
			s.pop(); 
		
			if(s.empty()==false)
			c=s.peek();

			if(f==l)
			  break;
			}*/
         if(s.empty()==false)
         System.out.print(" Impossible");
	     System.out.println();
	     //scan.next();
	     l = scan.nextInt();
		 
		 	 
		  
		  }
      }
}
