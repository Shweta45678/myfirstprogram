construct a LinkedLIst with elelmets:CPP,java,python,PHP.extend the program to do the following.
1.Dispaly the elements of LinkedList by using Iterator
2.Display the elememts of linkedList in reverse Order by using ListIterator.

//====slip19_2 =====//


import java.util.*;

import java.io.*;

class slip19_2

{

public static void main(String arg[])

{

LinkedList al=new LinkedList();

al.add("cpp");
al.add("java");

al.add("python");
al.add("php");

System.out.println("Display the containt of list ");

ListIterator it=al.listIterator();

while(it.hasNext())

{

System.out.println(it.next());

}

System.out.println("Link list After revers = ");

while(it.hasPrevious())

{
System.out.println(it.previous());

}

}

}


/*===============output==============
smj@smj-virtual-machine:~$ javac slip19_2.java

 
smj@smj-virtual-machine:~$ java slip19_2
Display the containt of list 
cpp
java
python
php

Link list After revers = 
php
python
java
cpp

smj@smj-virtual-machine:~$ 

*/
