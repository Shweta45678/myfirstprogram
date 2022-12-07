//slip 9_2//

import java.io.*;
class MyNumber
{
public int no;
public MyNumber()
{
no=0;
}
public MyNumber(int no)
{
this.no=no;
}
public void isNegative()
{
if(no<0)
{
System.out.println("no is Negative");
}
}

public void isPositive()
{
if(no>0)
{
System.out.println("no is Positive");
}
}

public void isOdd()
{
if(no%2!=0)
{
System.out.println("no is Odd");
}
}

public void isEven()
{
if(no%2==0)
{
System.out.println("no is Even");
}
}
}

class slip9_2
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num;
System.out.print("Enter a no =");
num=Integer.parseInt(br.readLine());
MyNumber mn=new MyNumber(num);
mn.isNegative();
mn.isPositive();
mn.isOdd();
mn.isEven();
}
}


/*===================output==============
smj@smj-virtual-machine:~$ javac slip9_2.java
smj@smj-virtual-machine:~$ java slip9_2
Enter a no =4
no is Positive
no is Even
smj@smj-virtual-machine:~$ javac slip9_2.java
smj@smj-virtual-machine:~$ java slip9_2
Enter a no =1
no is Positive
no is Odd
smj@smj-virtual-machine:~$ javac slip9_2.java
smj@smj-virtual-machine:~$ java slip9_2
Enter a no =-10
no is Negative
no is Even
smj@smj-virtual-machine:~$ javac slip9_2.java
smj@smj-virtual-machine:~$ java slip9_2
Enter a no =11
no is Positive
no is Odd
smj@smj-virtual-machine:~$ 
*/
