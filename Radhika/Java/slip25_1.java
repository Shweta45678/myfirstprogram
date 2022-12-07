//========== slip 25_1=========//

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

class slip25_1
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int start,end;
System.out.print("Enter a strat no should be start prime no = ");
start=Integer.parseInt(br.readLine());
System.out.print("Enter a end no = ");
end=Integer.parseInt(br.readLine());
primeno p=new primeno();
p.prime(start,end);
}
}

/*====================Output============
smj@smj-virtual-machine:~$ javac slip25_1.java
smj@smj-virtual-machine:~$ java slip25_1
Enter a strat no should be start prime no = 1
Enter a end no = 10
1
2
3
5
7
smj@smj-virtual-machine:~$ 
*/
