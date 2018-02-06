/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;
import java.io.*;
import java.util.*;
/**
 *
 * @author shivanshsharma
 */
public class Bfs {
    static int n=100 ;
     static int a[][] = new int[n+ 1][n + 1];
    
private Queue<Integer> queue;
 
    public Bfs()
    {
        queue = new LinkedList<Integer>();
    }
 
    public void bfs(int source)
    {
        
 
        int[] visited = new int[n+ 1];
        int i, element;
 
        visited[source] = 1;
        queue.add(source);
 
        while (!queue.isEmpty())
        {
            element = queue.remove();
            i = 1;
            System.out.print("->"+i);
            while (i <= n)
            {
                if (a[element][i] == 1 && visited[i] == 0)
                {
                    queue.add(i);
                    visited[i] = 1;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
    
        int  source;
        Scanner scan = new Scanner(System.in);
 
        
            System.out.println("Enter the number of nodes in the graph");
            n = scan.nextInt();
            System.out.println("Enter the source for the graph");
            source = scan.nextInt();
            
            System.out.println("Enter the adjacency matrix");
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= n; j++)
                  a[i][j]=scan.nextInt();
            System.out.println("The BFS traversal of the graph is ");
            Bfs bfs = new Bfs();
            bfs.bfs( source);
 
 
    }
        
        
        
        
    }
    
