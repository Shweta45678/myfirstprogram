// slip 1. Q1 //Find max element of an array//

import java.io.*;
class slip1_1
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int max,i,n;
//array declaration
int a[]=new int[10];

System.out.print("enter a how many element you want= ");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
System.out.print("enter a element = ");
a[i]=Integer.parseInt(br.readLine());
}
max=a[0];

for(i=0;i<n;i++)
{
if(max<a[i])  
{              
max=a[i];      
}
}

System.out.println("\nTHE MAX ELEMENT IS= "+max);
}
}

/*================OUTPUT===============
smj@smj-virtual-machine:~$ javac Max.java
smj@smj-virtual-machine:~$ java Max
enter a how many element you want= 4
enter a element = 12
enter a element = 3
enter a element = 24
enter a element = 54

THE MAX ELEMENT IS= 54
smj@smj-virtual-machine:~$ 
*/
