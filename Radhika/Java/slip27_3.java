//========= slip 27_3 ==========//

import java.io.*;
class AgeNotWithinRange extends Exception
{

}
class NameNotvalid extends Exception
{

}

class Student
{
int rollno;
String name;
int age;
String course;

Student(int r,String n,int a,String c)
{
rollno=r;
name=n;
age=a;
course=c;
try
{
if(age < 15 || age > 21)
{
throw  new AgeNotWithinRange();
}
}
catch(AgeNotWithinRange e)
{
System.out.println("invalid age");
}
int i,l,temp=0;
char ch;
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
}
catch(NameNotvalid e)
{
System.out.println("Name Not valid");
}
}
}
}

class slip27_3
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int r,a;
String n,c;
System.out.print("Enter a student roll no = ");
r=Integer.parseInt(br.readLine());
System.out.print("Enter a student Name = ");
n=br.readLine();
System.out.print("Enter a student age = ");
a=Integer.parseInt(br.readLine());
System.out.print("Enter a student course = ");
c=br.readLine();

Student s1=new Student(r,n,a,c);
}
}

/*================ output================
smj@smj-virtual-machine:~$ javac sk.java
^[[Asmj@smj-virtual-machine:~$ java sk
Enter a student roll no = 12
Enter a student Name = A@#tu12l        
Enter a student age = 90
Enter a student course = BCA
invalid age
Name Not valid
Name Not valid
Name Not valid
Name Not valid
Name Not valid
Name Not valid
Name Not valid
smj@smj-virtual-machine:~$ 
*/
