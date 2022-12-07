//======slip 18_1 ==========//

import java.io.*;
class primeno
{
public void prime(int s,int e)
{
int i,j,p;
for(i=s;i<=e;i++)
{
p=1;
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
p=0;
break;
}
}
if(p==1)
{
System.out.println(i);
}
}
}
}

class slip18_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a start no = ");
int st=Integer.parseInt(br.readLine());

System.out.print("Enter a end no = ");
int en=Integer.parseInt(br.readLine());

primeno p=new primeno();
p.prime(st,en);
}
}

/*===================output===============
smj@smj-virtual-machine:~$ javac slip18_1.java
smj@smj-virtual-machine:~$ java slip18_1
Enter a start no = 1
Enter a end no = 10
1
2
3
5
7
smj@smj-virtual-machine:~$ 
*/
