//=======slip 20_3 ======//

import java.io.*;
class NameNotvalid extends Exception
{

}
class InvalidAge extends Exception
{

}



class empInfo
{
int age;
String name;

empInfo(int age,String name)
{
int l,i,temp=0;
char ch;
try
{
if(age<18 ||age>60)
{
throw new InvalidAge();
}
else
{
this.age=age;
}
}
catch(InvalidAge e)
{
System.out.println(e);
}


l=name.length();
for(i=0;i<l;i++)
{
ch=name.charAt(i);
if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
{
temp=1;
}

try
{
if(temp==1)
{
throw new NameNotvalid();
}
else
{
this.name=name;
}
}

catch(NameNotvalid e)
{
System.out.println(e);
}
}
}
void dis()
{
System.out.println();
System.out.println("emp age is = "+age);
System.out.println("emp name is = "+name);
System.out.println();
}
}


class slip20_3
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String n;
int a;
System.out.print("Enter a age =");
a=Integer.parseInt(br.readLine());
System.out.print("enter a name = ");
n=br.readLine();
empInfo s=new empInfo(a,n);
s.dis();
}
}

/*=================output==================
smj@smj-virtual-machine:~$ javac slip20_3.java
smj@smj-virtual-machine:~$ java slip20_3
Enter a age =10
enter a name = jagdish@#12
InvalidAge
NameNotvalid
NameNotvalid
NameNotvalid
NameNotvalid

emp age is = 0
emp name is = jagdish@#12

smj@smj-virtual-machine:~$ javac slip20_3.java
smj@smj-virtual-machine:~$ java slip20_3
Enter a age =20
enter a name = Jagdish

emp age is = 20
emp name is = Jagdish

smj@smj-virtual-machine:~$ 
*/
