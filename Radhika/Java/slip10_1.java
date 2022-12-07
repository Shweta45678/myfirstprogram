//=======slip 10_1========//

import java.io.*;
class slip10_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int year;
System.out.print("enter a year =  ");
year=Integer.parseInt(br.readLine());
if((year%4==0) && (year%100!=0) || (year%400==0))
{
System.out.println("year is leap year");
}
else
{
System.out.println("year is not leap year");
}
}
}

/*=================output================
smj@smj-virtual-machine:~$ javac slip10_1.java
smj@smj-virtual-machine:~$ java slip10_1
enter a year =  2000
year is leap year
smj@smj-virtual-machine:~$ javac slip10_1.java
smj@smj-virtual-machine:~$ java slip10_1
enter a year =  2004
year is leap year
smj@smj-virtual-machine:~$ javac slip10_1.java
smj@smj-virtual-machine:~$ java slip10_1
enter a year =  2019
year is not leap year
*/
