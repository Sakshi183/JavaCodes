import java.io.*;
import java.util.*;
import java.math.BigDecimal;

/** Assignment1: Basic Java
 * In this assignment, focus on each method at once.
 * Step 1: Compile the code and resolve the compilation errors for that particular method, if any,
 * Step 2: Implement the body for that method if missing.
 * Step 3: Make all the test cases pass.
 */
 class A1 {
	/** Adds two integers.
   */
  public static int add(int a, int b) {
    return a+b;
  }
   /*divide two number*/
  public static double divide(double a, double b) {
	  if (b!=0&&(a>=0&&b>0))
	  return a/b;
  else 
	  return -1;
  }
    /*read integer input from user*/
  public static int input_int(){
	 Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	return n;
  }
    /*print values of a and b after swaping without using third variable and also return (a-b) after swaping.*/
  public static int swap(){
    int a =input_int();
    int b = input_int();
    System.out.printf("a=%d",a);
    System.out.printf(" b=%d ",b);
	
    a = a - b;
    b = b + a;
	a = b - a; 
	System.out.printf(" a=%d ",a);
    System.out.printf(" b=%d",b);
    return ( a - b);
  }
      /*return the modullo of two numbers*/
  public static int modullo(int a , int  b){
	  return (a%b);

  }
      /* output the highest common factor of two numbers*/
  public static int HCF(int a, int b){
	  int t ;
	  int s ;
	  int h =0;
	  if (a > b)
	  {
		t = a;
		s = b;
	  }
      else 
	  {
		  t = b;
		  s = a;
	  }
      int r = -1; 
      while(r!=0)
	  {
		  int q = t / s ;
		  r = t % s ; 
		  h = s ; 
		  s = r ;
		  t = q ;
		  
	  }		   
	  return h;
  }
      /* output the Least common multiple of two numbers*/
  public static int LCM(int a, int b){
    int t = HCF(a , b);
	int h = ( a*b )/t;
	return h;
  }

  /** Implement the methd to find Nth Fibonacci number using BigDecimal.
   * Refer this page: https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html
   */
  public static int fibonacci(int n) {
    
	if(n<0)
	 return -1;
    if (n ==1 || n==2 )
     return 1;
	else 
  	 return ( fibonacci(n - 1) + fibonacci(n - 2) );
  }

  /** Nth factorial number.
   * If the facorial is going to overflow, return -1 otherwise return correct factorial value.
   * Hint: You can use Long.MAX_VALUE
   */
  public static long factorial(long n) {
	long f;
	if( n < 0 )
     return -1;		
    long fact = 1 ;
    if (n==1)
	 return 1;
     f=fact;
	 fact =  factorial( (n-1) )*n;
     if(fact*n<fact)
	 return -1;
     else 
     return fact;		 
  }

}

 class Assignment1
 {
   public static void main( String args[])
   {   
       A1 obj = new A1();
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter your choice:");
	   System.out.println("1.Add ");
       System.out.println("2.Divide");
       System.out.println("3.Swap ") ;
       System.out.println("4.Modulo") ;
       System.out.println("5.HCF");
       System.out.println("6.LCM");
       System.out.println("7.fibonacci") ;
       System.out.println("8. factorial") ;	   
	   int c,s;
	   c = scan.nextInt();
	   int a,b;
	   switch(c)
	   {
		   case 1:System.out.println("Enter two no.s");
		           a = scan.nextInt();
				   b = scan.nextInt();
				   s = obj.add(a,b);
				  System.out.println("sum is: "+s);
				  break;
		   case 2:System.out.println("Enter two no.s");
                  double x = scan.nextDouble();
                  double y = scan.nextDouble();	
                  double z = obj.divide(x,y);
				  System.out.println(" x divide by y equals:"+z);
				  break;
           case 3: s = obj.swap(); 
                   System.out.println("a-b after swap is: "+s);
				   break;
	       case 4: System.out.println("Enter two no.s");
		           a = scan.nextInt();
				   b = scan.nextInt();
                   s = obj.modullo(a,b);
                   System.out.println("modulus is:"+s);
                   break;				   
           case 5:System.out.println("Enter two no.s");
		           a = scan.nextInt();
				   b = scan.nextInt();	
                   s = obj.HCF(a,b);
                   System.out.println("HCF is:"+s);
				   break;
           case 6: System.out.println("Enter two no.s");
		           a = scan.nextInt();
				   b = scan.nextInt();	
				   s = obj.LCM(a,b);				   
                   System.out.println("LCM is:"+s);
				   break;
		   case 7: System.out.println("Enter a no.");
		           a = scan.nextInt();
				   s = obj.fibonacci(a);
				   System.out.println("fibonacci is:"+s);
				   break;
		   case 8: System.out.println("Enter a no.");
		           long l = scan.nextLong();
				   long f = obj.factorial(l);
				   System.out.println("factorial is:"+ f);
				   						  
	   }
   }
   }