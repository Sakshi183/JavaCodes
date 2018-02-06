/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random_q_sort;

import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author shivanshsharma
 */
public class Random_q_sort {

    /**
     * @param args the command line arguments
     */
    static int a[]= new int[100];
    public static void main(String[] args)  throws FileNotFoundException {
        // TODO code application logic here
        int i ,n;
     //Scanner scan = new Scanner(System.in);
     //System.out.println("Enter no. of elements");
     Scanner scan=new Scanner(new FileReader("/Users/shivanshsharma/Desktop/numbers.txt"));

     n = 50;
      //System.out.println("Enter elements");
     for(i=0;i<n;i++)
     {
         a[i]= scan.nextInt();
     }
     
     quick(a,0,n-1);
     System.out.println("After sorting elements we have :");
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
        Random rand = new Random(); 
        int value = rand.nextInt(r-p+1);
        int p1 = value +p;
        int pivot = a[p1];
        // swap a[r] and pivot
        int temp = a[r];
        a[r] = a[p1];
        a[p1] = temp;
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
        int t = a[r];
        a[r]=a[i+1];
        a[i+1]= t;
        
        return i+1;
    }
    
}

    
    

