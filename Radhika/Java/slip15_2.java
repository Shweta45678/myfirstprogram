//slip 15_2 

import java.io.*;
import java.lang.Math;
abstract class shape
{
abstract void calc_area();
abstract void calc_volume();
}

class sphere extends shape
{
int radius;
double a;
public sphere(int radius)
{
this.radius=radius;
}

public void calc_area()
{
a=4*3.14*radius*radius;
System.out.println("\nThe Area of sphere is = "+a);
}
public void calc_volume()
{
double v;
v=4*3.14*radius*radius*radius;
System.out.println("\nThe volume of sphere is = "+v);
}
}

class Cone extends shape
{
public int hight;
public int radius;

public Cone(int hight,int radius)
{
this.hight=hight;
this.radius=radius;
}

public void calc_area()
{
double a;
a=3.14*radius*(radius+Math.sqrt(hight*hight+radius*radius));
System.out.println("\nThe Area of cone is = "+a);
}
public void calc_volume()
{
double v;
v=3.14*radius*radius*hight/3;
System.out.println("\nThe Volume of cone = "+v);
}
}

class slip15_2
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int r,l,h;
System.out.print("enter a radius of sphere = ");
r=Integer.parseInt(br.readLine());
sphere ob1=new sphere(r);
ob1.calc_area();
ob1.calc_volume();

System.out.print("enter a hight of cone = ");
h=Integer.parseInt(br.readLine());

System.out.print("enter a  radius of cone = ");
l=Integer.parseInt(br.readLine());

Cone ob2=new Cone(l,h);
ob2.calc_area();
ob2.calc_volume();
System.out.println();
}
}

/*==================output==================
smj@smj-virtual-machine:~$ javac slip15_2.java
smj@smj-virtual-machine:~$ java slip15_2
enter a radius of sphere = 4

The Area of sphere is = 200.96

The volume of sphere is = 803.84
enter a hight of cone = 2
enter a  radius of cone = 3

The Area of cone is = 35.20286200991386

The Volume of cone = 12.56

smj@smj-virtual-machine:~$ 

*/
