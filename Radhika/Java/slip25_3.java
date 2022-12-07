//======= slip 25_3 ==========//

import java.io.*;
abstract class staff
{
String name,add;
}
class Fulltimestaff extends staff
{
String dept;
double salary;
public Fulltimestaff(String name,String add,String dept,double salary)
{
this.name=name;
this.add=add;
this.dept=dept;
this.salary=salary;
}
void display()
{
System.out.println("name = "+name);
System.out.println("address "+add);
System.out.println("department = "+dept);
System.out.println("salary = "+salary);
}
}

class Parttimestaff extends staff
{
int no_of_hr,rate_per_hr;
public Parttimestaff(String name,String add,int no_of_hr,int rate_per_hr)
{
this.name=name;
this.add=add;
this.no_of_hr=no_of_hr;
this.rate_per_hr=rate_per_hr;
}
void display()
{
System.out.println("name = "+name);
System.out.println("address "+add);
System.out.println("no_of_hr = "+no_of_hr);
System.out.println("rate_per_hr = "+rate_per_hr);
}
}

class slip25_3
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,j,m,ch;
String nn,aa;
String dp;
double ss;
int nh,rh;
do
{
System.out.println("1: Full time staff");
System.out.println("2: Part time staff");
System.out.print("Enter your choice = ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.print("Enter how many Full time staff = ");
n=Integer.parseInt(br.readLine());
Fulltimestaff a[]=new Fulltimestaff[n];
for(i=0;i<n;i++)
{
System.out.print("Enter a name = ");
nn=br.readLine();
System.out.print("Enter a address = ");
aa=br.readLine();
System.out.print("Enter a department = ");
dp=br.readLine();
System.out.print("Enter a Salary = ");
ss=Double.parseDouble(br.readLine());
a[i]=new Fulltimestaff(nn,aa,dp,ss);
}
System.out.println();
System.out.println("=========== Display Full time staff ======== ");
for(i=0;i<n;i++)
{
a[i].display();
}
System.out.println();
break;
case 2:
System.out.print("Enter how many Part time staff = ");
m=Integer.parseInt(br.readLine());
Parttimestaff b[]=new Parttimestaff[m];
for(j=0;j<m;j++)
{
System.out.print("Enter a name = ");
nn=br.readLine();
System.out.print("Enter a address = ");
aa=br.readLine();
System.out.print("Enter a no_of_hr = ");
nh=Integer.parseInt(br.readLine());
System.out.print("Enter a rate_per_hr = ");
rh=Integer.parseInt(br.readLine());
b[j]=new Parttimestaff(nn,aa,nh,rh);
}
System.out.println();
System.out.println("=========== Display Part time staff ======== ");
for(j=0;j<m;j++)
{
b[j].display();
}
System.out.println();
break;
default:System.out.println("Invalid case");
}
System.out.println("your want continue Y/N(1/0)");
int c;
c=Integer.parseInt(br.readLine());
if(c==0)
break;

}
while(true);
}
}

/*=================== output================
smj@smj-virtual-machine:~$ javac slip25_3.java
smj@smj-virtual-machine:~$ java slip25_3
1: Full time staff
2: Part time staff
Enter your choice = 1
Enter how many Full time staff = 2
Enter a name = aaaa
Enter a address = pune
Enter a department = IT
Enter a Salary = 40000
Enter a name = bbb
Enter a address = kharadi
Enter a department = manager
Enter a Salary = 70000

=========== Display Full time staff ======== 
name = aaaa
address pune
department = IT
salary = 40000.0
name = bbb
address kharadi
department = manager
salary = 70000.0

your want continue Y/N(1/0)
1
1: Full time staff
2: Part time staff
Enter your choice = 2
Enter how many Part time staff = 2
Enter a name = xyz
Enter a address = pune
Enter a no_of_hr = 6
Enter a rate_per_hr = 55
Enter a name = nheha
Enter a address = pune
Enter a no_of_hr = 9
Enter a rate_per_hr = 53

=========== Display Part time staff ======== 
name = xyz
address pune
no_of_hr = 6
rate_per_hr = 55
name = nheha
address pune
no_of_hr = 9
rate_per_hr = 53

your want continue Y/N(1/0)
0
smj@smj-virtual-machine:~$ 
*/
