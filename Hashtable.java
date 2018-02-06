/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;
import java.io.*;
import java.util.*;
/**
 *
 * @author shivanshsharma
 */
public class Hashtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int n,k,c,i,l,j;
 int x[] = new int[5];
  Scanner scan = new Scanner(System.in);
  n = scan.nextInt();                      //no. of test cases
  int s,m;
  for(l =0;l< n;l++)
  {
    k = scan.nextInt();                    //no. of base address
    c = scan.nextInt();                    //key

    System.out.println("C IS:"+c);
    System.out.println("k Is:"+k);
  ArrayList<List<Integer>> list = new ArrayList<List<Integer>>(k+1);          //2 d array list base address with same key is in a row

     for( i = 0; i < k+1; i++)  
	{
          list.add(new ArrayList<Integer>(c+1));                                // initialise each row (capacity = no.of keys)
        }
     for(i = 0;i<c;i++)
    {
      
      s= scan.nextInt();                                                    //take base address
      m = s%k;                                                              // get modulo
      list.get(m).add(s);                                                   // add at the row where row no. is same as modulo of that no.
      
    }
       for(i=0;i<k;i++)
            System.out.print("   "+i);
       System.out.println();
    for(i=0;i<k;i++)
    {
      System.out.print(i+" -> ");                                           // display output
        
       int y =list.get(i).size();
      //System.out.print(x);
      for(j=0;j<y;j++)
     {
        System.out.print(list.get(i).get(j)+" -> ");
      }
     System.out.println("\\");
     }
   //int l1 = list.get(0).remove(3);
   //System.out.println("REMOVED ELEMENT IS :"+l1);
     for(i=0;i<k;i++)
            System.out.print("   "+i);
            System.out.println();
   for(i=0;i<k;i++)
    {
      System.out.print(i+" -> ");                                           // display output
        
       int y =list.get(i).size();
      //System.out.print(x);
      for(j=0;j<y;j++)
     {
        System.out.print(list.get(i).get(j)+" -> ");
      }
     System.out.println("\\");
     }
   if(l!=n-1)
   System.out.println();
   }
}
}
