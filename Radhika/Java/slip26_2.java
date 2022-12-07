//============== slip 26_2 ===========//

import java.io.*;
class  emp
{
String name;
double salary;

emp(String name,double salary)
{
this.name=name;
this.salary=salary;
}
void display()
{
System.out.println("emp name is = "+name);
System.out.println("emp salary is = "+salary);
}
}

class slip26_2
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String nn;
double sa;
int i,n;
System.out.print("Enter how many emp = ");
n=Integer.parseInt(br.readLine());
emp e[]=new emp[n];
for(i=0;i<n;i++)
{
System.out.print("Enter a Emp name = ");
nn=br.readLine();
System.out.print("Enter a Emp salary = ");
sa=Double.parseDouble(br.readLine());
e[i]=new emp(nn,sa);
}
System.out.println();
for(i=0;i<n;i++)
{
e[i].display();
}
System.out.println();
double s_max=e[0].salary;
for(i=0;i<n;i++)
{
if(s_max<e[i].salary)
{
s_max=e[i].salary;
}
}
System.out.println();
System.out.println("===== The max salary ======");
for(i=0;i<n;i++)
{
if(e[i].salary==s_max)
{
System.out.println("emp name is = "+e[i].name);
System.out.println("emp salary is = "+e[i].salary);
}
}
}
}

/*============= output================
Enter a Emp salary = 70000
Enter a Emp name = ankit
Enter a Emp salary = 50000
Enter a Emp name = atul
Enter a Emp salary = 60000
Enter a Emp name = shubham
Enter a Emp salary = 65000

emp name is = jagdish
emp salary is = 750000.0
emp name is = Neha varma
emp salary is = 70000.0
emp name is = ankit
emp salary is = 50000.0
emp name is = atul
emp salary is = 60000.0
emp name is = shubham
emp salary is = 65000.0


===== The max salary ======
emp name is = jagdish
emp salary is = 750000.0
smj@smj-virtual-machine:~$ 

*/
