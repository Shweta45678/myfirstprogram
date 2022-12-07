//============= slip27_2 ============//

import java.io.*;
class slip27_2
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a file name = ");
String file=br.readLine();
FileReader fr=new FileReader(file);
int ch;
int wc=0,lc=0,cc=0;
while((ch=fr.read())!=-1)
{
char c=(char)ch;
cc++;
if(c=='\n')
{
lc++;
wc++;
}
else if(c==' ' || c=='\n')
{
wc++;
}
}
System.out.println("the character count = "+cc);
System.out.println("the word count = "+wc);
System.out.println("the line count = "+lc);
fr.close();

}
}

/*===============output============
mj@smj-virtual-machine:~$ javac slip27_2.java
smj@smj-virtual-machine:~$ java slip27_2
Enter a file name = n.txt
the character count = 7
the word count = 2
the line count = 1
smj@smj-virtual-machine:~

*/
