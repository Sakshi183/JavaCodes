/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;
import java.util.*;
import java.io.*;
/**
 *
 * @author shivanshsharma
 */
public class Dfs {

        private Stack<Integer> stack;
        static   int n  = 100;
          static int a[][] = new int[n+1][n+1];
    public Dfs() 
    {
        stack = new Stack<Integer>();
    }
 
    public void dfs( int source)
    {

 
        int visited[] = new int[n + 1];		
        int element = source;		
        int i = source;		
        System.out.print(element );		
        visited[source] = 1;		
        stack.push(source);
 
        while (stack.size()!=0)
        {
            element = stack.peek();
            i = 1;	
	    while (i <=n)
	    {
     	        if (a[element][i] == 1 && visited[i] == 0)
	        {
                    stack.push(i);
                    visited[i] = 1;
                    element = i;
                    i = 1;
                    System.out.print("->"+element);
	            continue;
                }
                i++;
	    }
            
            stack.pop();	
        }
    }

    
    
    
    
    
    
    public static void main(String[] args) 
    {
       
      int  source;
        Scanner scan =  new Scanner(System.in);
 	
	    System.out.println("Enter the number of nodes in the graph(less than 100");
            n  = scan.nextInt();
            //System.out.println("Length is:"+a[0].length);
            System.out.println("Enter the source for the graph");
            source = scan.nextInt(); 
	  
	    System.out.println("Enter the adjacency matrix");
	    for (int i = 1; i <= n; i++)
            { 
                for (int j = 1; j <= n; j++)
                 
                {
                    a[i][j] = scan.nextInt();
                }
 
            }
            
 
            System.out.println("DFS TRAVERSAL ");
            Dfs dfs = new Dfs();
            dfs.dfs(source);					
        	
  	
    }	
        
        
        
        
        
    }
    

