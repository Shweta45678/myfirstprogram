//==========  slip25_2 ========//

import java.io.*;
class student
{
int rollno;
String name;
double per;
public student(int r,String n,double p)
{
rollno=r;
name=n;
per=p;
}
public String toString()
{
return rollno+" "+name+" "+per;
}
}

class slip25_2
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i;
int rr;
String nn;
double pp;
System.out.print("Enter a how many student want = ");
n=Integer.parseInt(br.readLine());
student a[]=new student[n];
for(i=0;i<n;i++)
{
System.out.print("Enter a stud roll no = ");
rr=Integer.parseInt(br.readLine());
System.out.print("Enter a stud name = ");
nn=br.readLine();
System.out.print("Enter a stud percentage  = ");
pp=Double.parseDouble(br.readLine());
a[i]=new student(rr,nn,pp);
}
System.out.println("===========Display details===========");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}


/*==================output=================
smj@smj-virtual-machine:~$ javac slip25_2.java
smj@smj-virtual-machine:~$ java slip25_2
Enter a how many student want = 2
Enter a stud roll no = 1
Enter a stud name = ankit
Enter a stud percentage  = 90
Enter a stud roll no = 2
Enter a stud name = jagdish
Enter a stud percentage  = 90
===========Display details===========
1 ankit 90.0
2 jagdish 90.0
smj@smj-virtual-machine:~$ 
*/
