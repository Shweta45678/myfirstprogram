//=======slip 16_1=====//

import java.io.*;
class slip16_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int base,exp;
System.out.print("Enter a base no = ");
base=Integer.parseInt(br.readLine());
System.out.print("Enter a exponent no = ");
exp=Integer.parseInt(br.readLine());

int ans=power(base,exp);
System.out.println(base+" ^ "+exp+" = "+ans); 
}

public static int power(int base,int exp)
{
if(exp!=0)
return(base*power(base,exp-1));
else
return 1;
}
}

/*=====================output================
smj@smj-virtual-machine:~$ javac slip16_1.java
smj@smj-virtual-machine:~$ java slip16_1
Enter a base no = 2
Enter a exponent no = 2
2 ^ 2 = 4
smj@smj-virtual-machine:~$ 
*/
