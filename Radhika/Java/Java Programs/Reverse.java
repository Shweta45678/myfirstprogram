//slip 8_1//

import java.io.*;
class slip8_1
{
public static void main(String arg[])throws IOException
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int no,rem,rev=0;
System.out.printf("enter a no = ");
no=Integer.parseInt(br.readLine());

while(no!=0)
{
rem=no%10;
rev=rev*10+rem;
no=no/10;
}
System.out.println("The revers no is = "+rev);
}
}

/*===================output==============
smj@smj-virtual-machine:~$ javac slip8_1.java
smj@smj-virtual-machine:~$ java slip8_1
enter a no = 123
The revers no is = 321
smj@smj-virtual-machine:~$ 
*/
