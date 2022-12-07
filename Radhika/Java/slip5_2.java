//===slip 5_2====//


import java.io.*;

class IncorrectPassword extends Exception
{

}


class slip5_2

{

  public static void main(String ar[])throws IOException
  
{
    
String u_name="google";
    
String password="google@123";
    
String un,pass;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("\nenter a user name = ");

un=br.readLine();

System.out.print("enter a password = ");

pass=br.readLine();

try

{
  
if(u_name.equals(un) || password.equals(pass))
   
{
    
System.out.println("\nUser Name and Password are valid\n");

   }
  
else
 
  {

     throw new IncorrectPassword();

   }

}
 
catch(IncorrectPassword e)

{
  
System.out.println("\nIncorrect Password Exception\n");

}

}

}


/*===============output====================

smj@smj-virtual-machine:~$ javac slip5_2.java

smj@smj-virtual-machine:~$ java slip5_2


enter a user name = google

enter a password = google@123


User Name and Password are valid
      OR



smj@smj-virtual-machine:~$ javac slip5_2.java

smj@smj-virtual-machine:~$ java slip5_2


enter a user name = smj

enter a password = smj@123


Incorrect Password Exception*/
