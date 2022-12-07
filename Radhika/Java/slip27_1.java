//============== slip 27_1 =============//

import java.io.*;
class slip27_1
{
public static void main(String arg[])throws IOException
{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a two no : ");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());

c=a+b;
System.out.println("the sum is = "+c);
c=a-b;
System.out.println("the sub is = "+c);
c=a*b;
System.out.println("the mul is = "+c);
double ans;
ans=a/b;
System.out.println("the div is = "+ans);
}
}

/*=================output=============
smj@smj-virtual-machine:~$ javac slip27_1.java
smj@smj-virtual-machine:~$ java slip27_1
Enter a two no : 
54
6
the sum is = 60
the sub is = 48
the mul is = 324
the div is = 9.0
smj@smj-virtual-machine:~$ 
*/
