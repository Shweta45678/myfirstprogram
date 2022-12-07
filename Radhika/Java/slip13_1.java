//========slip 13_1=====//

import java.io.*;
class slip13_1
{
public static void main(String ar[])throws IOException
{
int no,fact=1,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a no = ");
no=Integer.parseInt(br.readLine());
for(i=1;i<=no;i++)
{
fact=fact*i;
}
System.out.println("the Factorial of no is = "+fact);
}
}

/*==================Output=================
smj@smj-virtual-machine:~$ javac slip13_1.java
smj@smj-virtual-machine:~$ java slip13_1
Enter a no = 5
the Factorial of no is = 120
smj@smj-virtual-machine:~$ 
*/
