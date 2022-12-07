//slip 1_2 

import java.io.*;
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

class box extends shape
{
public int hight;
public int breadth;
public int length;
public box(int hight,int breadth,int length)
{
this.hight=hight;
this.breadth=breadth;
this.length=length;
}

public void calc_area()
{
double a;
a=2*(hight*breadth)+2*(hight*length)+2*(breadth*length);
System.out.println("\nThe Area of box is = "+a);
}
public void calc_volume()
{
double v;
v=hight*breadth*length;
System.out.println("\nThe Volume of box = "+v);
}
}

class slip1_2
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int r,l,b,h;
System.out.print("enter a radius of sphere = ");
r=Integer.parseInt(br.readLine());
sphere ob1=new sphere(r);
ob1.calc_area();
ob1.calc_volume();

System.out.print("enter a length of box = ");
l=Integer.parseInt(br.readLine());
System.out.print("enter a breadth of box = ");
b=Integer.parseInt(br.readLine());
System.out.print("enter a hight box = ");
h=Integer.parseInt(br.readLine());
box ob2=new box(l,b,h);
ob2.calc_area();
ob2.calc_volume();
System.out.println();
}
}

/*=================OUTPUT============
smj@smj-virtual-machine:~$ javac slip1_2.java
smj@smj-virtual-machine:~$ java slip1_2
enter a radius of sphere = 3

The Area of sphere is = 113.03999999999999

The volume of sphere is = 339.12
enter a length of box = 2
enter a breadth of box = 2
enter a hight box = 2

The Area of box is = 24.0

The Volume of box = 8.0

smj@smj-virtual-machine:~$ 
*/
