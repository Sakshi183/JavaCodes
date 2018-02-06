import java.util.*;
import java.io.*;
class q5
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int i,j,k;int g=0,t=0;
int f=0;

int strokes ;
int s[] = new int[n];
int r []= new int[n];
int flag[] =new int [n];
int re[] = new int [n];
int y,z;
strokes =0;
scan.nextLine();
String a[] = new String[n];
 ArrayList<Integer> list = new ArrayList<Integer>();
for(i=0;i<n;i++)
{
 a[i] = scan.nextLine();
 s[i] = g; 
}
int q=0;
i=0;t=1;
int check=0,u=0,l=0,w=0;
int ge = 1;
int gn=1;
int to=1,ti;
strokes =n;
list.add(0);
while(t!=n)
{
	ge =t;
  for(j=0;j<n-1&&(t!=n);j++)
  {  
   

      w=0;
	 System.out.println("i="+i); 
	 //if(l>1)
	  
    for(k=j+1;k<n&&(t!=n);k++)
		
	{    u=0;
	    //flag=0;
	    System.out.println("grpous="+t); 
		System.out.println("STROKES :"+strokes);
		check=0; 
	  if(a[j].length()==i){ s[j]=++g; list.add(s[j]);  t++; check = 1; System.out.print("BREAK1");}
          if(check==1)
		  break;	 
	 while(a[j].length()<i)
	  {
		  if(j<n-2)
		  { j++; k++;}
		  else
		  {System.out.print("BREAK 3");  
		  check=1;break;}
	  }
	  if(check==1)
		  break;
		while(a[k].length()<i)
        {   
			if(k<=n-2)
				k++;
			else 
			{System.out.print("BREAK 4");	
			check =1; break;}
		}			
	  
	  if(check==1)
		  break;
	  while(a[k].length()==i){ s[k]=++g; list.add(s[k]);t++; if(k<=n-2) k++; else if(k==n-1){check=1;System.out.print("BREAK2"); break;}}
	   if(check==1)
		  break;
	   System.out.println("i="+i); 
	    System.out.println("j="+j); 
		System.out.println("k="+k); 
	   if(a[j].charAt(i)!=a[k].charAt(i)&&(s[j]==s[k]))
	  { //strokes=strokes+2;
	    s[k]=++g;
		list.add(s[k]);
		t++;
		//u=1;
		//if(i!=0)
			re[k]=1;
		re[j]=1;
	    r[k]=1;
		r[j]=1;
	  }
	 /* if((s[j]==s[k])&&(re[j]==1))
	  {
		  re[k]=1;
	  }*/
		if(a[j].charAt(i)==a[k].charAt(i)&&(s[j]!=s[k])&&(r[j]==1)&&r[k]==1)
	  { // w=1;
         // temp = s[j];
		 w = list.indexOf(s[k]);
		 list.remove(w);
		  s[k]=s[j];
		  
		  t--;
		 
	  }
	  /*if(a[j].charAt(i)==a[k].charAt(i)&&(s[j]==s[k])&&i!=0&&w!=1)
	  {
		  //strokes++;
	  }*/
	  
	
	 /* if(a[j].charAt(i)!=a[k].charAt(i)&&(s[j]!=s[k])&&u!=1)
	  { strokes=strokes+2;
	    //s[k]=++g;
		//t++;
	  }*/
	
	  /*if(s[j]==s[k])
	  {strokes++;}*/  
	} gn =t;
 
 }
 int x1,x2;
 for(x1= 0;x1<n;x1++)
 {
	 for(x2=x1+1;x2<n;x2++)
	 {
		 if(s[x1]==s[x2])
		 {
			 if(re[x1]==1||re[x2]==1)
			 {
				 re[x1]=1;
				 re[x2]=1;
			 }
			 
		 }
			 
	 }
 }
 
 //int size = list.size();
 System.out.println("Groups earlier:"+ge);
 System.out.println("Groups now :"+gn);
  System.out.println("SIZE IS:"+list.size());
  j=0;
  
  z=0;
  int e;
 
 System.out.println("FLAGS OF EACH ONE :");
 for(int x=0;x<n;x++)
 {
	 System.out.println("flag of "+x+"is:"+s[x]+"and re"+re[x]);
 }
  for(l=0;l<list.size();l++)
  { //System.out.println("hi in loop 1");
	 e= list.get(l);
	 System.out.println("ELEMENT IS:"+e);
	 z=0;y=1;
      for(z=0;z<n;z++)
       {r[z]=0;q=0;
       for(y=z+1;y<n;y++)
       {
	  //System.out.println("hi in loop 3");
	    
		 // System.out.println("hi"+e);
		 if(gn>ge&&i!=0)
		 {
			  if(s[y]==e&&s[z]==e&&flag[z]==0&&flag[y]==0&&re[y]==1&&re[z]==1)
			  { 
				  q=1;
			  
		           strokes++;  flag[y]=1;
		      } 
		 }
        
			  
		  
	   }
	   if(q==1)
		   strokes++;
      }
  
    }
    Arrays.fill(flag, 0);
	Arrays.fill(re, 0);
  System.out.println("STROKES :"+strokes);
  
  if(gn>ge&&i!=0)
  {
	  strokes = strokes + (gn - ge) ;
  }
  //list.clear();
  i++;
  }
  System.out.println("TOTAL STROKES :"+strokes);
  double ro = (strokes*100.0)/(n*100.0);
  System.out.println(ro);
  //ro = (double)Math.round(ro);
  double roundOff = Math.round(ro * 100.0) / 100.0;
  System.out.println(roundOff);
 // strokes++;
}



}