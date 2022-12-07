//========== slip 26_1 ==============//

import java.io.*;
class slip26_1
{
public static void main(String arg[])throws IOException
{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a 3 no = ");
 a=Integer.parseInt(br.readLine());
 b=Integer.parseInt(br.readLine());
 c=Integer.parseInt(br.readLine());
if(a>b && a>c)
{
System.out.println("maximum = "+a);
}
else if((b>c)&&(b>a))
{
System.out.println("Maximum = "+b);
}
else
{
System.out.println("Maximum = "+c);
}
}
}

/*===================output============
smj@smj-virtual-machine:~$ javac slip26_1.java
smj@smj-virtual-machine:~$ java slip26_1
Enter a 3 no = 
5
64
47
greater no = 64
smj@smj-virtual-machine:~$ 

*/
