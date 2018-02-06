/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcs;
import java.util.*;
import java.io.*;
import java.lang.Math;
/**
 *
 * @author shivanshsharma
 */
public class Lcs {

    /**
     * @param args the command line arguments
     */
    public static int iter_lcs(char x[],char y[])
    {
        int temp[][] = new int[x.length+1][y.length+1];
        int max =0;
        for(int i = 1;i<temp.length;i++)
            
        {
            for(int j =1;j<temp[i].length;j++)
            {
                if(x[i-1]==y[j-1])
                   
                {   //System.out.print(x[i-1]);
                    temp[i][j] = temp[i-1][j-1] +1;
                }
                else
                {
                    temp[i][j] = Math.max(temp[i-1][j] , temp[i][j-1]);
                            
                }
                if(temp[i][j]>max)
                    max=temp[i][j];
                
            } 
        }
        System.out.println();
        return max;
    }
        
        
        

            
        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter String 1");
    String s = scan.nextLine();
    System.out.println("Enter string 2");
    String t =scan.nextLine();
    //int result = rec_lcs(s.toCharArray(),t.toCharArray(),0,0);
    //System.out.println("Size of maximum matching substring is:"+result);
    int r = iter_lcs(s.toCharArray(),t.toCharArray());
    System.out.println("MAXIMUM LENGTH OF COMMON SUBSEQUENCE IS :"+r);
    

    }
}

