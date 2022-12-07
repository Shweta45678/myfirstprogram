//====slip9_1===//

import java.io.*;
class slip9_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.print("enter a table no you want = ");
a=Integer.parseInt(br.readLine());
int i;
for(i=1;i<=10;i++)
{
System.out.println(a+" * "+i+" ="+a*i);
}
}
}

/*===============output==============
smj@smj-virtual-machine:~$ javac slip9_1.java
smj@smj-virtual-machine:~$ java slip9_1
enter a table no you want = 2
2 * 1 =2
2 * 2 =4
2 * 3 =6
2 * 4 =8
2 * 5 =10
2 * 6 =12
2 * 7 =14
2 * 8 =16
2 * 9 =18
2 * 10 =20
smj@smj-virtual-machine:~$ 
*/
