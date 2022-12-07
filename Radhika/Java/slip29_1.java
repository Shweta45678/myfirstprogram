//=========slip 29_1 =========//

import java.io.*;
class slip29_1
{
public static void main(String ar[])throws IOException
{
int no;
int p;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i;
System.out.print("Enter a no =");
p=Integer.parseInt(br.readLine());
no=p;
int r;
int ans=0;
while(no!=0)
{
r=no%10;
ans=ans*10+r;
no=no/10;
}
if(p==ans)
{
System.out.println("The number is palindrom\n");
}
else
{
System.out.println("The number is not palindrom\n");
}
}
}

/*=================OUTPUT============
smj@smj-virtual-machine:~$ javac slip29_1.java
^[[Asmj@smj-virtual-machine:~$ java slip29_1
Enter a no =151
The number is palindrom

smj@smj-virtual-machine:~$ javac slip29_1.java
smj@smj-virtual-machine:~$ java slip29_1
Enter a no =153
The number is not palindrom

smj@smj-virtual-machine:~$ 
*/
