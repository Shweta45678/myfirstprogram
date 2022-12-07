//========= slip 28_2 =========//

import java.io.*;
abstract class shape
{
abstract void area();
abstract void volume();
}
class sphere extends shape
{
int r;
sphere(int r)
{
this.r=r;
}
void area()
{
double a;
a=4*3.14*r*r;
System.out.println("area of sphere = "+a);
}

void volume()
{
double v;
v=(4*3.14*r*r*r)/3;
System.out.println("volume of sphere = "+v);
}

}

class cylinder extends shape
{
int r,h;
cylinder(int r,int h)
{
this.r=r;
this.h=h;
}
void area()
{
double a=2*3.14*r*h+2*3.14*r*r;
System.out.println("area of cylinder = "+a);
}

void volume()
{
double v=3.14*r*r*h;
System.out.println("volume of cylinder = "+v);
}
}

class slip28_2
{
public static void main(String arf[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int r,h;
System.out.println("Enter a radius of sphere = ");
r=Integer.parseInt(br.readLine());
System.out.println("Enter a radius of cylinder = ");
r=Integer.parseInt(br.readLine());
System.out.println("Enter a hight of cylinder = ");
h=Integer.parseInt(br.readLine());

sphere s=new sphere(r);
s.area();
s.volume();

cylinder c=new cylinder(r,h);
c.area();
c.volume();
}
}

/*==================== output============
smj@smj-virtual-machine:~$ javac slip28_2.java
smj@smj-virtual-machine:~$ java slip28_2
Enter a radius of sphere = 
3
Enter a radius of cylinder = 
5
Enter a hight of cylinder = 
6
area of sphere = 314.0
volume of sphere = 523.3333333333334
area of cylinder = 345.4
volume of cylinder = 471.0
smj@smj-virtual-machine:~$ 
*/
