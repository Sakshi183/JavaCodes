/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap_sort;
import java.util.*;
import java.io.*;

/**
 *
 * @author shivanshsharma
 */
public class Heap_sort {
static int n ;
static int max_size=100;
static  int a[] = new int[100];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no . of elements ");
        n= scan.nextInt();
        for(i=1;i<=n;i++)
         a[i]=scan.nextInt();
        for(i=1;i<=n;i++)
            System.out.println(a[i]+" ");
        build_heap();
        int c=0;
        System.out.println("Enter your choice");
        System.out.println("1:  Heapsort ");
        System.out.println("2: Find the maximum element in a heap");
        System.out.println("3: Extract the maximum element from a heap");
        System.out.println("4: Increase an (or any) element value in a heap");
        System.out.println("5: Insert an element into a heap");
        //c =scan.nextInt();
        System.out.println("After building max heap...baby...");
         for(i=1;i<=n;i++)
            System.out.println(a[i]+" ");
        
        /*switch(c)
        {
            case 1:
                System.out.println();
                heap_sort();
                break;
            case 2:
              max(a);
              break;
            case 3:
                int u = extract_max();
                 System.out.println("the element extracted is:"+u);
                break;
            case 4:
                System.out.println("enter the positon of element to change the value");
                int p1=scan.nextInt();
                System.out.println("Enter the new key value");
                int k =scan.nextInt();
                increase_key(p1,k);
                break;
            case 5:
             System.out.println("Enter element to be inserted into heap");
             int y = scan.nextInt();
             insert_element(y);
             break;
                
            default:
                System.out.println("Enter your choice again");
                
        }
        for(i=1;i<=n;i++)
            System.out.println(a[i]+" ");
*/
        
    }
    public static void max_heapify(int i ) 
    {
        System.out.println("value of i:"+i);
        int l,r;
        int largest;
        l=2*i;
        r=2*i + 1;
        if(l<=n&&a[l]>a[i])
            largest=l;
        else 
            largest =i;
        if(r<=n&&a[r]>a[largest])
            largest=r;
        
        if(largest!=i)
        {
            int temp = a[largest];
            a[largest] = a [i];
              a[i]=temp;
            max_heapify(largest);
        }
    }
    
    public static void build_heap()
    {
        int i;
        for(i=n/2;i>=1;i--)
        { 
            max_heapify(i);
        }
        
    }
    public static void  max(int a [])
    {
        System.out.println("The maximum element is:"+a[1]);
    }
    
    public static int extract_max()
    {
        if(n<=0)
        { System.out.println("Heap is empty");
            return -1;
        }
        else
        {
        int max = a[1];
        a[1]=a[n];
        n--;
        max_heapify(1);
        return max;
        }
    }
    
    public static void heap_sort()
    {
        if(n>2)
        a[n]= extract_max();
    }
    public static void insert_element(int e )
    {
        int i;
if (n+1 >= max_size)
{ 
    System.out.println("the heap is full");
 }
n++;

i=n;
while ((i!=1)&&(e>a[i/2]))
{ a[i] = a[i/2];
  i = i/2; 
}
  a[i] = e;
        
    }
    public static void increase_key(int p, int key )
            
    {
        
        if(key<a[p])
        System.out.println("Error ,we han=ve to increase the key not decrease it");
        
        else
        {
            a[p]=key;
            while(p>1&&a[p/2]<a[p])
            {
                int temp = a[p];
                a[p]=a[p/2];
                a[p/2]= temp;
                p= p/2;
            }
        }
        
    }
    
    
}
