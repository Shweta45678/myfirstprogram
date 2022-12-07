//slip 4_1//

import java.io.*;
class slip4_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b;
System.out.print("enter a two no = ");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());

int c=a+b;

System.out.println("\nthe sum is "+c);
}
}

/*================output===========
smj@smj-virtual-machine:~$ javac slip4_1.java
smj@smj-virtual-machine:~$ java slip4_1
enter a two no = 5 
6

the sum is 11
smj@smj-virtual-machine:~$ 

*/
