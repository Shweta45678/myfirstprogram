//slip 5_1//

import java.io.*;
class slip5_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str1,rev="";
System.out.println();
System.out.print("enter a orignal String = ");
str1=br.readLine();
int len=str1.length();
int i;
for(i=len-1;i>=0;i--)
{
rev=rev+str1.charAt(i);
}
if(str1.equals(rev))
{
System.out.println("String is palindrom\n");
}
else
{
System.out.println("String is not palindrom\n");
}
}
}

/*=====================output==============
smj@smj-virtual-machine:~$ javac slip5_1.java
smj@smj-virtual-machine:~$ java slip5_1

enter a orignal String = nitin
String is palindrom

smj@smj-virtual-machine:~$ javac slip5_1.java
smj@smj-virtual-machine:~$ java slip5_1

enter a orignal String = neha
String is not palindrom

smj@smj-virtual-machine:~$ 
*/
