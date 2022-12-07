//==========slip24_1=======//

import java.io.*;
class slip24_1
{
static int n1=0,n2=1,n3=0;
static void fibo(int count)
{
if(count>0)
{
n3=n1+n2;
n1=n2;
n2=n3;
System.out.println(n3);
fibo(count-1);
}
}
public static void main(String arg[])
{
int count=10;
System.out.println(n1+"\n"+n2);
fibo(count-2);
}
}

/*==================output===============
smj@smj-virtual-machine:~$ javac slip24_1.java
smj@smj-virtual-machine:~$ java slip24_1
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
smj@smj-virtual-machine:~$ 
*/
