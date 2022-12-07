//========slip 13_2========//

import java.io.*;
class slip13_2
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[12];
int n,i,j;
System.out.print("enter a how many no you want = ");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
System.out.print("enter a  no = ");
a[i]=Integer.parseInt(br.readLine());
}

System.out.println("Before sorting ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(a[j]<a[j+1])
{
int t;
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println();

System.out.println("After sorting ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}

/*==================Output=================
smj@smj-virtual-machine:~$ javac slip13_2.java
smj@smj-virtual-machine:~$ java slip13_2
enter a how many no you want = 4
enter a  no = 12
enter a  no = 1
enter a  no = 32
enter a  no = 4
Before sorting 
12
1
32
4

After sorting 
32
12
4
1
smj@smj-virtual-machine:~$ 
*/
