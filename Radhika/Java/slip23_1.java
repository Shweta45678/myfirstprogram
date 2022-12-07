//=========== slip23_1.=====//

import java.io.*;
interface IntOperation
{
public void ispositive(int no);
public void isnegative(int no);
}

class num implements IntOperation
{
public void ispositive(int no)
{
if(no>0)
{
System.out.println("no is positive");
}
}

public void isnegative(int no)
{
if(no<0)
{
System.out.println("no is negative ");
}
}
}

class slip23_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int no;
System.out.print("enter a no = ");
no=Integer.parseInt(br.readLine());
num oj=new num();
oj.ispositive(no);
oj.isnegative(no); 
}
}

/*******************output***************
smj@smj-virtual-machine:~$ javac slip23_1.java
smj@smj-virtual-machine:~$ java slip23_1
enter a no = 23
no is positive
smj@smj-virtual-machine:~$ javac slip23_1.java
smj@smj-virtual-machine:~$ java slip23_1
enter a no = -34
no is negative 
smj@smj-virtual-machine:~$ 
*/
