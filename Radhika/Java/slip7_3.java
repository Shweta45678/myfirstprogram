//slip 7_3//

import java.io.*;
interface shape
{
public void area();
}

class rectangle implements shape
{
int w,l,s;
rectangle(int w,int l,int s)
{
this.w=w;
this.l=l;
this.s=s;
}
public void area()
{
double a;
a=w*l;
System.out.println("the area of reactangl is = "+a);
}
}

class square extends rectangle implements shape
{
int s;
square(int w,int l,int s)
{
super(w,l,s);
}
public void area()
{
super.area();
double a;
a=s*s;
System.out.println("the area of square is = "+a);
}
}

class circle  implements shape
{
int r;
circle(int r)
{
this.r=r;
}
public void area()
{
double a;
a=3.14*r*r;
System.out.println("the area of circle = "+a);
}
}

class slip7_3
{
public static void main(String ar[])throws IOException
{
int ra,le,wd,si;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("enter a width of rectangel = ");
wd=Integer.parseInt(br.readLine());
System.out.print("enter a length of rectangel = ");
le=Integer.parseInt(br.readLine());

System.out.println();

System.out.print("enter side of square = ");
si=Integer.parseInt(br.readLine());
square o2=new square(wd,le,si);
o2.area();

System.out.println();
System.out.print("enter radius of circle = ");
ra=Integer.parseInt(br.readLine());
circle o3=new circle(ra);
o2.area();
System.out.println(); 
}
}


/*=================output===================
smj@smj-virtual-machine:~$ javac slip7_3.java
smj@smj-virtual-machine:~$ java slip7_3
enter a width of rectangel = 3
enter a length of rectangel = 4

enter side of square = 5
the area of reactangl is = 12.0
the area of square is = 0.0

enter radius of circle = 7
the area of reactangl is = 12.0
the area of square is = 0.0

smj@smj-virtual-machine:~$ 
*/
