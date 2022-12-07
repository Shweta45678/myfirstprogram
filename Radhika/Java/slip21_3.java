//========slip 21_3======//

import java.io.*;
class Insfficiant_Fund_Excepion extends Exception
{

}

class savingAccount
{
int acc_no;
double balances;
String name;
savingAccount(double balances,int acc_no,String name)
{
this.balances=balances;
this.acc_no=acc_no;
this.name=name;
System.out.println();

System.out.println("the account name is = "+name);
System.out.println("the account number is = "+acc_no);
System.out.println("the account balances is = "+balances);
}

void withdraw()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("enter a amount ot be withdraw = ");
double w_amt=Double.parseDouble(br.readLine());

try
{
if(w_amt>(balances-500))
{
throw new Insfficiant_Fund_Excepion();
}
else 
{
balances=balances-w_amt;
System.out.println("collect cash");
}
}
catch(Insfficiantbalances e)
{
System.out.println("insufficient balances");
}
}


void diposit() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter diposit amount = ");
double d_amt=Double.parseDouble(br.readLine());
balances=balances+d_amt;
System.out.println("the total amount is = "+balances);
}

void view_balances() 
{
System.out.println("present balances is = "+balances);
}
}

class slip21_3
{
public static void main(String ar[])throws IOException
{
int ch;
int c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
savingAccount o1=new savingAccount(5000,1123415,"saving account");
System.out.println();
do
{
System.out.println("1:withdraw money\n2:diposit\n3:view balances\n\n");
System.out.print("enter your choices = ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1: o1.withdraw();
break;
case 2: o1.diposit();
break;
case 3: o1.view_balances();
break;
default:System.out.println("invalid case");
}
System.out.println();
System.out.println("you want continue or not (1/0)");
c=Integer.parseInt(br.readLine());
if(c==0)
break;

}while(true);
}
}

/*=============output=============
smj@smj-virtual-machine:~$ javac slip21_3.java
smj@smj-virtual-machine:~$ java slip21_3

the account name is = saving account
the account number is = 1123415
the account balances is = 5000.0

1:withdraw money
2:diposit
3:view balances


enter your choices = 1
enter a amount ot be withdraw = 5000
insufficient balances

you want continue or not (1/0)
1
1:withdraw money
2:diposit
3:view balances


enter your choices = 3
present balances is = 5000.0

you want continue or not (1/0)
1
1:withdraw money
2:diposit
3:view balances


enter your choices = 1
enter a amount ot be withdraw = 4000
collect cash

you want continue or not (1/0)
1
1:withdraw money
2:diposit
3:view balances


enter your choices = 1500
invalid case

you want continue or not (1/0)
1
1:withdraw money
2:diposit
3:view balances


enter your choices = 3
present balances is = 1000.0

you want continue or not (1/0)
1
1:withdraw money
2:diposit
3:view balances


enter your choices = 1  
enter a amount ot be withdraw = 600
insufficient balances

you want continue or not (1/0)
1
1:withdraw money
2:diposit
3:view balances


enter your choices = 3
present balances is = 1000.0

you want continue or not (1/0)
1
1:withdraw money
2:diposit
3:view balances


enter your choices = 1  
enter a amount ot be withdraw = 500
collect cash

you want continue or not (1/0)
1
1:withdraw money
2:diposit
3:view balances


enter your choices = 3
present balances is = 500.0

you want continue or not (1/0)

*/
