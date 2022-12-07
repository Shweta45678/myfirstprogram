//=======slip 15_1 ===========//

import java.io.*;
class slip15_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c;
System.out.println("Enter a two no = ");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=a+b;
System.out.println();
System.out.println("The addition is = "+c);
System.out.println();
}
}

/*===================output==================
smj@smj-virtual-machine:~$ javac slip15_1.java
smj@smj-virtual-machine:~$ java slip15_1
Enter a two no = 
12
34

The addition is = 46

smj@smj-virtual-machine:~$ 
*/
