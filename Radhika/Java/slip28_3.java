// ======= slip 28_3 ========//

import java.util.*;
import java.io.*;
class slip28_3
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name;
double per;
Hashtable ht=new Hashtable();
String ch;
do
{
System.out.print("Enter a student name = ");
name=br.readLine();
System.out.print("Enter a percentage = ");
per=Double.parseDouble(br.readLine());
ht.put(name,per);
System.out.print("Do you want continue Y/N = ");
ch=br.readLine();
}while(ch.equals("y"));
System.out.println("Student Name \t Student per");
Set s=ht.keySet();
Iterator it=s.iterator();

while(it.hasNext())
{
Object k=it.next();
Object v=ht.get(k);
System.out.println(k+" \t \t"+v);
}
String stu;
System.out.print("Enter a spacific student name = ");
stu=br.readLine();
if(ht.containsKey(stu))
{
System.out.println("student percentage is = "+ht.get(stu));
}
else
{
System.out.println("Not found");

}
}
}

/*================= output===============
smj@smj-virtual-machine:~$ javac slip28_3.java

smj@smj-virtual-machine:~$ java slip28_3
Enter a student name = aaaa 
Enter a percentage = 89
Do you want continue Y/N = y
Enter a student name = bbbb
Enter a percentage = 90
Do you want continue Y/N = n
Student Name 	 Student per
aaaa 	 	89.0
bbbb 	 	90.0
Enter a spacific student name = bbbb
student percentage is = 90.0
smj@smj-virtual-machine:~$ 
*/
