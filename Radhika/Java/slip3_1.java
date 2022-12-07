//===slip 3_1====//

import java.io.*;
class factorial
{
public int fact(int no)
{
if(no>0)
{
return(no*fact(no-1));
}
else
{
return 1;
}
}
}

class slip3_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int no,ans;
System.out.print("enter a no = ");
no=Integer.parseInt(br.readLine());

Time o1=new Time();
ans=o1.fact(no);
System.out.println("The factorial no is = "+ans);
}
}

/*=============output===============
smj@smj-virtual-machine:~$ javac mint.java
smj@smj-virtual-machine:~$ java mint
enter a no = 5
The factorial no is = 120
smj@smj-virtual-machine:~$ 
*/
