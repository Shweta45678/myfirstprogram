//=====slip15_3========//


import java.applet.*;

import java.awt.*;

import java.awt.event.*;

public class slip15_3 extends Applet implements MouseListener

{

private int x,y=10;

private String s="";

public void init()

{

addMouseListener(this);

}


public void paint(Graphics g)

{

g.drawString(s+"at"+"("+x+","+y+")",50,50);

}

private void setValues(String event,int x,int y)

{

s=event;

this.x=x;

this.y=y;

repaint();

}


public void mouseMoved(MouseEvent e)

{

setValues("Moved",e.getX(),e.getY());

}


public void mouseClicked(MouseEvent e)

{

setValues("Clicked",e.getX(),e.getY());

}


public void mouseReleased(MouseEvent e)

{

setValues("Release",e.getX(),e.getY());

}


public void mousePressed(MouseEvent e)

{

setValues("Pressed",e.getX(),e.getY());

}



public void mouseEntered(MouseEvent e)

{

setValues("enter",e.getX(),e.getY());

}


public void mouseExited(MouseEvent e)

{

setValues("exit",e.getX(),e.getY());

}

}



/*=================OUTPUT=================

 javac slip15_3.java

smj@smj-virtual-machine:~$ appletviewer slip15_3.html


*/
