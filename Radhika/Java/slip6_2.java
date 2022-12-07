//========= slip 6_2 ========//


import java.io.*;

import java.io.RandomAccessFile;

class slip6_2

{

public static void main(String arg[])throws IOException

{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

File f1=new File("a.c");

FileReader fr=new FileReader(f1);


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

/*================output================
smj@smj-virtual-machine:~$ javac slip6_2.java
smj@smj-virtual-machine:~$ java slip6_2

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
