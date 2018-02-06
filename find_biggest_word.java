import java.util.*;
import java.io.*;
class k2
{  static int i;
  public static void main(String args[])
  {
	Scanner scan = new Scanner(System.in);
     
     int j ,l ,n,k,m=-1,z,o=0,u=0;
	 int e = 0,v=0,h=0,b=0;
	String s; //= "1";
	int f=0;
	s = scan.nextLine();
	String y="0";
	while(s.charAt(0)!='0')
	{  o=1;
	  
	  l = s.length();
	  
	  
	  
	  k = 1;
	  
	  if(s.charAt(0)==' ')
	  {b=1;
	  //k--;
	  }
	  for(i=b; i<l-1 ;i++)
	  {
		  
		  
		  v = i;
	   
	   while((s.charAt(i+1)!=' ')&&(i!=l-2))
       { 
         k++;
       
         i++;
		 }
 		 
	  
	   
                 
	   
	   if(i==l-2&&s.charAt(l-1)!=' ')
	     k++;
	   if(i==l-2)
	   System.out.println(k);
	  
	  else
	  {System.out.print(k+"-");}
       
	   if(m<=k)
	   {

	    m=k;
	 
	
	      
	  
	      char t [] = new char[l];
		 if(v==0)
		 {k--;
		 u = 1;}
		 else
		 u = 0;	 
	      for (j=v, z=0; z<=k;j++,z++)
		 {
			 t[z] = s.charAt(j);
			/*if(t[z]==' ' )
		    System.out.print("yes");		*/
		 }
		 y = new String(t);
		 
	   }
        k =0;
	   
	   if(i==l-1)
	   break;
	  }
	  b=0;
	  s = scan.nextLine();
     	}
	
	if(o==1)
	{
		
	System.out.println();
     if(u==0)	
	System.out.println("The biggest word:"+y);
    else
	System.out.println("The biggest word: "+y);	}
	}
}