
package merges;
import java.util.*;
public class Merges {

    public static void main(String[] args) 
    {
        int i,n;
        Scanner scan=new Scanner(System.in);
   
        System.out.println("enter no. elements");
        n=scan.nextInt();
        int a[]= new int[n];
        for(i=0;i<n;i++)
        {
             a[i]=scan.nextInt();
        }
        sort(a,0,n-1);
        System.out.println("sorted array is:");
         for(i=0;i<n;i++)
        {
             System.out.println(a[i]);
        }  
    }
    
    public static void sort(int a[],int low,int high)
    {
         
        if(low<high)
        {
        int mid =(low+high)/2;
        sort(a,low,mid);
        sort(a,mid+1,high);
        merge(a,low,high);
        }
    }
    
    public static void merge(int a[],int low,int high)
    {
        int mid=(low+high)/2;
        int l[]=new int[mid-low+1];
        int r[]=new int[high-mid];
        int i,j,k,sizel=mid-low+1,sizer=high-mid;
        k=0;
        for(i=0;i<sizel;i++)
        {
         l[i]=a[low+i];
         
        }
      
        for(j=0;j<sizer;j++)
        {
            r[j]=a[mid+j+1];
         
        }
        
       i=0;j=0;
       k=low;
        while((i<sizel)&&(j<sizer))
        {
	  if(l[i]<r[j])
	  {
		  a[k]=l[i];
		  i++;
		  k++;
	  }
	  else
	  {
		  a[k]=r[j];
		  j++;
		  k++;
	  }
        }	  
  
        if(i<sizel)
        {
	  while(i<sizel)
	  {
		  a[k]=l[i];
	      k++;
		  i++;
	  }
        }
   
         if(j<sizer)
         {
	  while(j<sizer)
            {
		  a[k]=r[j];
		  k++;
		  j++;
            }
         }
        
        
    }
    
    
}
