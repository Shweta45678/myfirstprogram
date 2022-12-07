//=======slip16_3========//


import javax.swing.*;

import java.awt.*;

class slip16_3

{

public static void main(String arg[])

{

  JFrame f=new JFrame("Calculator");
  
JPanel p1=new JPanel();
  
JPanel p2=new JPanel();
  
JTextField tf=new JTextField();


JButton b1=new JButton("7");


JButton b2=new JButton("4");

JButton b3=new JButton("1");


JButton b4=new JButton("0");


JButton b5=new JButton("8");



JButton b6=new JButton("5");

JButton b7=new JButton("2");



JButton b8=new JButton(".");


JButton b9=new JButton("9");

JButton b10=new JButton("6");

JButton b11=new JButton("3");

JButton b12=new JButton("+");

JButton b13=new JButton("-");

JButton b14=new JButton("*");


JButton b15=new JButton("/");

JButton b16=new JButton("=");

p1.setLayout(new BorderLayout());

p2.setLayout(new GridLayout(4,4));


p1.add(tf,"North");

p2.add(b1);
p2.add(b2);
p2.add(b3);

p2.add(b4);
p2.add(b5);
p2.add(b6);

p2.add(b7);
p2.add(b8);
p2.add(b9);

p2.add(b10);
p2.add(b11);
p2.add(b12);

p2.add(b13);
p2.add(b14);
p2.add(b15);

p2.add(b16);

p1.add(p2);

f.add(p1);


f.setSize(500,300);


f.setVisible(true);

}

}


