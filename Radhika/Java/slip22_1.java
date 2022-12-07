//======= slip22_1 =============//
import java.io.*;
class slip22_1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num,i,sum=0;
System.out.print("Enter a num to know whehter it is perfect or not = ");
num=Integer.parseInt(br.readLine());
for(i=1;i<num;i++)
{
if(num%i==0)
{
sum=sum+i;
}
}
if(sum==num)
{
System.out.println();
System.out.println("the num is perfect = " +num);
}
else
{
System.out.println();
System.out.println("the num is not perfect = "+num);
}
}
}

/*===================ouput===================
smj@smj-virtual-machine:~$ javac slip22_1.java
smj@smj-virtual-machine:~$ java slip22_1
Enter a num to know whehter it is perfect or not = 2

the num is not perfect = 2
smj@smj-virtual-machine:~$ javac slip22_1.java
smj@smj-virtual-machine:~$ java slip22_1
Enter a num to know whehter it is perfect or not = 6

the num is perfect = 6
smj@smj-virtual-machine:~$ 
*/
