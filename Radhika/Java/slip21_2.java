//====slip 21_2====//


import java.io.*;

class slip21_2

{

public static void main(String ar[])throws IOException

{
 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
System.out.print("Enter a file name = ");

 String file=br.readLine();


 FileReader f=new FileReader(file);
 
int ch;

 int wc=0,lc=0,cc=0;
 
while((ch=f.read())!=-1)
 
{
   
char c=(char)ch;
   
cc++;

   if(c=='\n')
   
{
     
lc++;
wc++;
   
}
   
else if((c==' ') || (c=='\n'))
   
{
    
wc++;
   
}
  
}
  
System.out.println("Line count "+lc);
  
System.out.println("word count "+wc);
  
System.out.println("char count "+cc);
  
f.close();

}

}

/*==========================output===============
smj@smj-virtual-machine:~$ javac slip21_2.java
smj@smj-virtual-machine:~$ java slip21_2
Enter a file name = circle.c
Line count 11
word count 21
char count 180
smj@smj-virtual-machine:~$ 
*/
