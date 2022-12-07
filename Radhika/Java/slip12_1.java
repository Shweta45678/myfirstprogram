//========slip 12_1 =======//

import java.io.*;
class slip12_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n1,n2,gcd=1,i;
System.out.print("Enter a n1 = ");
n1=Integer.parseInt(br.readLine());

System.out.print("Enter a n2 = ");
n2=Integer.parseInt(br.readLine());

for(i=1;i<=n1 && i<=n2;i++)
{
if(n1%i==0 && n2%i==0)
gcd=i;
}
System.out.println();
System.out.println("GCD of "+n1+" and "+n2+ " = "+gcd);
System.out.println();
}
}

/*===============output===================
smj@smj-virtual-machine:~$ javac slip12_1.java
smj@smj-virtual-machine:~$ java slip12_1
Enter a n1 = 24
Enter a n2 = 27

GCD of 24 and 27 = 3

smj@smj-virtual-machine:~$ 
smj@smj-virtual-machine:~$ javac slip12_1.java
smj@smj-virtual-machine:~$ java slip12_1
Enter a n1 = 212
Enter a n2 = 34

GCD of 212 and 34 = 2
*/
