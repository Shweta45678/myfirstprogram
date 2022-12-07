//==slip 2_1 ==//

import java.io.*;
class slip2_1
{
public static void main(String ar[])throws IOException
{
int n,sum=0,i;
int a[]=new int[13];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter how many element you want = ");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
System.out.print("enter a element = ");
a[i]=Integer.parseInt(br.readLine());
sum=sum+a[i];
}
System.out.println("\nThe Array sum is "+sum);
}
}

/*================output==============
smj@smj-virtual-machine:~$ javac slip2_1.java
smj@smj-virtual-machine:~$ java slip2_1
enter how many element you want = 4
enter a element = 1
enter a element = 2
enter a element = 3
enter a element = 4

The Array sum is 10
smj@smj-virtual-machine:~$ 
*/
