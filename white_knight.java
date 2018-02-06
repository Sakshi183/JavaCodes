import java.lang.*;
import java.util.Formatter;
import java.io.IOException;	
import java.util.*;
import java.math.BigInteger;

public class Main {
	
	public static void main(String [] args)
	{
       Scanner sn=new Scanner(System.in);
	   int i=sn.nextInt();
	   sn.nextLine();
	   for(int j=0;j<i;j++)
	   {
		        
	String s;
	
   s= sn.nextLine();
   long digit=0;

		   
   for(int z=0;z<s.length();++z)
   {
	   digit *=2;
	   digit += (s.charAt(z)-'0');
	   digit %= 1500;
   }

		   //while(n!=0)
		   //{
			   //int r=n%10;
			   //n=n/10;
			   //num+=((Math.pow(2,f))*r);
			   //f++;
		   //}
		BigInteger low= new BigInteger("0");
		
		BigInteger high=new BigInteger("1");
		BigInteger sum=new BigInteger("0");
		if((int)digit==0)
			System.out.println("000");
		else if((int)digit==1)
			System.out.println("001");
		else{
		for(int l=0;l<=(int)digit-2;l++)
		{
			sum=low.add(high);
				low=high;
				high=sum;
				
		}			
		int fib=0;
		fib = (sum.mod(BigInteger.valueOf(1000))).intValue();
		System.out.printf("%03d\n",fib);
		}
	   }
	}
}