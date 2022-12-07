//=========slip 14_2 =======//

import java.io.*;
class slip14_2
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
char s;
int i;
int cn=0;
System.out.print("Enter a String = ");
str=br.readLine();
int count=str.length();
System.out.println("the count is = "+count);
System.out.print("Search a spacific char in the String = ");
s=(char)br.read();

for(i=0;i<count;i++)
{
if(s==str.charAt(i))
{
System.out.println();
cn++;
}
}
System.out.println();
System.out.println("char is same count = "+cn);
System.out.println();
}
}

/*smj@smj-virtual-machine:~$ javac an.java
smj@smj-virtual-machine:~$ java an
Enter a String = jagdish
the count is = 7
Search a spacific char in the String = j


char is same count = 1

smj@smj-virtual-machine:~$ 
*/
