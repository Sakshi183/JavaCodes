import java.io.*;
import java.util.*;
class j2
{
 public static void main(String args[])
   {
     String s,a,b;
     Stack<String> st = new Stack<String>();
	 
     Scanner scan = new Scanner(System.in);
     int i=0,l,z,j;
     s =scan.nextLine();
     l = s.length();
    char t[] = new char[l];
	System.out.print(l);
     /* for(i= 0;i<l;i++)
    {
	  s.if(charAt(i)=='(')
	  { 
	  String [] parts=s.split("(",2);
	  String p = parts[0];
	  
	  String q = parts[1];
	  String [] parts2 = q.split(")",2);
	  String a = parts2[0];
	  String b = parts2[1];
	  s.push(a);
	  }
	}	*/
	for(int q = 0;q<l;q++)
	 {
	
       z = 0;
	  if(s.charAt(q)=='{')
		{
			i = q;
			while(s.charAt(i)!='}'&&i<l)
			{
			  System.out.print("i:"+i);
			  t[z++] =s.charAt(i);
			  i++;
            }
            t[z]='}';
            String y =new String(t);
		    st.push(y);
			q = i;
		}

	  if(s.charAt(q)=='+')
	  { 
		i = q;
	    a = st.pop();
		i++;
		z = 0;
		if (s.charAt(i)=='{')
		{//i=i+1;
			while(s.charAt(i)!='}'&&i<l)
			{
			 t[z++] = s.charAt(i);
			 i++;
			}
		}
	   // t[z]='}';
		String y =new String(t);
		q = i;
		char g [] = new char[l];
		z=1;
		g[0] = '{';
		
		for(i=1;i<y.length();i++)
		{ 
		  g[z++] = y.charAt(i);
		}
		//g[z]='}';
		for(i = 1;i<a.length()-1;i++)
	    {    
	        int e =0;
		    for(j=1;j<y.length();j++)
			{
			 if(a.charAt(i)==y.charAt(j))
			 e =1;
			}
			System.out.print(a.length());
		    if(e==0)
			 g[z++] = a.charAt(i);
		}
	    g[z] = '}';
		String r = y;
		//System.out.print(y);
		r = r.copyValueOf(g);
		st.push(r);
		
	   }
	   
		
	  if(s.charAt(q)=='*')
	  { i =q;
	    a = st.pop();
		i++;
		if (s.charAt(i)=='{')
		{//i=i+1;
			while(s.charAt(i)!='}'&&i<l)
			{
			t[z++] = s.charAt(i);
			i++;
			}
		}
		q = i;
		String y =new String(t);
		z=0;
		char g [] = new char[l];
		g[z++] = '{';
		for(i = 1;i<y.length()-1;i++)
	    {       int e =0;
				for(j=1;j<a.length()-1;j++)
				{
				 if(a.charAt(j)==y.charAt(i))
				 e =1;
				}
			    if(e==1)
			    { 
			     g[z++] = y.charAt(i);
			    }
				
		}
		g[z]='}';
		String f = new String(g);
		st.push(f);
		
	   }
	   
	   if(s.charAt(i)=='-')
	  {
	    a = st.pop();
		i++;
		if (s.charAt(i)=='{')
		{//i=i+1;
			while(s.charAt(i+1)!='}'&&i<l)
			{
			t[z++] = s.charAt(i);
			i++;
			}
		}
		q = i;
		String y =new String(t);
		z=0;
		char g [] = new char[l];
		g[z++] = '{';
		for(i = 1;i<a.length()-1;i++)
	    {       int e =0;
				for(j=1;j<y.length()-1;j++)
				{
				 if(a.charAt(i)!=y.charAt(j))
				 e =1;
				}
			    if(e==1)
			    { 
			     g[z++] = a.charAt(i);
			    }
				
		}
		g[z]='}';
		String f = new String(g);
		st.push(f);
	   }
		
}
String y =st.peek();
System.out.println("AT END: "+y);
}
		
	  }
 