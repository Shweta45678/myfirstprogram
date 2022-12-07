// ========== slip 29_2 ========//

import java.io.RandomAccessFile;
import java.io.*;
class slip29_2
{
public static void main(String arg[])throws IOException
{
File in=new File("a.c");
FileReader fr=new FileReader(in);

RandomAccessFile raf=new RandomAccessFile("a.c","r");
long pos=raf.length();
int ch;
while((ch=fr.read())!=-1)
{
while(pos>0)
{
pos=pos-1;
raf.seek(pos);
byte b=raf.readByte();
System.out.print((char)b);

}
}
fr.close();
}
}

/*=================== output============
smj@smj-virtual-machine:~$ javac slip29_2.java
smj@smj-virtual-machine:~$ java slip29_2
\
}
;)a)tni(,"d% si edoc iicsa eht"(ftnirp
;)a&,"c%"(fnacs
;)"= rahc a retne"(ftnirp
;a rahc
{
)(niam diov
>h.oidts<edulcni#

//EDOC IICSA//smj@smj-virtual-machine:~$ 
*/
