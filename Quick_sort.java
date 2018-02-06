/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quick_sort;
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 *
 * @author shivanshsharma
 */
 
public class Quick_sort {
   static int a[]=new int[100];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws FileNotFoundException{
     int i ,n;
     n= 50;
     Scanner scan=new Scanner(new FileReader("/Users/shivanshsharma/Desktop/numbers.txt"));
     //System.out.println("Enter no. of elements");
    // n = scan.nextInt();
      
     for(i=0;i<n;i++)
     {
         a[i]= scan.nextInt();
     }
     
     quick(a,0,n-1);
     for(i=0;i<n;i++)
         System.out.println(a[i]);
   
     
        
    }
    public static void quick( int a[],int p,int r )
            
    {
        if(p<r)
        { int q = partition( a , p ,r);
          quick(a,p,q-1);
          quick(a,q+1,r);
        }
        
    }
    
    public static int partition(int a [],int p ,int r )
    {  
        int pivot = a[r];
        int i,j;
        i=p-1;
        for(j=p;j<r;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                int t = a[i];
                a[i]=a[j];
                a[j]= t;
            }
            
        }
        int temp = a[r];
        a[r]=a[i+1];
        a[i+1]= temp;
        
        return i+1;
    }
    
}
