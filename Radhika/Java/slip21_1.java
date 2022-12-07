//===========slip 21_1 ==============//

import java.io.*;
class slip21_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a no = ");
int no=Integer.parseInt(br.readLine());
int sum=0;
int am=no;
while(no!=0)
{
int a=no%10;
sum=sum+a*a*a;
no=no/10;
}
if(am==sum)
{
System.out.println("No is Armstrong");
}
else
{
System.out.println("No not is Armstrong");

}
}
}

/*====================output=================
smj@smj-virtual-machine:~$ javac slip21_1.java
smj@smj-virtual-machine:~$ java slip21_1
Enter a no = 153
No is Armstrong
smj@smj-virtual-machine:~$ javac slip21_1.java
smj@smj-virtual-machine:~$ java slip21_1
Enter a no = 456
No not is Armstrong
smj@smj-virtual-machine:~$ 
*/
