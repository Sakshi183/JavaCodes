  import java.io.*;
  import java.util.*;
  class Main
  {
  
  static int c = -1;
  public static int fibonacci(int n) {
    c++;
	if(n==0) 
	  return 0;
	
	else if (n == 1)
       return 1;
	
	 else 
  	 return ( fibonacci(n - 1) + fibonacci(n - 2) );
   
  }
  public static void main(String args[])
  { int t,u,n,i;
    int a[] = new int[39];
   Scanner scan = new Scanner(System.in);   
    n = scan.nextInt();
	for(i = 0; i < n ;i++)
	 {
     a[i] = scan.nextInt();
	 }
	for(i = 0; i <n;i++)
	 {
	 u = fibonacci(a[i]);
	 System.out.println("fib("+a[i]+") = "+c+" calls = "+u);
	 c = -1;
	 }
   }
  }