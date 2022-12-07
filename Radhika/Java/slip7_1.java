//======slip 7_1=======//

import java.io.*;
class slip7_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n;
int a[]=new int[12];
int min;
System.out.print("enter a no you want = ");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
System.out.print("enter a no = ");
a[i]=Integer.parseInt(br.readLine());
}
min=a[0];
for(i=0;i<n;i++)
{
if(min>a[i])
{
min=a[i];
}
}
System.out.println("The samll no is  = "+min);

}
}

/*==================output=============
smj@smj-virtual-machine:~$ javac slip7_1.java
smj@smj-virtual-machine:~$ java slip7_1
enter a no you want = 3
enter a no = 12
enter a no = 4
enter a no = 56
The samll no is  = 4
smj@smj-virtual-machine:~$ 
*/
