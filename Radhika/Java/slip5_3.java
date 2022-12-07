//=======slip 5_3=======//

import java.io.*;
abstract class staff
{
String name,add;
}

class fulltimestaff extends staff
{
String dept;
double salary;
fulltimestaff(String name,String add,String dept,double salary)
{
this.name=name;
this.add=add;
this.dept=dept;
this.salary=salary;
}

void disp()
{
System.out.println();
System.out.println("Name is = " +name);
System.out.println("address is = "+add);
System.out.println("department is = "+dept);
System.out.println("salary is "+salary);
System.out.println();
}
}

class parttimestaff extends staff
{
int no_of_hr;
int r_p_hr;
parttimestaff(String name,String add,int no_of_hr,int r_p_hr)
{
this.name=name;
this.add=add;
this.no_of_hr=no_of_hr;
this.r_p_hr=r_p_hr;
}

void disp()
{
System.out.println("Name is = " +name);
System.out.println("address is = "+add);
System.out.println("no_of_hr is = "+no_of_hr);
System.out.println("r_p_hr is "+r_p_hr);
System.out.println();
}
}

class slip5_3
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String nm,ad,dp;
double sal;
int nh,rh;
int n,ch;
do
{
System.out.println("1:full time staff");
System.out.println("2:part time staff");
System.out.print("Enter your choices = ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println();
System.out.print("Enter how many full time staff = ");
n=Integer.parseInt(br.readLine());
fulltimestaff obj1[]=new fulltimestaff[n];
int i;
for(i=0;i<n;i++)
{
System.out.print("Enter a Name  = ");
nm=br.readLine();
System.out.print("Enter  address  = ");
ad=br.readLine();
System.out.print("Enter department  = ");
dp=br.readLine();
System.out.print("Enter salary  = ");
sal=Double.parseDouble(br.readLine());
System.out.println();

obj1[i]=new fulltimestaff(nm,ad,dp,sal);
}
System.out.println("======Details of full time staff===========");
for(i=0;i<n;i++)
{
obj1[i].disp();
}
break;

case 2:
int m,j;
System.out.print("Enter how many part time staff = ");
m=Integer.parseInt(br.readLine());
parttimestaff obj2[]=new parttimestaff[m];

for(j=0;j<m;j++)
{
System.out.println();
System.out.print("Enter a Name  = ");
nm=br.readLine();
System.out.print("Enter  address  = ");
ad=br.readLine();
System.out.print("Enter no_of_hr  = ");
nh=Integer.parseInt(br.readLine());
System.out.print("Enter a rate_per_hr = ");
rh=Integer.parseInt(br.readLine());
System.out.println();

obj2[j]=new parttimestaff(nm,ad,nh,rh);
}
System.out.println("==========Details of part time staff===========");
for(j=0;j<m;j++)
{
obj2[j].disp();
}
break;
default:System.out.println("Invalid choices = ");
}
}while(ch!=2);
}
}

/*===============output===================
smj@smj-virtual-machine:~$ javac slip5_3.java
smj@smj-virtual-machine:~$ java slip5_3
1:full time staff
2:part time staff
Enter your choices = 1

Enter how many full time staff = 2
Enter a Name  = janvi
Enter  address  = kharadi
Enter department  = manager
Enter salary  = 6000000

Enter a Name  = jagdish
Enter  address  = kharadi
Enter department  = IT cyber security
Enter salary  = 700000

======Details of full time staff===========

Name is = janvi 
address is = kharadi
department is = manager
salary is 6000000.0


Name is = jagdish
address is = kharadi
department is = IT cyber security
salary is 700000.0

1:full time staff
2:part time staff
Enter your choices = 2
Enter how many part time staff = 2

Enter a Name  = Neha varma           
Enter  address  = EON pune
Enter no_of_hr  = 9
Enter a rate_per_hr = 50


Enter a Name  = Ankit pawar
Enter  address  = magarpatta city
Enter no_of_hr  = 8
Enter a rate_per_hr = 40

==========Details of part time staff===========

Name is = Neha varma
address is = EON pune
no_of_hr is = 9
r_p_hr is 50

Name is = Ankit pawar
address is = magarpatta city
no_of_hr is = 8
r_p_hr is 40
*/
