/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_3;
import java.util.*;
import java.io.*;
/**
 *
 * @author shivanshsharma
 */
public class Lab2_3 {
  
    public static Stack<Integer>[] s = new Stack[3];
   
   
    public static void main(String[] args) {
       
         for(int j=0;j<3;j++)
       {
           if(s[j]==null)
            s[j]=new Stack<Integer>();
        }
        System.out.print("Enter no. of discs");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i =n;i>=1;i--)
        {
            s[0].push(i);
        }
        hanoi(n,0,2,1);
      
    }
    
    public static void hanoi( int discs , int source,int destination,int temp )
    {   int k;
        if(discs>=1)
        {  // recursion step -- move (disk - 1) disks from source
           // to temp using destination
            hanoi( (discs- 1), source, temp, destination );
           
            // move last disk from source to destination
            System.out.printf( "\n%d --> %d", source, destination );
            
            if(s[source].size()>0)
            {
                 System.out.println("DISC MOVED : "+s[source].peek());
                 k= s[source].pop();
                 s[destination].push(k);
             }
            
            // move ( disks - 1 ) disks from temp to destination
            hanoi( (discs - 1), temp, destination, source );
        }
    }
    
}
