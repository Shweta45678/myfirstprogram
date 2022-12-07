//========= slip 6_1=====//

import java.io.*;
class slip6_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int sum=0;
double avg;
int a[]=new int[12];
int n,i;
System.out.print("Enter a how many no = ");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
System.out.print("Enter a  no = ");
a[i]=Integer.parseInt(br.readLine());

sum=sum+a[i];
}
avg=sum/n;
System.out.println();
System.out.println("The mean of array is = " +avg);
System.out.println();
}
}

/*===============output===============
smj@smj-virtual-machine:~$ javac slip6_1.java
smj@smj-virtual-machine:~$ java slip6_1
Enter a how many no = 4
Enter a  no = 1 
Enter a  no = 2
Enter a  no = 3
Enter a  no = 4

The mean of array is = 2.0

smj@smj-virtual-machine:~$*/ 
