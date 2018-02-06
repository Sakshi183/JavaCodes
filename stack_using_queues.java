/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2_1;
import java.util.*;
import java.io.*;

public class Lab_2_1 {

        public static Queue <Integer> q1 = new LinkedList <Integer> ();
        public static Queue <Integer> q2 = new LinkedList <Integer> () ;
   

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int j;
        int choice=0;
        while(choice==0||choice==1)
        {
            if(choice==0)
            {  System.out.println("Enter the element");
              j=scan.nextInt();
                spush(j);
            }
            if(choice==1)
                spop();
            
          display();
          System.out.println("Enter your choice");
          choice=scan.nextInt();
        }
    }
    public static void spush(int i)
    {
        q1.add(i);         
    }
     public static void spop()
     {  
         int k;
         int l=q1.size();
         for(int i1=0;i1<l-1;i1++)
         {  
             k = q1.remove();
             q2.add(k);
         }
         if(l>0)
         {
         k=q1.remove();
         System.out.println("Element popped is : "+k);
         }
         else 
         System.out.println("The list is empty");
         
         int l2 =q2.size();
         for(int t=0;t<l2;t++)
         {
             int l1 = q2.remove();
             q1.add(l1);
         }
         
         
     }
     public static void display()
     { 
         int k;
         int l=q1.size();
         for(int i1=0;i1<l-1;i1++)
         {  
             k = q1.remove();
             q2.add(k);
         }
         if(l>0)
         {
         k=q1.remove();
         System.out.println("Element is : "+k);
         q2.add(k);
         }
         else
         System.out.println("The list is empty");
         int l2 =q2.size();
         for(int t=0;t<l2;t++)
         {
             int l1 = q2.remove();
             q1.add(l1);
         }
         
         
     }
    
}
