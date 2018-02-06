/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2_2.java;

import java.util.Scanner;
import java.util.Stack;


public class Lab_2_2Java {

    public static Stack <Integer> s1 = new Stack <Integer>(); 
    public static Stack <Integer> s2 = new Stack <Integer>();
 
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        
        int j;
        int choice=0;
        while(choice==0||choice==1)
        {
            if(choice==0)
            {  System.out.println("Enter the element");
              j=scan.nextInt();
                qenter(j);
            }
            if(choice==1)
                qremove();
            
          display();
          System.out.println("Enter your choice");
          choice=scan.nextInt();
      
    }
    
    }

public static void qenter(int e)
{
    s1.push(e);
}
public static void qremove()
{
    int i,k,l;
    l=s1.size();
    for(i=0;i<l-1;i++)
    {
        k=s1.pop();
        s2.push(k);
        
    }
    if(l>0)
    { k=s1.pop();
    System.out.println("Removed element is:"+k);
    }
    else
        System.out.println("The queue is empty");
    l=s2.size();
    for(i=0;i<l;i++)
    {
        k=s2.pop();
        s1.push(k);
    }
}
public static void display()
{
    int i,k,l;
    l=s1.size();
    for(i=0;i<l;i++)
    {
        k=s1.pop();
        s2.push(k);
        
    }
    System.out.print("DISPLAY:");
    l=s2.size();
    if(l>0)
    {
    for(i=0;i<l;i++)
    {
        
        k=s2.pop();
        System.out.print(k+"  ");
        s1.push(k);
    }
    System.out.println();
    }
    else
        System.out.println("LIST IS EMPTY");
}

}
