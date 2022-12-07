WAP to accept the elements from the user,and store the elements in ArrayList.
Display the elements of ArrayList in reverse order.

//==========slip 3_2==========//


import java.util.*;

import java.io.*;

class slip3_2

{

public static void main(String arg[])

{

ArrayList al=new ArrayList();

al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);

System.out.println("Array list before revers = "+al);

ListIterator it=al.listIterator();

while(it.hasNext())

{

  System.out.println(it.next());

}

System.out.println("Array list After revers = ");

while(it.hasPrevious())

{
  
System.out.println(it.previous());

}

}

}


/*===================output===================

smj@smj-virtual-machine:~$ javac slip3_2.java

Note: slip3_2.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

smj@smj-virtual-machine:~$ java slip3_2

Array list before revers = [1, 2, 3, 4, 5]

1
2
3
4
5

Array list After revers = 
5
4
3
2
1

