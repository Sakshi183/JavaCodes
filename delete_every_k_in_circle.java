import java.io.*;
import java.util.*;
class k5
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int n,k,m,i,j;
int nc = scan.nextInt();
for(j=1;j<=nc;j++)
{
n = scan.nextInt();
k = scan.nextInt();
int s=k-1;
ArrayList<Integer> list = new ArrayList<Integer>(n);
for(i=1;i<=n;i++)
{

list.add(i);

}

while(list.size()!=1)
{
	
	if(s>=list.size())
	s=s%list.size();
	list.remove(s);
	s = k + s -1;
	if(s>=list.size())
	s= s%list.size();
	
}
for(Integer number : list)
{
 System.out.println("Case "+j+": "+number);
}
}
}
}