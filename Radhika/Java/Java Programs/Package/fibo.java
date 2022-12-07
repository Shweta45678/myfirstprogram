//====slip 10_3 ====//

package series;
class fibo
{
int n,i;
int a=0,b=1,c;
public fibo(int n)
{
this.n=n;
}

public void fib()
{
System.out.println(a);
System.out.println(b);
for(i=0;i<n;i++)
{
c=a+b;
a=b;
b=c;
System.out.println(c);
}
}
}
