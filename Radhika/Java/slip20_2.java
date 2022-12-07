//========slip20_2 ===========//

import java.io.*;
class slip20_2
{
public static void main(String ar[])throws IOException
{
File in=new File("Testout.txt");
File out=new File("Testout.txt");

FileReader fr=new FileReader(in);
FileWriter fw=new FileWriter(out);

int c;
while((c=fr.read())!=-1)
{
char ch=(char)c;
if(Character.isDigit(c))
{
fw.write("*");
}
else
{
fw.write(c);
}
}
fr.close();
fw.close();
}
}

/*====================output===============
//File t1

neha123
jagdish43
Ankit34456
Shubhame30
atul123459
ajit11
siddhant23445
shailesh234

//file t2

neha***
jagdish**
Ankit*****
Shubhame**
atul******
ajit**
siddhant*****
shailesh***
*/

