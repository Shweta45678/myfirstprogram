//=======slip8_2=========//


import java.util.*;

import java.io.*;

class slip8_2

{

public static void main(String arg[])throws IOException

{

String name;

double salary;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

Hashtable ht=new Hashtable();

String ch;

do

{

System.out.print("Enter a Emp name = ");

name=br.readLine();

System.out.print("Enter a Emp salary = ");

salary=Double.parseDouble(br.readLine());

ht.put(name,salary);

System.out.print("you want continue Y/N = ");

ch=br.readLine();

}
while(ch.equals("y"));


System.out.println("Emp name \t Salary");

Set s=ht.keySet();

Iterator it=s.iterator();


while(it.hasNext())

{

Object k=it.next();

Object v=ht.get(k);

System.out.println(k+"\t"+v);

}

System.out.print("Enter a name of spacific Emp = ");

String em=br.readLine();

if(ht.containsKey(em))

{

System.out.println("Emp salary is = "+salary);

}

else

{

System.out.println("Emp salary is not found");

}

}

}


/*=================== output==============

smj@smj-virtual-machine:~$ javac slip8_2.java


smj@smj-virtual-machine:~$ java slip8_2

Enter a Emp name = aaaa

Enter a Emp salary = 60000

you want continue Y/N = y

Enter a Emp name = bbbb

Enter a Emp salary = 70000

you want continue Y/N = n

Emp name  Salary

aaaa	60000.0

bbbb	70000.0

