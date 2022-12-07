//slip 4_2//

import java.io.*;
class person
{
int pid,age;
String pname,gender;

public person(int pid,String pname,int age,String gender)
{
this.pid=pid;
this.pname=pname;
this.age=age;
this.gender=gender;
}

public String toString()                    
{
return pid+" "+pname+" "+age +" "+gender;
}
}

class slip4_2
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int pi,ag,n,i;
String pn,gen;
System.out.print("enter a how many person = ");
n=Integer.parseInt(br.readLine());

person obj[]=new person[n];

for(i=0;i<n;i++)
{
System.out.print("enter a pid = ");
pi=Integer.parseInt(br.readLine());
System.out.print("enter a pname = ");
pn=br.readLine();
System.out.print("enter a age = ");
ag=Integer.parseInt(br.readLine());
System.out.print("enter a gender = ");
gen=br.readLine();
System.out.println();
obj[i]=new person(pi,pn,ag,gen);
}

System.out.println("\nDisplay person details\n");
for(i=0;i<n;i++)
{
System.out.println(obj[i]);
}
}
}

/*==========output================

smj@smj-virtual-machine:~$ javac slip4_2.java
smj@smj-virtual-machine:~$ java slip4_2
enter a how many person = 2
enter a pid = 111
enter a pname = jagdish
enter a age = 19
enter a gender = male

enter a pid = 222
enter a pname = ankit
enter a age = 20
enter a gender = male


Display person details

111 jagdish 19 male
222 ankit 20 male
smj@smj-virtual-machine:~$ */
