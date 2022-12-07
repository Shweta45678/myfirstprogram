construct a LinkedLIst with elelmets:red,blue,yellow,orange.extend the program to do the following.
1.Dispaly the elements of LinkedList by using Iterator
2.Display the elememts of linkedList in reverse Order by using ListIterator.
3.create another linklist containing:pink and green.Insert this elements between blue and yellow.
-
//==============slip 26_3 ============//


import java.util.*;

import java.io.*;

class slip26_3

{

public static void main(String arg[])

{

LinkedList al=new LinkedList();

al.add("Red");
al.add("blue");
al.add("yellow");
al.add("orange");


System.out.println("Array list before revers = "+al);


ListIterator it=al.listIterator();

while(it.hasNext())

{

System.out.println(it.next());

}

System.out.println("Array list After revers = ");


while(it.hasPrevious())
//check for the previous element
{

System.out.println(it.previous());//print the previous
 element
}



LinkedList al2=new LinkedList();

al2.add("pink");
al2.add("green");
al.addAll(2,al2);

ListIterator it2=al.listIterator();

System.out.println("===========Add elements ======");


while(it2.hasNext())

{

System.out.println(it2.next());

}

}

}


/*============output===============

smj@smj-virtual-machine:~$ javac slip26_3.java


smj@smj-virtual-machine:~$ java slip26_3

Array list before revers = [Red, blue, yello, orange]

Red
blue
yello
orange

Array list After revers = 
orange
yello
blue
Red

===========Add elements ======
R
red blue pink green yellow orange