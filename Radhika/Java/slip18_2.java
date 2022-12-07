//===== slip 18_2 =====//



import java.io.*;

class slip18_2

{

  public static void main(String ar[])throws IOException
   
{
  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

   String file;
 
System.out.print("Enter a File Name = ");
  
file=br.readLine();

  FileReader f=new FileReader(file);


  int ch;
  
while((ch=f.read())!=-1)

  {
     
char c=(char)ch;

     if(Character.isUpperCase(c))

     {
       
c=Character.toLowerCase(c);
       
System.out.print(c);

     }
     
else if(Character.isLowerCase(c))
     
{
       
c=Character.toUpperCase(c);
       
System.out.print(c);
     
}
    
else if(Character.isDigit(c))

     {
       
System.out.print(c);

     }
    
else if(Character.isSpace(c))

   {
      
System.out.print(c);

   }

}
  
f.close();

}
 
}


/*===================output=================

smj@smj-virtual-machine:~$ java slip18_2

Enter a File Name = e.cpp

CLASS eMP

INT ID1213456789

VOID fUN

COUTID
coutto diadf


VOID MAIN

EMP E
EFUN
*/
