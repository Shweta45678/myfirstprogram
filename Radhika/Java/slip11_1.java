import java.io.*;
class slip11_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String ch;
System.out.print("Enter a char = ");
ch=br.readLine();
if(ch=="a" || ch=="e" || ch=="i" || ch=="o" || ch=="u" || ch=="A" ||ch=="E"|| ch=="I" ch=="O" || ch=="U")
{
System.out.println("char is vowel");
}
else
{
System.out.println("char is consonant");
}
}
}
