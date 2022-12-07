//======slip 10_3 =======//

package series;
import series.fibo;
import series.cube;
import series.square;
import java.io.*;
class slip10_3
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
System.out.println("enter a n term = ");
n=Integer.parseInt(br.readLine());
System.out.println("== Fibonacci series is== ");
fibo o1=new fibo(n);
o1.fib();

System.out.println("===== cube series is ===");
cube o2=new cube(n);
o2.cub();

System.out.println("===== square series is ===");
square o3=new square(n);
o3.sq();
}
}

/*===================output=================
smj@smj-virtual-machine:~$ javac /home/smj/series/slip10_3.java;
smj@smj-virtual-machine:~$ java series.slip10_3;
enter a n term = 
7
== Fibonacci series is== 
0
1
1
2
3
5
8
13
21
===== cube series is ===
1 = 1
2 = 8
3 = 27
4 = 64
5 = 125
6 = 216
===== square series is ===
0 = 0
1 = 1
2 = 4
3 = 9
4 = 16
5 = 25
6 = 36

*/
