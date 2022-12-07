//=======slip 14_3 =========//


import java.awt.*;

import javax.swing.*;

public class slip14_3

{

JFrame f=new JFrame("Login window");

slip14_3()

{

JLabel l1=new JLabel("User Name");

JLabel l2=new JLabel("Password");

JTextField t1=new JTextField(20);

JTextField t2=new JPasswordField(20);

JButton login=new JButton("LOGIN");

JButton end=new JButton("REGISTER");


f.setLayout(new GridLayout(3,2));

f.add(l1);
f.add(t1);
f.add(l2);

f.add(t2);
f.add(login);
f.add(end);

f.setSize(400,150);

f.setVisible(true);

}

public static void main(String ar[])

{

slip14_3 a=new slip14_3();

}

}

