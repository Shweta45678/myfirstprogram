//====slip 14_1====//

import java.io.*;
class slip14_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=0,b=1,c,i,n;
System.out.print("Enter a no upto fibo series you want = ");
n=Integer.parseInt(br.readLine());
System.out.println();
System.out.println(a);
System.out.println(b);
for(i=0;i<n;i++)
{
c=a+b;
a=b;
b=c;
System.out.println(c);
}

}
}

/*===================output==============
smj@smj-virtual-machine:~$ javac slip14_1.java
smj@smj-virtual-machine:~$ java slip14_1
Enter a no upto fibo series you want = 10

0
1
1
2
3
5
8
13
21
34
55
89
smj@smj-virtual-machine:~$ 
*/
