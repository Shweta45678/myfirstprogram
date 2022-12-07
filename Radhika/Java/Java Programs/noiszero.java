//slip 13_3//

import java.io.*;
class nozero extends Exception
{

}

class plogic
{
public void prime(int n)
{
int i,m=0,temp=0;
m=n/2;
if(n==0 || n==1)
{
System.out.println("is not prime no ");
}
else
{
for(i=2;i<=m;i++)
{
if(n%i==0)
{
System.out.println("no is not prime");
temp=1;
break;
}
}
if(temp==0)
{
System.out.println("no is prime");

}
}
} 
}


class slip13_3
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int no;
System.out.printf("enter a no = ");
no=Integer.parseInt(br.readLine());

try
{
if(no==0)
{
throw new nozero();
}
else
{
System.out.println("no is not zero");
}
}
catch(nozero e)
{
System.out.println("no is zero");
}

plogic o1=new plogic();
o1.prime(no);

}
}

/*===============output=====================

smj@smj-virtual-machine:~$ javac prime.java
smj@smj-virtual-machine:~$ java prime
enter a no = 1
no is not zero
is not prime no 
smj@smj-virtual-machine:~$ javac prime.java
smj@smj-virtual-machine:~$ java prime
enter a no = 2
no is not zero
no is prime
smj@smj-virtual-machine:~$ javac prime.java
smj@smj-virtual-machine:~$ java prime
enter a no = 3
no is not zero
no is prime
smj@smj-virtual-machine:~$ javac prime.java
smj@smj-virtual-machine:~$ java prime
enter a no = 4
no is not zero
no is not prime
smj@smj-virtual-machine:~$*/
