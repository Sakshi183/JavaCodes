import java.lang.*;
import java.util.Formatter;
import java.io.IOException;	
import java.util.*;
import java.lang.String;
class Main {
	
	public static void main(String [] args)
	{
       Scanner scan=new Scanner(System.in);
	   String bigw="";
	   int bign=0;
	   String s="";
	   while(s!="0")
	   {
		   int count=0;
		   
		   s=scan.nextLine();
		    if(s.charAt(0)=='0')
		   {
			   System.out.printf("\n");
			   break;
		   }
		  
		   int len=s.length();
		   String temp="";
		   for(int i=0;i<len;i++)
		   {  
				int k=0;
				
				if(s.charAt(i)!=' ')
			   {
				   count++;
				   String st=Character.toString(s.charAt(i));
				  
				   temp=temp+st;
				   
			   }			   
			   
			   if(s.charAt(i)==' ')
			   {
				   System.out.printf("%d-",count);
				   if(bign<=count)
				   {
					   bigw="";
					   bigw=temp;
					   
					   
					   bign=count;
				   }
				   count=0;
				   temp = "";
				   
			   }
			   if(s.charAt(i)!=' '&&i==len-1)
			   {
				     if(bign<=count)
					 {
						 bigw="";
						 bigw=bigw+temp;
						 
						 bign=count;
					 }
					 System.out.printf("%d\n",count);
			   }
		   }
		  
		   
	   }
	    System.out.printf("The biggest word: %s\n",bigw);
	}
}

	   
