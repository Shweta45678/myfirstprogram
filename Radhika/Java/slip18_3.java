//=========== slip18_3 =========//


import javax.swing.*;

import java.awt.*;

class slip18_3

{

public static void main(String arg[])

{

JFrame f=new JFrame("panel");


JLabel l1=new JLabel("Font");

l1.setBounds(10,40,100,30);

String color[]={"Aril","Black","Red","Green","Gray"};

JComboBox cb1=new JComboBox(color);

cb1.setBounds(10,70,70,30);


JLabel l2=new JLabel("Size");

l2.setBounds(10,120,100,30);

String Size[]={"10","20","30","40","50"};

JComboBox cb2=new JComboBox(Size);

cb2.setBounds(10,150,70,30);


JTextField t=new JTextField();

t.setBounds(10,200,250,30);


JLabel l3=new JLabel("Style");

l3.setBounds(150,40,100,30);

JCheckBox b1=new JCheckBox("Bold");

b1.setBounds(150,70,100,30);

JCheckBox b2=new JCheckBox("Italic");

b2.setBounds(150,100,100,30);

JCheckBox b3=new JCheckBox("Underline");

b3.setBounds(150,130,100,30);




f.add(l1);
f.add(cb1);
f.add(l2);
f.add(cb2);

f.add(t);
f.add(l3);
f.add(b1);
f.add(b2);

f.add(b3);

f.setSize(300,300);

f.setLayout(null);

f.setVisible(true);

}

}
