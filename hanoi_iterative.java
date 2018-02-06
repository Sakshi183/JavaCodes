/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_4;

import java.util.Scanner;
import java.util.Stack;

public class Lab2_4 {
public static Stack<Integer>[] s = new Stack[3];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,i1;
          for(int j=0;j<3;j++)
       {
        if(s[j]==null)
            s[j]=new Stack<Integer>();
        }
        System.out.print("Enter no. of discs");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        //System.out.println("SIZE OF ! IS: " + s[0].size());
        for(i1 =n;i1>=1;i1--)
        {//System.out.println("SIZE OF ! IS: " + s[0].size());
            s[0].push(i1);
        }
       
       int size=1;
       for(i1=1;i1<=n;i1++)
       {
           size=size*2;
       }
       size--;
       
       for(i=1;i<=size;i++)
       {
           //movement of top disk between source pole and destination pole
            if(i%3==1)
           {
               move(0,2);
           }
           // legal movement top disk between source pole and 
           // auxiliary pole	
             else if(i%3==2)
           {
               move(0,1);
           }
            //  movement top disk between auxiliary pole 
       // and destination pole 
           else if(i%3==0)
           {
               move(1,2);
           }
           
         
           
       }
       
    }
    public static void move( int so, int de)
    { int k;
    //first pole is empty
       if(s[so].size()==0)
       {
           k=s[de].pop();
           s[so].push(k);
           System.out.println(de+" -> "+so);
           System.out.println("DISC MOVED:"+k);
       }
         
     //second pole is empty
       else if(s[de].size() ==0)
       {
           k=s[so].pop();
           
            System.out.println(so+" -> "+de);
           s[de].push(k);
           System.out.println("DISC MOVED:"+k);
       }
       //top of first pole is greater than other 
       else if(s[so].peek()>s[de].peek())
       {     k=s[de].pop();
             System.out.println(de+" -> "+so);
           s[so].push(k);
           System.out.println("DISC MOVED:"+k);
           
       }
 
   //top of second pole is greater than the first one 
    else
    {    
        k=s[so].pop();
         System.out.println(so+" -> "+de);
        s[de].push(k);
        System.out.println("DISC MOVED:"+k);
    }
    
    }
    
   
}
