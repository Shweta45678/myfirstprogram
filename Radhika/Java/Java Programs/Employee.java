//========slip 12_3==========//

import java.io.*;
class emp
{
int id;
String name,dept;
double salary;

public emp()
{}
public emp(int id,String name,String dept,double salary)
{
this.id=id;
this.name=name;
this.dept=name;
this.salary=salary;
}

public void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a Emp id = ");
id=Integer.parseInt(br.readLine());

System.out.print("Enter a Emp Name = ");
name=br.readLine();

System.out.print("Enter a Emp dept = ");
dept=br.readLine();

System.out.print("Enter a Emp salary = ");
salary=Double.parseDouble(br.readLine());

}

public void display()
{
System.out.println("The Emp id is = "+id);
System.out.println("The Emp Name is = "+name);
System.out.println("The Emp dept is = "+dept);
System.out.println("The Emp salary is = "+salary);

}
}

class Manager extends emp
{
double total_salary,bonus;
Manager()
{}

public Manager(int id,String name,String dept,double salary,double bonus)
{
super(id,name,dept,salary);
this.bonus=bonus;
}

public void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a manager id = ");
id=Integer.parseInt(br.readLine());

System.out.print("Enter a manager Name = ");
name=br.readLine();

System.out.print("Enter a manager dept = ");
dept=br.readLine();

System.out.print("Enter a manager salary = ");
salary=Double.parseDouble(br.readLine());

System.out.print("Enter a manager bonus = ");
bonus=Double.parseDouble(br.readLine());

total_salary=salary+bonus;
}

public void display()
{
System.out.println();
System.out.println("The manager id is = "+id);
System.out.println("The manager Name is = "+name);
System.out.println("The manager dept is = "+dept);
System.out.println("The manager salary is = "+salary);
System.out.println("The manager total salary is = "+total_salary);
}
}

class slip12_3
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double max_s=0;
int i,n;
emp o1=new emp();
o1.accept();
System.out.println();
o1.display();
System.out.println();
System.out.print("Enter a how many Manager = ");
n=Integer.parseInt(br.readLine());
Manager o2[]=new Manager[n];
System.out.println();
for(i=0;i<n;i++)
{
o2[i]=new Manager();
o2[i].accept();
}
System.out.println();
for(i=0;i<n;i++)
{
o2[i].display();
}
System.out.println();
max_s=o2[0].salary;
for(i=0;i<n;i++)
{
if(max_s<o2[i].salary)
{
max_s=o2[i].salary;
}
}
System.out.println();
for(i=0;i<n;i++)
{
if(max_s==o2[i].salary)
{
System.out.println("The Maximum salary of Manager is = "+o2[i].name);
System.out.println("The Maximum salary of Manager is = "+max_s);
}
}
System.out.println();
}
}

/*===================output================
smj@smj-virtual-machine:~$ javac slip12_3.java
smj@smj-virtual-machine:~$ java slip12_3
Enter a Emp id = 111
Enter a Emp Name = Ankit Pawar                
Enter a Emp dept = IT 
Enter a Emp salary = 50000        

The Emp id is = 111
The Emp Name is = Ankit Pawar
The Emp dept is = IT 
The Emp salary is = 50000.0

Enter a how many Manager = 2

Enter a manager id = 10101
Enter a manager Name = Jagdish Dusane
Enter a manager dept = IT Manager
Enter a manager salary = 10000
Enter a manager bonus = 50000
Enter a manager id = 20202
Enter a manager Name = Shubham Garad
Enter a manager dept = bankig
Enter a manager salary = 4000 
Enter a manager bonus = 5000 


The manager id is = 10101
The manager Name is = Jagdish Dusane
The manager dept is = IT Manager
The manager salary is = 10000.0
The manager total salary is = 60000.0

The manager id is = 20202
The manager Name is = Shubham Garad
The manager dept is = banking
The manager salary is = 4000.0
The manager total salary is = 9000.0


The Maximum salary of Manager is = Jagdish Dusane
The Maximum salary of Manager is = 10000.0

smj@smj-virtual-machine:~$
*/
